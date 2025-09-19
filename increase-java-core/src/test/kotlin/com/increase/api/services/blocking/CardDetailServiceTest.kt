// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.carddetails.CardDetailCreateDetailsIframeParams
import com.increase.api.models.carddetails.CardDetailUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardDetailServiceTest {

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDetailService = client.cardDetails()

        val cardDetails =
            cardDetailService.update(
                CardDetailUpdateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .pin("1234")
                    .build()
            )

        cardDetails.validate()
    }

    @Test
    fun createDetailsIframe() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDetailService = client.cardDetails()

        val cardIframeUrl =
            cardDetailService.createDetailsIframe(
                CardDetailCreateDetailsIframeParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .physicalCardId("physical_card_id")
                    .build()
            )

        cardIframeUrl.validate()
    }

    @Test
    fun details() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDetailService = client.cardDetails()

        val cardDetails = cardDetailService.details("card_oubs0hwk5rn6knuecxg2")

        cardDetails.validate()
    }
}
