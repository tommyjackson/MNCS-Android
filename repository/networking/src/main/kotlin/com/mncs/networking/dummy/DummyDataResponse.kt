package com.mncs.networking.dummy

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DummyDataResponse(
    @Json(name = "name") val name: String,
    @Json(name = "age") val age: Int,
) {
    fun transform(): DummyData {
        return DummyData(
            name = name,
            age = age,
        )
    }
}
