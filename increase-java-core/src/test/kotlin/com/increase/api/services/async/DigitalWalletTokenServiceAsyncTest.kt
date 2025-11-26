// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DigitalWalletTokenServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalWalletTokenServiceAsync = client.digitalWalletTokens()

        val digitalWalletTokenFuture =
            digitalWalletTokenServiceAsync.retrieve("digital_wallet_token_izi62go3h51p369jrie0")

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

        val digitalWalletTokensFuture =
            digitalWalletTokenServiceAsync.list(
                DigitalWalletTokenListParams.builder()
                    .cardId("card_id")
                    .createdAt(
                        DigitalWalletTokenListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .build()
            )

        val digitalWalletTokens = digitalWalletTokensFuture.get()
        digitalWalletTokens.validate()
    }
}
