// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.routingnumbers.RoutingNumberListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RoutingNumberServiceTest {

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routingNumberService = client.routingNumbers()

        val page =
            routingNumberService.list(
                RoutingNumberListParams.builder().routingNumber("xxxxxxxxx").build()
            )

        page.response().validate()
    }
}
