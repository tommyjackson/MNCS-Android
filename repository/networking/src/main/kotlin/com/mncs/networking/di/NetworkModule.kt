package com.mncs.networking.di

import com.mncs.networking.factory.NetworkFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class NetworkModule {

    companion object {

        @Provides
        @Singleton
        fun provideBuilder(): OkHttpClient.Builder {
            return OkHttpClient.Builder().retryOnConnectionFailure(true)
        }

        @Provides
        @Singleton
        fun provideNetworkFactory(
            builder: OkHttpClient.Builder,
        ): NetworkFactory {
            return NetworkFactory(
                clientBuilder = { builder },
            )
        }
    }
}