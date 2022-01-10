package com.mncs.preferences.di

import com.mncs.preferences.definition.PreferencesManager
import com.mncs.preferences.implementation.PreferencesManagerImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class PreferencesModule {

    @Binds
    @Singleton
    internal abstract fun bindsPreferencesManager(
        preferencesManager: PreferencesManagerImpl,
    ): PreferencesManager
}
