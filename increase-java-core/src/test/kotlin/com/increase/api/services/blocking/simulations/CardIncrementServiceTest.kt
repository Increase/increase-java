// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.cardincrements.CardIncrementCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardIncrementServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardIncrementService = client.simulations().cardIncrements()

        val cardPayment =
            cardIncrementService.create(
                CardIncrementCreateParams.builder()
                    .amount(500L)
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .eventSubscriptionId("event_subscription_id")
                    .build()
            )

        cardPayment.validate()
    }
}
