package com.mncs.dev.tools.impl

import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor
import com.facebook.flipper.plugins.network.NetworkFlipperPlugin
import com.mncs.initialization.Initializer
import com.mncs.initialization.InitializerKey
import com.mncs.initialization.InitializerType
import com.mncs.networking.interceptors.DebugInterceptors
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import okhttp3.Interceptor
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DevToolsImplModule {

    @Binds
    @IntoMap
    @InitializerKey(InitializerType.FLIPPER)
    abstract fun bindFlipperInitializer(flipperInitializer: FlipperInitializer): Initializer

    companion object {
        @Provides
        @Singleton
        @IntoSet
        @DebugInterceptors
        fun providesFlipperOkhttpInterceptor(networkFlipperPlugin: NetworkFlipperPlugin): Interceptor {
            return FlipperOkhttpInterceptor(networkFlipperPlugin, true)
        }

        @Provides
        @Singleton
        fun providesNetworkFlipperPlugin(): NetworkFlipperPlugin {
            return NetworkFlipperPlugin()
        }
    }
}
