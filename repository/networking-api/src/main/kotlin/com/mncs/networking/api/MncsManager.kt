package com.mncs.networking.api

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MncsManager @Inject constructor(
    private val mncsService: MncsService,
) {

    suspend fun getLeagues(): Boolean {
        val response = mncsService.getLeagues()
        return true
    }

}