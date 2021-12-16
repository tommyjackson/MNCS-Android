package com.mncs.networking.factory

import com.mncs.networking.calladapter.ResponseCallAdapterFactory
import com.mncs.networking.response.GenericErrorAdapterFactory
import com.mncs.networking.response.GenericResponseAdapterFactory
import com.mncs.networking.response.GenericResponseUnitJsonAdapter
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class NetworkFactory constructor(
    clientBuilder: () -> OkHttpClient.Builder = {
        OkHttpClient.Builder()
    }
) {

    internal val rootClient by lazy {
        clientBuilder().build()
    }

    private val rootMoshi: Moshi = Moshi.Builder()
        .add(GenericResponseUnitJsonAdapter)
        .add(GenericResponseAdapterFactory)
        .add(GenericErrorAdapterFactory)
        // add common adapters here
        .build()

    fun build(configuration: NetworkOptions.() -> Unit): Retrofit {
        val networkOptions = NetworkOptions(
            moshiBuilder = rootMoshi.newBuilder(),
        ).apply(configuration)

        require(!networkOptions.baseUrl.isNullOrBlank()) {
            """
                |You have not provided a base url.
                |
                |To add a base url to NetworkFactory:
                |
                |```
                |networkFactory.build {
                |    baseUrl("BASE_URL")
                |}
                |```
            """.trimIndent()
        }

        val baseUrl = networkOptions.baseUrl as String
        val builder = rootClient.newBuilder()

        builder.interceptors().addAll(networkOptions.interceptors)

        val client = builder.build()
        val moshi = networkOptions.moshiBuilder.build()

        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .addCallAdapterFactory(ResponseCallAdapterFactory(moshi))
            .client(client)
            .baseUrl(baseUrl)
            .build()
    }
}