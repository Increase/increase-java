// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.carddetails.CardDetailCreateDetailsIframeParams
import com.increase.api.models.carddetails.CardDetailUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardDetailServiceAsyncTest {

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDetailServiceAsync = client.cardDetails()

        val cardDetailsFuture =
            cardDetailServiceAsync.update(
                CardDetailUpdateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .pin("1234")
                    .build()
            )

        val cardDetails = cardDetailsFuture.get()
        cardDetails.validate()
    }

    @Test
    fun createDetailsIframe() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDetailServiceAsync = client.cardDetails()

        val cardIframeUrlFuture =
            cardDetailServiceAsync.createDetailsIframe(
                CardDetailCreateDetailsIframeParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .physicalCardId("physical_card_id")
                    .build()
            )

        val cardIframeUrl = cardIframeUrlFuture.get()
        cardIframeUrl.validate()
    }

    @Test
    fun details() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDetailServiceAsync = client.cardDetails()

        val cardDetailsFuture = cardDetailServiceAsync.details("card_oubs0hwk5rn6knuecxg2")

        val cardDetails = cardDetailsFuture.get()
        cardDetails.validate()
    }
}
