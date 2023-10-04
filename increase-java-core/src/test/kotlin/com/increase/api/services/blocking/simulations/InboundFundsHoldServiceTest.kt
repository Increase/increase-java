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
                .apiKey("test-api-key")
                .build()
        val inboundFundsHoldService = client.simulations().inboundFundsHolds()
        val inboundFundsHoldReleaseResponse =
            inboundFundsHoldService.release(
                SimulationInboundFundsHoldReleaseParams.builder()
                    .inboundFundsHoldId("string")
                    .build()
            )
        println(inboundFundsHoldReleaseResponse)
        inboundFundsHoldReleaseResponse.validate()
    }
}
