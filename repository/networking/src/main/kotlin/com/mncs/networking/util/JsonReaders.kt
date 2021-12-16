package com.mncs.networking.util

import com.squareup.moshi.JsonReader

inline fun JsonReader.readObject(process: () -> Unit) {
    beginObject()
    while (hasNext()) {
        process()
    }
    endObject()
}

fun JsonReader.skipNameAndValue() {
    skipName()
    skipValue()
}