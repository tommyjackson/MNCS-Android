package com.mncs.networking.api.models

import com.mncs.data.model.League
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeagueResponse(
    @Json(name = "current_season_id")
    val currentSeasonId: String,
    @Json(name = "current_week")
    val currentWeek: String,
    @Json(name = "_id")
    val id: String,
    @Json(name = "name")
    val name: String,
) {

    fun transform(): League {
        return League(
            id = currentSeasonId,
            name = name,
        )
    }
}
