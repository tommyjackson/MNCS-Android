package com.mncs.networking.api

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class MncsAuthInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder: Request.Builder = chain.request().newBuilder()
        requestBuilder.header("x-api-key", apiKey)
        return chain.proceed(requestBuilder.build())
    }

    companion object {
        private const val apiKey = "DCGq89SN9z3zLwMpvOdNn6sPAVZccZfI1mE7BSGX"
    }
}