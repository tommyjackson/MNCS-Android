package com.mncs.networking.api

import com.mncs.data.model.League
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MncsManager @Inject constructor(
    private val mncsService: MncsService,
) {

    suspend fun getLeagues(): List<League> {
        return mncsService.getLeagues().body()?.map {
            it.transform()
        } ?: emptyList()
    }
}
