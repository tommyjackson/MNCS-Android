package com.mncs.initialization

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import dagger.multibindings.Multibinds
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class InitializerModule {

    @Multibinds
    abstract fun multibindsInitializers(): Set<@JvmSuppressWildcards Initializer>

    @Binds
    @IntoMap
    @InitializerKey(InitializerType.STUB)
    abstract fun bindStubInitializer(stubInitializer: StubInitializer): Initializer

    companion object {
        @Provides
        @Singleton
        fun providesInitializer(
            initializers: Map<InitializerType, @JvmSuppressWildcards Initializer>,
        ): Initializer {
            return AggregateInitializer(initializers.values.toSet())
        }
    }
}