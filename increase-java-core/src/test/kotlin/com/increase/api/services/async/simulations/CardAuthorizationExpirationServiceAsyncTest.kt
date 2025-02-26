// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.SimulationCardAuthorizationExpirationCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardAuthorizationExpirationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardAuthorizationExpirationServiceAsync =
            client.simulations().cardAuthorizationExpirations()

        val cardPaymentFuture =
            cardAuthorizationExpirationServiceAsync.create(
                SimulationCardAuthorizationExpirationCreateParams.builder()
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .build()
            )

        val cardPayment = cardPaymentFuture.get()
        cardPayment.validate()
    }
}
