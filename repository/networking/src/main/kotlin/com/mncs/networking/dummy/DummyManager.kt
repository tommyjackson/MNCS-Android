package com.mncs.networking.dummy

import com.mncs.networking.util.Either
import com.mncs.networking.response.GenericError
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DummyManager @Inject constructor(
    private val dummyService: DummyService,
) {

    suspend fun getDummyData(): Either<DummyData, GenericError> {

        return when (val dummyDataResponse = dummyService.getDummyData()) {
            is Either.Success -> {
                Either.success(dummyDataResponse.success.transform())
            }
            is Either.Failure -> {
                Either.failure(dummyDataResponse.failure)
            }
        }
    }

    suspend fun getEmptyDummyData(): Either<Unit, GenericError> {

        return when (val dummyDataResponse = dummyService.getEmptyDummyData()) {
            is Either.Success -> {
                Either.success(dummyDataResponse.success)
            }
            is Either.Failure -> {
                Either.failure(dummyDataResponse.failure)
            }
        }
    }
}