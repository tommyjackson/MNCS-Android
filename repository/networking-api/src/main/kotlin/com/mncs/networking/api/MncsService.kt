package com.mncs.networking.api

import retrofit2.Response
import retrofit2.http.GET

interface MncsService {

    @GET("v2/leagues")
    suspend fun getLeagues(): Response<League>
}