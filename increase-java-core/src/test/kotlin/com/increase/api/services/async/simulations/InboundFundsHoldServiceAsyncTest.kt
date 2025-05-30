// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundFundsHoldServiceAsyncTest {

    @Test
    fun release() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundFundsHoldServiceAsync = client.simulations().inboundFundsHolds()

        val responseFuture =
            inboundFundsHoldServiceAsync.release("inbound_funds_hold_9vuasmywdo7xb3zt4071")

        val response = responseFuture.get()
        response.validate()
    }
}
