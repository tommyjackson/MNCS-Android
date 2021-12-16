package com.mncs.networking.util

import com.mncs.networking.response.Metadata

/**
 * A wrapper around [Either] that contains optional [Metadata] from a network call
 *
 * Manager classes can still do
 * ```
 * when (response) {
 *     is Either.Success -> { /* ... */ }
 *     is Either.Failure -> { /* ... */ }
 * }
 * ```
 * but they can also add an extra check like
 * ```
 * if (response is NetworkEither) {
 *     val metadata = response.metadata
 * }
 * ```
 * for extra info about the call if necessary
 */
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
