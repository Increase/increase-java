// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationChallengeAttemptsParams
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardAuthenticationServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardAuthenticationService = client.simulations().cardAuthentications()

        val cardPayment =
            cardAuthenticationService.create(
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

        cardPayment.validate()
    }

    @Test
    fun challengeAttempts() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardAuthenticationService = client.simulations().cardAuthentications()

        val cardPayment =
            cardAuthenticationService.challengeAttempts(
                CardAuthenticationChallengeAttemptsParams.builder()
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .oneTimeCode("123456")
                    .build()
            )

        cardPayment.validate()
    }

    @Test
    fun challenges() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardAuthenticationService = client.simulations().cardAuthentications()

        val cardPayment = cardAuthenticationService.challenges("card_payment_nd3k2kacrqjli8482ave")

        cardPayment.validate()
    }
}
