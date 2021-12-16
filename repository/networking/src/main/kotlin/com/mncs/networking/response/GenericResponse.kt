package com.mncs.networking.response

sealed interface GenericResponse<T> {
    val data: T?

    data class ResponseWithMeta<T>(
        override val data: T,
        val metadata: Metadata,
    ) : GenericResponse<T>

    data class ResponseWithoutMeta<T>(
        override val data: T,
    ) : GenericResponse<T>

    data class ResponseJustMeta<T>(
        override val data: T? = null,
        val metadata: Metadata,
    ) : GenericResponse<T>

    object EmptyResponse : GenericResponse<Unit> {
        override val data: Unit? = null
    }
}
