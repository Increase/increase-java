// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundFundsHoldServiceTest {

    @Test
    fun release() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundFundsHoldService = client.simulations().inboundFundsHolds()

        val response =
            inboundFundsHoldService.release(
                InboundFundsHoldReleaseParams.builder()
                    .inboundFundsHoldId("inbound_funds_hold_9vuasmywdo7xb3zt4071")
                    .build()
            )

        response.validate()
    }
}
