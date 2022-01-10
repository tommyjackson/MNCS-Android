package com.mncs.networking.api.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TeamHistory(
    @Json(name = "team_id")
    val teamId: String,
    @Json(name = "date_left")
    val dateLeft: String?,
)
