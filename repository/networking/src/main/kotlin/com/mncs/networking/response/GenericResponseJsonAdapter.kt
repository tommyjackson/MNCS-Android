package com.mncs.networking.response

import com.mncs.networking.util.readObject
import com.mncs.networking.util.skipNameAndValue
import com.squareup.moshi.*
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.nio.charset.Charset

object GenericResponseAdapterFactory : JsonAdapter.Factory {

    override fun create(type: Type, annotations: MutableSet<out Annotation>, moshi: Moshi): JsonAdapter<*>? {
        val rawType = Types.getRawType(type)
        if (rawType == GenericResponse::class.java && type is ParameterizedType) {
            val subType = type.actualTypeArguments.first()
            val adapter: JsonAdapter<Any> = moshi.adapter(subType)
            return GenericResponseAdapter(adapter, moshi)
        }
        return null
    }
}

class GenericResponseAdapter<T : Any>(
    private val adapter: JsonAdapter<T>,
    private val moshi: Moshi,
) : JsonAdapter<GenericResponse<T>>() {

    private val topLevelKeys = JsonReader.Options.of(DATA_KEY, METADATA_KEY)

    override fun fromJson(reader: JsonReader): GenericResponse<T>? {

        // try and parse entire response as T
        try {
            adapter.fromJson(reader.peekJson())?.let {
                reader.skipValue()
                return GenericResponse.ResponseWithoutMeta(it)
            }
        } catch (_: JsonDataException) {
            // do nothing
        }

        var dataJsonString: String? = null
        var metadataJsonString: String? = null

        with(reader) {
            readObject {
                when (selectName(topLevelKeys)) {
                    0 -> {
                        // If "data" isn't null, this will throw and then we
                        // can safely assume a non-null value and proceed.
                        try {
                            nextNull<Any>()
                        } catch (_: JsonDataException) {
                            dataJsonString = nextSource().readString(Charset.defaultCharset())
                        }
                    }
                    1 -> {
                        metadataJsonString = nextSource().readString(Charset.defaultCharset())
                    }
                    -1 -> {
                        skipNameAndValue()
                    }
                }
            }
        }

        // try and parse dataJsonString as T
        val data: T? = dataJsonString?.let { dataString ->
            try {
                adapter.fromJson(dataString)
            } catch (e: JsonDataException) {
                null
            }
        }

        // try and parse metadataJsonString as Metadata
        val metadata: Metadata? = metadataJsonString?.let { metadataString ->
            try {
                val metadataAdapter = moshi.adapter(Metadata::class.java)
                metadataAdapter.fromJson(metadataString)
            } catch (e: JsonDataException) {
                null
            }
        }

        return if (data != null) {
            if (metadata != null) {
                GenericResponse.ResponseWithMeta(
                    data = data,
                    metadata = metadata,
                )
            } else {
                GenericResponse.ResponseWithoutMeta(
                    data = data,
                )
            }
        } else {
            if (metadata != null) {
                GenericResponse.ResponseJustMeta(
                    metadata = metadata,
                )
            } else {
                null
            }
        }
    }

    override fun toJson(writer: JsonWriter, value: GenericResponse<T>?) {
        writer.jsonValue(value.toString())
    }

    companion object {
        private const val DATA_KEY: String = "data"
        private const val METADATA_KEY: String = "meta"
    }
}
