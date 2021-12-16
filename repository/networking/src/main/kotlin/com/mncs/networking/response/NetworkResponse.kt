package com.mncs.networking.response

import com.mncs.networking.util.Either

typealias NetworkResponse <T> = Either<T, GenericError>