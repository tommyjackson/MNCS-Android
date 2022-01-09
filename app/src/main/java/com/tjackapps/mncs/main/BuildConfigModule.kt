package com.tjackapps.mncs.main

import com.mncs.buildconfig.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class BuildConfigModule {

    @Singleton
    @Provides
    fun provideBuildConfig(): BuildConfig {
        return BuildConfig(
            versionName = com.tjackapps.mncs.BuildConfig.VERSION_NAME,
            debug = com.tjackapps.mncs.BuildConfig.DEBUG,
        )
    }
}
