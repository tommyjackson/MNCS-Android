package com.mncs.networking.api.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Player(
    @Json(name = "discord_id")
    val discordId: String?,
    @Json(name = "_id")
    val id: String,
    @Json(name = "screen_name")
    val screenName: String,
    @Json(name = "team_history")
    val teamHistory: List<TeamHistory>?,
)
