package com.mncs.networking.api.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
@JsonClass(generateAdapter = true)
data class PopulateSeason(
    @Json(name = "_id")
    val id: String,
)