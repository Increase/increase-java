// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundFundsHoldServiceTest {

    @Test
    fun callRelease() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundFundsHoldService = client.simulations().inboundFundsHolds()
        val simulationInboundFundsHoldReleaseResponse =
            inboundFundsHoldService.release(
                SimulationInboundFundsHoldReleaseParams.builder()
                    .inboundFundsHoldId("inbound_funds_hold_id")
                    .build()
            )
        println(simulationInboundFundsHoldReleaseResponse)
        simulationInboundFundsHoldReleaseResponse.validate()
    }
}
