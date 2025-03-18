// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DigitalWalletTokenServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenService = client.digitalWalletTokens()

        val digitalWalletToken =
            digitalWalletTokenService.retrieve(
                DigitalWalletTokenRetrieveParams.builder()
                    .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                    .build()
            )

        digitalWalletToken.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenService = client.digitalWalletTokens()

        val page = digitalWalletTokenService.list()

        page.response().validate()
    }
}
