// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DigitalWalletTokenRequestServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenRequestServiceAsync = client.digitalWalletTokenRequests()

        val digitalWalletTokenRequestFuture =
            digitalWalletTokenRequestServiceAsync.retrieve(
                "digital_wallet_token_request_dlsq0yabf7ev4xvke6ek"
            )

        val digitalWalletTokenRequest = digitalWalletTokenRequestFuture.get()
        digitalWalletTokenRequest.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenRequestServiceAsync = client.digitalWalletTokenRequests()

        val pageFuture = digitalWalletTokenRequestServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
