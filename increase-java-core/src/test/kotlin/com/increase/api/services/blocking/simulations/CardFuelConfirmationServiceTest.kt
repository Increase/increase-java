// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.cardfuelconfirmations.CardFuelConfirmationCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardFuelConfirmationServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardFuelConfirmationService = client.simulations().cardFuelConfirmations()

        val cardPayment =
            cardFuelConfirmationService.create(
                CardFuelConfirmationCreateParams.builder()
                    .amount(5000L)
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .build()
            )

        cardPayment.validate()
    }
}
