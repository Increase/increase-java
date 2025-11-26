// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.cards.CardCreateDetailsIframeParams
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardListParams
import com.increase.api.models.cards.CardUpdateParams
import com.increase.api.models.cards.CardUpdatePinParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardFuture =
            cardServiceAsync.create(
                CardCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .billingAddress(
                        CardCreateParams.BillingAddress.builder()
                            .city("x")
                            .line1("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .build()
                    )
                    .description("Card for Ian Crease")
                    .digitalWallet(
                        CardCreateParams.DigitalWallet.builder()
                            .digitalCardProfileId("digital_card_profile_id")
                            .email("dev@stainless.com")
                            .phone("x")
                            .build()
                    )
                    .entityId("entity_id")
                    .build()
            )

        val card = cardFuture.get()
        card.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardFuture = cardServiceAsync.retrieve("card_oubs0hwk5rn6knuecxg2")

        val card = cardFuture.get()
        card.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardFuture =
            cardServiceAsync.update(
                CardUpdateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .billingAddress(
                        CardUpdateParams.BillingAddress.builder()
                            .city("x")
                            .line1("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .build()
                    )
                    .description("New description")
                    .digitalWallet(
                        CardUpdateParams.DigitalWallet.builder()
                            .digitalCardProfileId("digital_card_profile_id")
                            .email("dev@stainless.com")
                            .phone("x")
                            .build()
                    )
                    .entityId("entity_id")
                    .status(CardUpdateParams.Status.ACTIVE)
                    .build()
            )

        val card = cardFuture.get()
        card.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardsFuture =
            cardServiceAsync.list(
                CardListParams.builder()
                    .accountId("account_id")
                    .createdAt(
                        CardListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .idempotencyKey("x")
                    .limit(1L)
                    .status(
                        CardListParams.Status.builder()
                            .addIn(CardListParams.Status.In.ACTIVE)
                            .build()
                    )
                    .build()
            )

        val cards = cardsFuture.get()
        cards.validate()
    }

    @Test
    fun createDetailsIframe() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardIframeUrlFuture =
            cardServiceAsync.createDetailsIframe(
                CardCreateDetailsIframeParams.builder()
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
        val cardServiceAsync = client.cards()

        val cardDetailsFuture = cardServiceAsync.details("card_oubs0hwk5rn6knuecxg2")

        val cardDetails = cardDetailsFuture.get()
        cardDetails.validate()
    }

    @Test
    fun updatePin() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardDetailsFuture =
            cardServiceAsync.updatePin(
                CardUpdatePinParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .pin("1234")
                    .build()
            )

        val cardDetails = cardDetailsFuture.get()
        cardDetails.validate()
    }
}
