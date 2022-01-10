package com.mncs.networking.api

import com.mncs.networking.api.league.response.LeagueResponse
import retrofit2.Response
import retrofit2.http.GET

interface MncsService {

    @GET("v2/leagues")
    suspend fun getLeagues(): Response<List<LeagueResponse>>
}
