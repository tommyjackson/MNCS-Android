package com.mncs.networking.api.models.playergame

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PlayerGameV2Response(
    @Json(name = "hits")
    val hits: List<Hit>?,
    @Json(name = "returned")
    val returned: Int?,
    @Json(name = "total")
    val total: Int?,
)