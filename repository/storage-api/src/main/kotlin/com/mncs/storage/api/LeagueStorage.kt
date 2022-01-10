package com.mncs.storage.api

import com.mncs.data.model.League
import com.mncs.storage.dao.LeagueDao
import com.mncs.storage.entity.LeagueEntity
import javax.inject.Inject

class LeagueStorage @Inject constructor(
    private val leagueDao: LeagueDao,
) {

    suspend fun getLeagues(): List<LeagueEntity> {
        return leagueDao.getAll()
    }

    suspend fun storeLeagues(leagues: List<League>) {
        val currentTime = System.currentTimeMillis()
    }
}