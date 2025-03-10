// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.digitalwallettokenrequests.DigitalWalletTokenRequestCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DigitalWalletTokenRequestServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenRequestService = client.simulations().digitalWalletTokenRequests()

        val digitalWalletTokenRequest =
            digitalWalletTokenRequestService.create(
                DigitalWalletTokenRequestCreateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .build()
            )

        digitalWalletTokenRequest.validate()
    }
}
