// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WireDrawdownRequestServiceTest {

    @Test
    fun refuse() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestService = client.simulations().wireDrawdownRequests()

        val wireDrawdownRequest =
            wireDrawdownRequestService.refuse("wire_drawdown_request_q6lmocus3glo0lr2bfv3")

        wireDrawdownRequest.validate()
    }

    @Test
    fun submit() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestService = client.simulations().wireDrawdownRequests()

        val wireDrawdownRequest =
            wireDrawdownRequestService.submit("wire_drawdown_request_q6lmocus3glo0lr2bfv3")

        wireDrawdownRequest.validate()
    }
}
