package com.mncs.networking.api.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TeamGameResponse(
    @Json(name = "hits")
    val teamHitResponses: List<TeamHitResponses>?,
    @Json(name = "returned")
    val returned: Int?,
    @Json(name = "total")
    val total: Int?,
)
