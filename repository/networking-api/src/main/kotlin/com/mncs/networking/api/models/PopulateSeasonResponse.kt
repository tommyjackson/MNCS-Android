package com.mncs.networking.api.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
@JsonClass(generateAdapter = true)
data class PopulateSeasonResponse(
    @Json(name = "_id")
    val id: String,
)
