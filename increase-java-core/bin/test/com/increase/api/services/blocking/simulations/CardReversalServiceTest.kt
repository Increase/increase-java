// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardReversalServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardReversalService = client.simulations().cardReversals()
        val cardPayment =
            cardReversalService.create(
                SimulationCardReversalCreateParams.builder()
                    .cardPaymentId("card_payment_id")
                    .amount(123L)
                    .build()
            )
        println(cardPayment)
        cardPayment.validate()
    }
}
