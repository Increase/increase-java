// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DigitalWalletTokenRequestServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenRequestService = client.digitalWalletTokenRequests()

        val digitalWalletTokenRequest =
            digitalWalletTokenRequestService.retrieve(
                "digital_wallet_token_request_dlsq0yabf7ev4xvke6ek"
            )

        digitalWalletTokenRequest.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenRequestService = client.digitalWalletTokenRequests()

        val page = digitalWalletTokenRequestService.list()

        page.response().validate()
    }
}
