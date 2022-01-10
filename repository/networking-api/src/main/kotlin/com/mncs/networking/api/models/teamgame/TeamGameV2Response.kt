package com.mncs.networking.api.models.teamgame

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TeamGameV2Response(
    @Json(name = "hits")
    val hits: List<Hit>?,
    @Json(name = "returned")
    val returned: Int?,
    @Json(name = "total")
    val total: Int?,
)