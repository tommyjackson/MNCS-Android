package com.mncs.networking.api

import com.mncs.networking.factory.NetworkFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkingApiModule {

    @Provides
    fun provideMncsService(
        networkFactory: NetworkFactory,
    ): MncsService {
        return networkFactory.build {
            baseUrl(baseUrl)
            addInterceptor(MncsAuthInterceptor())
        }.create(MncsService::class.java)
    }

    private const val baseUrl = "https://cfb2ensmt0.execute-api.us-east-1.amazonaws.com/prod/"
}