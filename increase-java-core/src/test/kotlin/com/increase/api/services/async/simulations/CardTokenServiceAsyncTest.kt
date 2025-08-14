// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.cardtokens.CardTokenCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardTokenServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardTokenServiceAsync = client.simulations().cardTokens()

        val cardTokenFuture =
            cardTokenServiceAsync.create(
                CardTokenCreateParams.builder()
                    .addCapability(
                        CardTokenCreateParams.Capability.builder()
                            .crossBorderPushTransfers(
                                CardTokenCreateParams.Capability.CrossBorderPushTransfers.SUPPORTED
                            )
                            .domesticPushTransfers(
                                CardTokenCreateParams.Capability.DomesticPushTransfers.SUPPORTED
                            )
                            .route(CardTokenCreateParams.Capability.Route.VISA)
                            .build()
                    )
                    .expiration(LocalDate.parse("2019-12-27"))
                    .last4("1234")
                    .prefix("41234567")
                    .primaryAccountNumberLength(16L)
                    .build()
            )

        val cardToken = cardTokenFuture.get()
        cardToken.validate()
    }
}
