package com.mncs.networking.calladapter

import com.mncs.networking.util.Either
import com.mncs.networking.response.GenericError
import com.mncs.networking.response.GenericResponse
import com.squareup.moshi.Moshi
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Converter
import java.lang.reflect.Type

class ResponseCallAdapter<S : Any>(
    private val wrappedType: Type,
    private val successType: Type,
    private val errorBodyConverter: Converter<ResponseBody, GenericError>,
    private val moshi: Moshi,
) : CallAdapter<GenericResponse<S>, Call<Either<S, GenericError>>> {

    override fun responseType(): Type = wrappedType

    override fun adapt(call: Call<GenericResponse<S>>): Call<Either<S, GenericError>> {
        return ResponseCall(successType, call, errorBodyConverter, moshi)
    }
}