// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardIncrementServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardIncrementService = client.simulations().cardIncrements()
        val cardPayment =
            cardIncrementService.create(
                SimulationCardIncrementCreateParams.builder()
                    .amount(123L)
                    .cardPaymentId("card_payment_id")
                    .eventSubscriptionId("event_subscription_id")
                    .build()
            )
        println(cardPayment)
        cardPayment.validate()
    }
}
