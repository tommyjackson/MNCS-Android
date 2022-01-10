package com.mncs.networking.api.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PlayerGameResponse(
    @Json(name = "hits")
    val playerHitResponses: List<PlayerHitResponse>?,
    @Json(name = "returned")
    val returned: Int?,
    @Json(name = "total")
    val total: Int?,
)
