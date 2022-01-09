package com.mncs.networking

import com.mncs.networking.di.NetworkModule
import com.mncs.networking.dummy.DummyManager
import com.mncs.networking.dummy.DummyService
import com.mncs.networking.factory.NetworkFactory
import com.mncs.networking.response.GenericError
import com.mncs.networking.data.Either
import com.mncs.networking.util.NetworkEither
import io.mockk.unmockkAll
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test

class DummyManagerTest {

    private val baseUrl = "/"

    private val mockWebServer = MockWebServer()
    private val httpUrl = mockWebServer.url(baseUrl)

    private lateinit var factory: NetworkFactory

    private lateinit var dummyService: DummyService
    private lateinit var dummyManager: DummyManager

    @Before
    fun setUp() {
        factory = NetworkFactory(
            clientBuilder = {
                NetworkModule.provideBuilder()
            }
        )

        dummyService = factory.build {
            baseUrl(httpUrl.toString())
        }.create(DummyService::class.java)

        dummyManager = DummyManager(dummyService)
    }

    @After
    fun tearDown() {
        unmockkAll()
    }

    @Test
    fun `ResponseCallAdapter handles data level response with meta`() = runBlocking {
        val expectedName = "Test"
        val expectedAge = 21

        val successfulResponse = MockResponse().setResponseCode(200).setBody(
            """
                {
                    "data":{
                        "name":"Test",
                        "age":21
                    },
                    "meta":{
                        "code":200
                    }
                }
            """.trimIndent()
        )

        mockWebServer.enqueue(successfulResponse)

        val actual = dummyManager.getDummyData()
        assert(actual is Either.Success)
        assert((actual as Either.Success).success.name == expectedName)
        assert(actual.success.age == expectedAge)
    }

    @Test
    fun `ResponseCallAdapter returns NetworkEither with metadata`() = runBlocking {
        val expectedName = "Test"
        val expectedAge = 21

        val successfulResponse = MockResponse().setResponseCode(200).setBody(
            """
                {
                    "data":{
                        "name":"Test",
                        "age":21
                    },
                    "meta":{
                        "code":200
                    }
                }
            """.trimIndent()
        )

        mockWebServer.enqueue(successfulResponse)

        val actual = dummyService.getDummyData()
        assert(actual is Either.Success)
        assert((actual as Either.Success).success.name == expectedName)
        assert(actual.success.age == expectedAge)
        assert(actual is NetworkEither)
        assert((actual as NetworkEither).metadata?.code == 200)
    }

    @Test
    fun `ResponseCallAdapter handles data level response without meta`() = runBlocking {
        val expectedName = "Test"
        val expectedAge = 21

        val successfulResponse = MockResponse().setResponseCode(200).setBody(
            """
                {
                    "data":{
                        "name":"Test",
                        "age":21
                    }
                }
            """.trimIndent()
        )

        mockWebServer.enqueue(successfulResponse)

        val actual = dummyManager.getDummyData()
        assert(actual is Either.Success)
        assert((actual as Either.Success).success.name == expectedName)
        assert(actual.success.age == expectedAge)
    }

    @Test
    fun `ResponseCallAdapter returns NetworkEither without metadata`() = runBlocking {
        val expectedName = "Test"
        val expectedAge = 21

        val successfulResponse = MockResponse().setResponseCode(200).setBody(
            """
                {
                    "data":{
                        "name":"Test",
                        "age":21
                    }
                }
            """.trimIndent()
        )

        mockWebServer.enqueue(successfulResponse)

        val actual = dummyService.getDummyData()
        assert(actual is Either.Success)
        assert((actual as Either.Success).success.name == expectedName)
        assert(actual.success.age == expectedAge)
        assert(actual is NetworkEither)
        // TODO for now this will be true, but will be changed to have metadata built from okhttp response
        assert((actual as NetworkEither).metadata == null)
    }

    @Test
    fun `ResponseCallAdapter handles top level response`() = runBlocking {
        val expectedName = "Test"
        val expectedAge = 21

        val successfulResponse = MockResponse().setResponseCode(200).setBody(
            """
                {
                    "name":"Test",
                    "age":21
                }
            """.trimIndent()
        )

        mockWebServer.enqueue(successfulResponse)

        val actual = dummyManager.getDummyData()
        assert(actual is Either.Success)
        assert((actual as Either.Success).success.name == expectedName)
        assert(actual.success.age == expectedAge)
    }

    @Test
    fun `ResponseCallAdapter handles custom generic error one`() = runBlocking {
        val expectedCode = 500
        val expectedMessage: String? = null
        val expectedPath = "Test"

        val errorResponse = MockResponse().setResponseCode(500).setBody(
            """
                {
                    "path":"Test",
                    "code":500
                }
            """.trimIndent()
        )

        mockWebServer.enqueue(errorResponse)

        val actual = dummyManager.getDummyData()
        assert(actual is Either.Failure)
        assert((actual as Either.Failure).failure.code == expectedCode)
        assert(actual.failure.message == expectedMessage)
        assert(actual.failure is GenericError.CustomErrorOne)
        assert((actual.failure as GenericError.CustomErrorOne).code == expectedCode)
        assert((actual.failure as GenericError.CustomErrorOne).message == expectedMessage)
        assert((actual.failure as GenericError.CustomErrorOne).path == expectedPath)
    }

    @Test
    fun `ResponseCallAdapter handles custom generic error two`() = runBlocking {
        val expectedCode = 500
        val expectedMessage = "How dare you."
        val expectedRuleViolation = "warning"

        val errorResponse = MockResponse().setResponseCode(500).setBody(
            """
                {
                    "meta":{
                        "code":500,
                        "rule_violation": "warning",
                        "message": "How dare you."
                    }
                }
            """.trimIndent()
        )

        mockWebServer.enqueue(errorResponse)

        val actual = dummyManager.getDummyData()
        assert(actual is Either.Failure)
        assert((actual as Either.Failure).failure.code == expectedCode)
        assert(actual.failure.message == expectedMessage)
        assert(actual.failure is GenericError.CustomErrorTwo)
        assert((actual.failure as GenericError.CustomErrorTwo).code == expectedCode)
        assert((actual.failure as GenericError.CustomErrorTwo).message == expectedMessage)
        assert((actual.failure as GenericError.CustomErrorTwo).ruleViolation == expectedRuleViolation)
    }

    @Test
    fun `ResponseCallAdapter handles Unit response with body success`() = runBlocking {

        val successfulResponse = MockResponse().setResponseCode(200).setBody(
            """
                {
                    "name":"Test",
                    "age":21
                }
            """.trimIndent()
        )

        mockWebServer.enqueue(successfulResponse)

        val actual = dummyManager.getEmptyDummyData()
        assert(actual is Either.Success<Unit>)
    }

    @Test
    fun `ResponseCallAdapter handles empty response success`() = runBlocking {

        val successfulResponse = MockResponse().setResponseCode(200)

        mockWebServer.enqueue(successfulResponse)

        val actual = dummyManager.getEmptyDummyData()
        assert(actual is Either.Success<Unit>)
    }

    @Test
    fun `ResponseCallAdapter handles Unit response with body failure`() = runBlocking {
        val errorResponse = MockResponse().setResponseCode(500).setBody(
            """
                {
                    "name":"Test",
                    "age":21
                }
            """.trimIndent()
        )
        mockWebServer.enqueue(errorResponse)
        val actual = dummyManager.getEmptyDummyData()
        assert(actual is Either.Failure)
    }

    @Test
    fun `ResponseCallAdapter handles empty response failure`() = runBlocking {
        val errorResponse = MockResponse().setResponseCode(500)
        mockWebServer.enqueue(errorResponse)
        val actual = dummyManager.getEmptyDummyData()
        assert(actual is Either.Failure)
    }
}