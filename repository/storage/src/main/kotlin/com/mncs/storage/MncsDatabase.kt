package com.mncs.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mncs.storage.dao.LeagueDao
import com.mncs.storage.entity.LeagueEntity

@Database(entities = [LeagueEntity::class], version = 1)
abstract class MncsDatabase : RoomDatabase() {

    abstract fun leagueDao(): LeagueDao
}
