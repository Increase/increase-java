// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardDisputeServiceTest {

    @Test
    fun callAction() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeService = client.simulations().cardDisputes()
        val cardDispute =
            cardDisputeService.action(
                SimulationCardDisputeActionParams.builder()
                    .cardDisputeId("card_dispute_id")
                    .status(SimulationCardDisputeActionParams.Status.ACCEPTED)
                    .explanation("x")
                    .build()
            )
        println(cardDispute)
        cardDispute.validate()
    }
}
