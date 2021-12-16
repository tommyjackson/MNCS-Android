package com.mncs.networking.response

import com.squareup.moshi.*

object GenericResponseUnitJsonAdapter {

    @FromJson
    fun fromJson(reader: JsonReader): GenericResponse<Unit> {
        reader.skipValue()
        return GenericResponse.EmptyResponse
    }

    @ToJson
    fun toJson(writer: JsonWriter, value: GenericResponse<Unit>?) {
        writer.jsonValue(value.toString())
    }
}