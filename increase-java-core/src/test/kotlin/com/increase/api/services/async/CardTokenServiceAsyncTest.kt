// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.cardtokens.CardTokenListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardTokenServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardTokenServiceAsync = client.cardTokens()

        val cardTokenFuture =
            cardTokenServiceAsync.retrieve("outbound_card_token_zlt0ml6youq3q7vcdlg0")

        val cardToken = cardTokenFuture.get()
        cardToken.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardTokenServiceAsync = client.cardTokens()

        val cardTokensFuture =
            cardTokenServiceAsync.list(
                CardTokenListParams.builder()
                    .createdAt(
                        CardTokenListParams.CreatedAt.builder()
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

        val cardTokens = cardTokensFuture.get()
        cardTokens.validate()
    }

    @Test
    fun capabilities() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardTokenServiceAsync = client.cardTokens()

        val cardTokenCapabilitiesFuture =
            cardTokenServiceAsync.capabilities("outbound_card_token_zlt0ml6youq3q7vcdlg0")

        val cardTokenCapabilities = cardTokenCapabilitiesFuture.get()
        cardTokenCapabilities.validate()
    }
}
