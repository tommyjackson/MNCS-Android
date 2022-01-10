package com.mncs.networking.api.league

import com.mncs.data.model.League
import com.mncs.networking.api.MncsService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LeagueManager @Inject constructor(
    private val mncsService: MncsService,
) {

    suspend fun getLeagues(): List<League> {
        return mncsService.getLeagues().body()?.map {
            it.transform()
        } ?: emptyList()
    }
}