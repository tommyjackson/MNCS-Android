package com.mncs.networking.util

import com.mncs.networking.response.Metadata

sealed interface NetworkEither {
    val metadata: Metadata?

    open class Success<S : Any?> internal constructor(
        override val success: S,
        override val metadata: Metadata? = null,
    ) : Either.Success<S>(success), NetworkEither

    open class Failure<F : Any?> internal constructor(
        override val failure: F,
        override val metadata: Metadata? = null,
    ) : Either.Failure<F>(failure), NetworkEither
}
