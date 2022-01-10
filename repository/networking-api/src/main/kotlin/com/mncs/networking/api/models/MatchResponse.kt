package com.mncs.networking.api.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MatchResponse(
    @Json(name = "_id")
    val id: String,
    @Json(name = "status")
    val status: String,
    @Json(name = "team_ids")
    val teamIds: List<String>,
    @Json(name = "week")
    val week: Int,
    @Json(name = "season")
    val seasonResponse: PopulateSeasonResponse,
    @Transient val teamOneName: String? = null, // ignored as these are not set by the server but we populate them
    @Transient val teamTwoName: String? = null,
)
