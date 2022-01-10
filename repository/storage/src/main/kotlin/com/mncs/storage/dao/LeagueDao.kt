package com.mncs.storage.dao

import androidx.room.*
import com.mncs.storage.entity.LeagueEntity

@Dao
interface LeagueDao {
    @Query("SELECT * FROM league")
    suspend fun getAll(): List<LeagueEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(leagueEntity: LeagueEntity)

    suspend fun insertWithTimestamp(leagueEntity: LeagueEntity) {
        insert(
            leagueEntity.copy(
                modifiedAt = System.currentTimeMillis(),
            )
        )
    }

    @Query("SELECT * FROM league WHERE uid IN (:leagueIds)")
    suspend fun loadAllByIds(leagueIds: IntArray): List<LeagueEntity>

    @Query("SELECT * FROM league WHERE name LIKE :name LIMIT 1")
    suspend fun findByName(name: String): LeagueEntity

    @Delete
    suspend fun delete(leagueEntity: LeagueEntity)
}
