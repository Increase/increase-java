// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.routingnumbers.RoutingNumberListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RoutingNumberServiceAsyncTest {

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routingNumberServiceAsync = client.routingNumbers()

        val pageFuture =
            routingNumberServiceAsync.list(
                RoutingNumberListParams.builder().routingNumber("xxxxxxxxx").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
