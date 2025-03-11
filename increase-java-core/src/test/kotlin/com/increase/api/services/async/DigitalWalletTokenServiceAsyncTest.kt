// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DigitalWalletTokenServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenServiceAsync = client.digitalWalletTokens()

        val digitalWalletTokenFuture =
            digitalWalletTokenServiceAsync.retrieve(
                DigitalWalletTokenRetrieveParams.builder()
                    .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                    .build()
            )

        val digitalWalletToken = digitalWalletTokenFuture.get()
        digitalWalletToken.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenServiceAsync = client.digitalWalletTokens()

        val pageFuture = digitalWalletTokenServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
