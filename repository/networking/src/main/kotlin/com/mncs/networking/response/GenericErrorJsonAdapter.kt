package com.mncs.networking.response

import com.mncs.networking.util.readObject
import com.mncs.networking.util.skipNameAndValue
import com.squareup.moshi.*
import java.lang.reflect.Type
import java.nio.charset.Charset

object GenericErrorAdapterFactory : JsonAdapter.Factory {

    override fun create(type: Type, annotations: MutableSet<out Annotation>, moshi: Moshi): JsonAdapter<*>? {
        val rawType = Types.getRawType(type)
        if (rawType == GenericError::class.java) {
            return GenericErrorAdapter(moshi)
        }
        return null
    }
}

class GenericErrorAdapter(
    private val moshi: Moshi,
) : JsonAdapter<GenericError>() {

    private val topLevelKeys = JsonReader.Options.of(METADATA_KEY)

    override fun fromJson(reader: JsonReader): GenericError? {

        // try and parse entire response as CustomErrorOne
        try {
            val customErrorAdapter = moshi.adapter(GenericError.CustomErrorOne::class.java)
            customErrorAdapter.fromJson(reader.peekJson())?.let {
                reader.skipValue()
                return it
            }
        } catch (_: JsonDataException) {
            // do nothing
        }

        var metadataJsonString: String? = null

        with(reader) {
            readObject {
                when (selectName(topLevelKeys)) {
                    0 -> {
                        metadataJsonString = nextSource().readString(Charset.defaultCharset())
                    }
                    -1 -> {
                        skipNameAndValue()
                    }
                }
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


        return metadata?.let {
            GenericError.CustomErrorTwo(
                ruleViolation = it.ruleViolation,
                message = it.message,
                code = it.code,
            )
        }
    }

    override fun toJson(writer: JsonWriter, value: GenericError?) {
        writer.jsonValue(value.toString())
    }

    companion object {
        private const val METADATA_KEY: String = "meta"
    }
}