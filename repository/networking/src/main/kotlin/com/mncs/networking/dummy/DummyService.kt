package com.mncs.networking.dummy

import com.mncs.networking.response.NetworkResponse
import retrofit2.http.GET

interface DummyService {

    @GET("dummydata")
    suspend fun getDummyData(): NetworkResponse<DummyDataResponse>

    @GET("dummydataempty")
    suspend fun getEmptyDummyData(): NetworkResponse<Unit>
}
