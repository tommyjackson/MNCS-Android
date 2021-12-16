package com.mncs.networking.response

import com.squareup.moshi.*
import java.io.EOFException

object GenericResponseUnitJsonAdapter {

    @FromJson
    fun fromJson(reader: JsonReader): GenericResponse<Unit> {
        try {
            reader.skipValue()
        } catch (_: EOFException) {
            // do nothing, we allow empty responses for Unit return type
        }
        return GenericResponse.EmptyResponse
    }

    @ToJson
    fun toJson(writer: JsonWriter, value: GenericResponse<Unit>?) {
        writer.jsonValue(value.toString())
    }
}