package com.mncs.networking.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Metadata(
    @Json(name = "code") val code: Int,
    @Json(name = "message") val message: String?,
    @Json(name = "rule_violation") val ruleViolation: String?,
)
