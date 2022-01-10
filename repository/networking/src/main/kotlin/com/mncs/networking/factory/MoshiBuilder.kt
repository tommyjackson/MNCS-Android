package com.mncs.networking.factory

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.adapters.EnumJsonAdapter
import java.lang.reflect.Type
import kotlin.reflect.KClass

class MoshiBuilder(
    private val builder: Moshi.Builder,
) {

    fun <T> add(type: Type, jsonAdapter: JsonAdapter<T>): MoshiBuilder {
        builder.add(type, jsonAdapter)
        return this
    }

    fun add(adapter: JsonAdapter.Factory): MoshiBuilder {
        builder.add(adapter)
        return this
    }

    fun add(adapter: Any): MoshiBuilder {
        builder.add(adapter)
        return this
    }

    fun <T : Enum<T>> addEnum(
        type: KClass<T>,
        fallbackValue: T,
    ): MoshiBuilder {
        builder.add(
            type.java,
            EnumJsonAdapter.create(type.java).withUnknownFallback(fallbackValue),
        )
        return this
    }
}
