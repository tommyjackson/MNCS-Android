package com.mncs.networking.calladapter

import com.mncs.networking.util.Either
import com.mncs.networking.util.NetworkEither
import com.mncs.networking.response.GenericError
import com.mncs.networking.response.GenericResponse
import com.squareup.moshi.Moshi
import okhttp3.Request
import okhttp3.ResponseBody
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Converter
import retrofit2.Response
import java.io.IOException
import java.lang.RuntimeException
import java.lang.reflect.Type

internal class ResponseCall<S : Any>(
    private val successType: Type,
    private val delegate: Call<GenericResponse<S>>,
    private val errorBodyConverter: Converter<ResponseBody, GenericError>,
    private val moshi: Moshi,
) : Call<Either<S, GenericError>> {

    @Suppress("UNCHECKED_CAST")
    override fun enqueue(callback: Callback<Either<S, GenericError>>) {
        return delegate.enqueue(object : Callback<GenericResponse<S>> {
            override fun onResponse(call: Call<GenericResponse<S>>, response: Response<GenericResponse<S>>) {
                val body = response.body()
                val code = response.code()
                val error = response.errorBody()

                if (response.isSuccessful) {
                    if (body != null) {
                        when (body) {
                            is GenericResponse.ResponseWithMeta -> {
                                callback.onResponse(
                                    this@ResponseCall,
                                    Response.success(NetworkEither.Success(body.data, body.metadata)),
                                )
                            }
                            is GenericResponse.ResponseWithoutMeta -> {
                                callback.onResponse(
                                    this@ResponseCall,
                                    Response.success(NetworkEither.Success(body.data)),
                                )
                            }
                            is GenericResponse.ResponseJustMeta -> {
                                // this should be an error state since body can't be null unless the
                                // return type is Unit, in which case this would end up in EmptyResponse
                                // TODO wrap exception with message like "Did you mean to return Unit?"
                                callback.onResponse(
                                    this@ResponseCall,
                                    Response.success(
                                        NetworkEither.Failure(GenericError.UnknownError(
                                        code = code,
                                        message = body.metadata.message,
                                        error = RuntimeException(),
                                    ), body.metadata))
                                )
                            }
                            is GenericResponse.EmptyResponse -> {
                                // TODO comment explaining the forced cast
                                if (successType == Unit::class.java) {
                                    callback.onResponse(
                                        this@ResponseCall,
                                        Response.success(NetworkEither.Success(Unit as S)),
                                    )
                                } else {
                                    // This should never get here, but return error just in case
                                    // TODO custom message?
                                    callback.onResponse(
                                        this@ResponseCall,
                                        Response.success(
                                            NetworkEither.Failure(GenericError.UnknownError(
                                            code = code,
                                            message = null,
                                            error = RuntimeException(),
                                        )))
                                    )
                                }
                            }
                        }
                    } else {
                        // Response is successful but the body is null
                        // TODO custom message? add metadata?
                        callback.onResponse(
                            this@ResponseCall,
                            Response.success(
                                NetworkEither.Failure(GenericError.UnknownError(
                                code = code,
                                message = null,
                                error = RuntimeException(),
                            )))
                        )
                    }
                } else {
                    val errorBody = if (error == null || error.contentLength() == 0L) {
                        null
                    } else {
                        try {
                            errorBodyConverter.convert(error)
                        } catch (ex: Exception) {
                            null
                        }
                    }
                    // TODO custom message? add metadata?
                    if (errorBody != null) {
                        callback.onResponse(
                            this@ResponseCall,
                            Response.success(NetworkEither.Failure(errorBody))
                        )
                    } else {
                        // TODO custom message? add metadata?
                        callback.onResponse(
                            this@ResponseCall,
                            Response.success(
                                NetworkEither.Failure(GenericError.UnknownError(
                                code = code,
                                message = null,
                                error = RuntimeException(),
                            )))
                        )
                    }
                }
            }

            override fun onFailure(call: Call<GenericResponse<S>>, throwable: Throwable) {
                // TODO what should these errors look like? add metadata?
                val networkResponse = when (throwable) {
                    is IOException -> {
                        GenericError.NetworkError(
                            code = 500,
                            message = null,
                            error = throwable,
                        )
                    }
                    else -> {
                        GenericError.UnknownError(
                            code = 500,
                            message = null,
                            error = throwable,
                        )
                    }
                }
                callback.onResponse(this@ResponseCall, Response.success(NetworkEither.Failure(networkResponse)))
            }
        })
    }

    override fun isExecuted(): Boolean {
        return delegate.isExecuted
    }

    override fun clone(): ResponseCall<S> {
        return ResponseCall(successType, delegate.clone(), errorBodyConverter, moshi)
    }

    override fun isCanceled(): Boolean {
        return delegate.isCanceled
    }

    override fun cancel() {
        delegate.cancel()
    }

    override fun execute(): Response<Either<S, GenericError>> {
        throw UnsupportedOperationException("ResponseCall doesn't support execute")
    }

    override fun request(): Request {
        return delegate.request()
    }

    override fun timeout(): Timeout {
        return delegate.timeout()
    }
}