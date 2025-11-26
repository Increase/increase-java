// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardTokenServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardTokenService = client.cardTokens()

        val cardToken = cardTokenService.retrieve("outbound_card_token_zlt0ml6youq3q7vcdlg0")

        cardToken.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardTokenService = client.cardTokens()

        val page = cardTokenService.list()

        page.response().validate()
    }

    @Test
    fun capabilities() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardTokenService = client.cardTokens()

        val cardTokenCapabilities =
            cardTokenService.capabilities("outbound_card_token_zlt0ml6youq3q7vcdlg0")

        cardTokenCapabilities.validate()
    }
}
