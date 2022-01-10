package com.mncs.networking.api.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SeasonResponse(
    @Json(name = "_id")
    val id: String,
    @Json(name = "league")
    val league: LeagueResponse?,
    @Json(name = "name")
    val name: String,
    @Json(name = "players")
    val playerResponses: List<PlayerResponse>,
    @Json(name = "teams")
    val teamResponses: List<TeamResponse>,
)
