package com.mncs.repository

import com.mncs.data.model.League
import com.mncs.networking.api.MncsManager
import com.mncs.storage.api.MncsStorage
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MncsRepository @Inject constructor(
    private val mncsManager: MncsManager,
    private val mncsStorage: MncsStorage,
) {

    suspend fun getLeagues(forceRemote: Boolean = false): List<League> {
        return if (forceRemote) {
            val remote = mncsManager.getLeagues()
            mncsStorage.storeLeagues(remote)
            remote
        } else {
            val currentTime = System.currentTimeMillis()
            val local = mncsStorage.getLeagues()

            val stale = local.firstOrNull { currentTime - it.modifiedAt > leagueStaleAfterMillis }

            if (stale != null) {
                val remote = mncsManager.getLeagues()
                mncsStorage.storeLeagues(remote)
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
