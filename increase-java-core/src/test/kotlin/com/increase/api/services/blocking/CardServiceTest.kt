// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardDetailsParams
import com.increase.api.models.cards.CardRetrieveParams
import com.increase.api.models.cards.CardUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()

        val card =
            cardService.create(
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
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .entityId("entity_id")
                    .build()
            )

        card.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()

        val card =
            cardService.retrieve(
                CardRetrieveParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()
            )

        card.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()

        val card =
            cardService.update(
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
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .entityId("entity_id")
                    .status(CardUpdateParams.Status.ACTIVE)
                    .build()
            )

        card.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()

        val page = cardService.list()

        page.response().validate()
    }

    @Test
    fun details() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()

        val cardDetails =
            cardService.details(
                CardDetailsParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()
            )

        cardDetails.validate()
    }
}
