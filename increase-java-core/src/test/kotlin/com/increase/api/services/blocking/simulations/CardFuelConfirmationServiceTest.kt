// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.SimulationCardFuelConfirmationCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardFuelConfirmationServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardFuelConfirmationService = client.simulations().cardFuelConfirmations()
        val cardPayment =
            cardFuelConfirmationService.create(
                SimulationCardFuelConfirmationCreateParams.builder()
                    .amount(1L)
                    .cardPaymentId("card_payment_id")
                    .build()
            )
        println(cardPayment)
        cardPayment.validate()
    }
}
