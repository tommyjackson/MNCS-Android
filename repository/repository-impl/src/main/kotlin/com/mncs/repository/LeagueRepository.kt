package com.mncs.repository

import com.mncs.data.model.League
import com.mncs.networking.api.league.LeagueManager
import com.mncs.storage.api.LeagueStorage
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LeagueRepository @Inject constructor(
    private val leagueManager: LeagueManager,
    private val leagueStorage: LeagueStorage,
) {

    suspend fun getLeagues(forceRemote: Boolean = false): List<League> {
        return if (forceRemote) {
            val remote = leagueManager.getLeagues()
            leagueStorage.storeLeagues(remote)
            remote
        } else {
            val currentTime = System.currentTimeMillis()
            val local = leagueStorage.getLeagues()

            val stale = local.firstOrNull { currentTime - it.modifiedAt > leagueStaleAfterMillis }

            if (stale != null) {
                val remote = leagueManager.getLeagues()
                leagueStorage.storeLeagues(remote)
                remote
            } else {
                local.map { it.transform() }
            }
        }
    }

    companion object {
        private const val leagueStaleAfterMillis: Long = 10000L
    }
}