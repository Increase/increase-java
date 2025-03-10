// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.cardreversals.CardReversalCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardReversalServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardReversalService = client.simulations().cardReversals()

        val cardPayment =
            cardReversalService.create(
                CardReversalCreateParams.builder()
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .amount(1L)
                    .build()
            )

        cardPayment.validate()
    }
}
