// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationChallengeAttemptsParams
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardAuthenticationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardAuthenticationServiceAsync = client.simulations().cardAuthentications()

        val cardPaymentFuture =
            cardAuthenticationServiceAsync.create(
                CardAuthenticationCreateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .category(CardAuthenticationCreateParams.Category.PAYMENT_AUTHENTICATION)
                    .deviceChannel(CardAuthenticationCreateParams.DeviceChannel.APP)
                    .merchantAcceptorId("5665270011000168")
                    .merchantCategoryCode("5734")
                    .merchantCountry("US")
                    .merchantName("x")
                    .purchaseAmount(1000L)
                    .build()
            )

        val cardPayment = cardPaymentFuture.get()
        cardPayment.validate()
    }

    @Test
    fun challengeAttempts() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardAuthenticationServiceAsync = client.simulations().cardAuthentications()

        val cardPaymentFuture =
            cardAuthenticationServiceAsync.challengeAttempts(
                CardAuthenticationChallengeAttemptsParams.builder()
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .oneTimeCode("123456")
                    .build()
            )

        val cardPayment = cardPaymentFuture.get()
        cardPayment.validate()
    }

    @Test
    fun challenges() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardAuthenticationServiceAsync = client.simulations().cardAuthentications()

        val cardPaymentFuture =
            cardAuthenticationServiceAsync.challenges("card_payment_nd3k2kacrqjli8482ave")

        val cardPayment = cardPaymentFuture.get()
        cardPayment.validate()
    }
}
