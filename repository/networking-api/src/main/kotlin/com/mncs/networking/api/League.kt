package com.mncs.networking.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class League(
    @Json(name = "current_season_id")
    val currentSeasonId: String,
    @Json(name = "current_week")
    val currentWeek: String,
    @Json(name = "_id")
    val id: String,
    @Json(name = "name")
    val name: String
)