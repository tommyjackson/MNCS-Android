package com.mncs.networking.di

import com.mncs.buildconfig.BuildConfig
import com.mncs.networking.factory.NetworkFactory
import com.mncs.networking.interceptors.DebugInterceptors
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
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
            buildConfig: BuildConfig,
            @DebugInterceptors debugInterceptors: Set<@JvmSuppressWildcards Interceptor>,
        ): NetworkFactory {
            return NetworkFactory(
                debugInterceptors = debugInterceptors,
                buildConfig = buildConfig,
                clientBuilder = { builder },
            )
        }
    }
}
