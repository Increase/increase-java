package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.RoutingNumberListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RoutingNumberServiceTest {

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val routingNumberService = client.routingNumbers()
        val routingNumberList =
            routingNumberService.list(
                RoutingNumberListParams.builder().routingNumber("xxxxxxxxx").build()
            )
        println(routingNumberList)
        routingNumberList.data().forEach { it.validate() }
    }
}
