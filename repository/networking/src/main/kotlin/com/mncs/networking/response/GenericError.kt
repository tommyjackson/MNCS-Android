package com.mncs.networking.response

import com.squareup.moshi.JsonClass
import java.io.IOException

sealed interface GenericError {
    val code: Int
    val message: String?

    // error scenario where entire response is error object
    @JsonClass(generateAdapter = true)
    data class CustomErrorOne(
        val path: String,
        override val code: Int,
        override val message: String? = null,
    ) : GenericError

    // error scenario where error object is behind "meta" key
    data class CustomErrorTwo(
        val ruleViolation: String?,
        override val code: Int,
        override val message: String? = null,
    ) : GenericError

    data class NetworkError(
        val error: IOException,
        override val code: Int,
        override val message: String? = null,
    ) : GenericError

    data class UnknownError(
        val error: Throwable,
        override val code: Int,
        override val message: String? = null,
    ) : GenericError
}
