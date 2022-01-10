package com.mncs.storage

import android.content.Context
import androidx.room.Room
import com.mncs.storage.dao.LeagueDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
internal object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): MncsDatabase {
        return Room.databaseBuilder(
            context,
            MncsDatabase::class.java,
            "mncs-storage",
        ).build()
    }

    @Provides
    fun provideLeagueDao(database: MncsDatabase): LeagueDao {
        return database.leagueDao()
    }
}