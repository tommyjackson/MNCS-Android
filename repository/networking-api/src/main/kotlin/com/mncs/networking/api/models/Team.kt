package com.mncs.networking.api.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Team(
    @Json(name = "discord_id")
    val discordId: String,
    @Json(name = "hex_color")
    val hexColor: String,
    @Json(name = "_id")
    val id: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "avatar")
    val avatar: String?,
    @Json(name = "league")
    val league: String?,
) {

    fun getColor(): String {
        return if(hexColor.startsWith("#"))  {
            hexColor
        } else {
            "#".plus(hexColor)
        }
    }
}