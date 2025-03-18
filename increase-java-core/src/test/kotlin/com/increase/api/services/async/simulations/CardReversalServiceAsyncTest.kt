// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.cardreversals.CardReversalCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardReversalServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardReversalServiceAsync = client.simulations().cardReversals()

        val cardPaymentFuture =
            cardReversalServiceAsync.create(
                CardReversalCreateParams.builder()
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .amount(1L)
                    .build()
            )

        val cardPayment = cardPaymentFuture.get()
        cardPayment.validate()
    }
}
