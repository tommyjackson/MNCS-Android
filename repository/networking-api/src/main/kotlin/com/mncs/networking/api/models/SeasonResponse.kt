package com.mncs.networking.api.models

import com.mncs.networking.api.league.response.LeagueResponse
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
    val players: List<Player>,
    @Json(name = "teams")
    val teams: List<Team>,
)