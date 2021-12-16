package com.mncs.networking.calladapter

import com.mncs.networking.util.Either
import com.mncs.networking.response.GenericError
import com.mncs.networking.response.GenericResponse
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

class ResponseCallAdapterFactory(
    private val moshi: Moshi,
) : CallAdapter.Factory() {

    override fun get(
        returnType: Type,
        annotations: Array<Annotation>,
        retrofit: Retrofit,
    ): CallAdapter<*, *>? {

        // suspend functions wrap the response type in `Call`
        if (Call::class.java != getRawType(returnType)) {
            // if not a suspend function, return null since this adapter won't handle it
            return null
        }

        // check first that the return type is `ParameterizedType`
        check(returnType is ParameterizedType) {
            "Return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>"
        }

        // get the response type inside the `Call` type
        val responseType = getParameterUpperBound(0, returnType)

        // if the response type isn't Either then we can't handle this type, so we return null
        if (getRawType(responseType) != Either::class.java) {
            return null
        }

        // the response type is NetworkResponse and should be parameterized
        check(responseType is ParameterizedType) {
            "Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>"
        }

        // get the parameterized return type within NetworkResponse<Foo>, i.e. type of Foo
        val successType = getParameterUpperBound(0, responseType)

        // wrap success type in GenericResponse
        val fullType = Types.newParameterizedType(GenericResponse::class.java, successType)

        // get the failure type, which should always be GenericError
        val errorBodyType = getParameterUpperBound(1, responseType)

        check(errorBodyType != GenericError::class) {
            "Error type must be GenericError"
        }

        val errorBodyConverter =
            retrofit.nextResponseBodyConverter<GenericError>(null, errorBodyType, annotations)

        return ResponseCallAdapter<Any>(fullType, successType, errorBodyConverter, moshi)
    }
}