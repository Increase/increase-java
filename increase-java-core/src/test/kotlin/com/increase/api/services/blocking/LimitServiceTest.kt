package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.LimitListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LimitServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val limitService = client.limits()
        val limit =
            limitService.create(
                LimitCreateParams.builder()
                    .metric(LimitCreateParams.Metric.COUNT)
                    .interval(LimitCreateParams.Interval.TRANSACTION)
                    .modelId("x")
                    .value(123L)
                    .build()
            )
        println(limit)
        limit.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val limitService = client.limits()
        val limit = limitService.retrieve(LimitRetrieveParams.builder().limitId("string").build())
        println(limit)
        limit.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val limitService = client.limits()
        val limit =
            limitService.update(
                LimitUpdateParams.builder()
                    .limitId("string")
                    .status(LimitUpdateParams.Status.INACTIVE)
                    .build()
            )
        println(limit)
        limit.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val limitService = client.limits()
        val limitList = limitService.list(LimitListParams.builder().build())
        println(limitList)
        limitList.data().forEach { it.validate() }
    }
}
