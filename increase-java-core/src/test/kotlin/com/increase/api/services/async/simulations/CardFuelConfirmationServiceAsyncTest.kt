// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.cardfuelconfirmations.CardFuelConfirmationCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardFuelConfirmationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardFuelConfirmationServiceAsync = client.simulations().cardFuelConfirmations()

        val cardPaymentFuture =
            cardFuelConfirmationServiceAsync.create(
                CardFuelConfirmationCreateParams.builder()
                    .amount(5000L)
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .build()
            )

        val cardPayment = cardPaymentFuture.get()
        cardPayment.validate()
    }
}
