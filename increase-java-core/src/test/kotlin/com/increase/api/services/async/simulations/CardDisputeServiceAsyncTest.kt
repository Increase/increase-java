// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.SimulationCardDisputeActionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardDisputeServiceAsyncTest {

    @Test
    fun action() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeServiceAsync = client.simulations().cardDisputes()

        val cardDisputeFuture =
            cardDisputeServiceAsync.action(
                SimulationCardDisputeActionParams.builder()
                    .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                    .status(SimulationCardDisputeActionParams.Status.PENDING_USER_INFORMATION)
                    .explanation("This was a valid recurring transaction")
                    .build()
            )

        val cardDispute = cardDisputeFuture.get()
        cardDispute.validate()
    }
}
