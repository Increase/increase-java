// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListParams
import java.time.OffsetDateTime
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
            digitalWalletTokenService.retrieve("digital_wallet_token_izi62go3h51p369jrie0")

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

        val digitalWalletTokens =
            digitalWalletTokenService.list(
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

        digitalWalletTokens.validate()
    }
}
