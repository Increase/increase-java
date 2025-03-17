// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.cardauthorizationexpirations.CardAuthorizationExpirationCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardAuthorizationExpirationServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardAuthorizationExpirationService = client.simulations().cardAuthorizationExpirations()

        val cardPayment =
            cardAuthorizationExpirationService.create(
                CardAuthorizationExpirationCreateParams.builder()
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .build()
            )

        cardPayment.validate()
    }
}
