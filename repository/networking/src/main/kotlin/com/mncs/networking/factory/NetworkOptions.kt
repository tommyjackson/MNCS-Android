package com.mncs.networking.factory

import com.squareup.moshi.Moshi
import okhttp3.Interceptor

class NetworkOptions(
    internal val moshiBuilder: Moshi.Builder,
) {
    internal var baseUrl: String? = null
    internal val interceptors: MutableList<Interceptor> = mutableListOf()

    fun baseUrl(baseUrl: String) {
        this.baseUrl = baseUrl
    }

    fun addInterceptor(interceptor: Interceptor) {
        interceptors.add(interceptor)
    }

    fun configureMoshi(configuration: MoshiBuilder.() -> Unit) {
        MoshiBuilder(
            builder = moshiBuilder
        ).apply(configuration)
    }
}
