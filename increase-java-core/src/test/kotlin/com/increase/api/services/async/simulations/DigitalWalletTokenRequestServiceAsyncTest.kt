// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.digitalwallettokenrequests.DigitalWalletTokenRequestCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DigitalWalletTokenRequestServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenRequestServiceAsync =
            client.simulations().digitalWalletTokenRequests()

        val digitalWalletTokenRequestFuture =
            digitalWalletTokenRequestServiceAsync.create(
                DigitalWalletTokenRequestCreateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .build()
            )

        val digitalWalletTokenRequest = digitalWalletTokenRequestFuture.get()
        digitalWalletTokenRequest.validate()
    }
}
