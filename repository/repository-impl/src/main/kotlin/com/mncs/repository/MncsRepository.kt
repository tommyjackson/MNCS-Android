package com.mncs.repository

import com.mncs.networking.api.MncsManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MncsRepository @Inject constructor(
    private val mncsManager: MncsManager,
) {

    suspend fun getLeagues(): Boolean {
        mncsManager.getLeagues()
        return true
    }
}