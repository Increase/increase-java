// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.CardCreateParams
import com.increase.api.models.CardDetailsParams
import com.increase.api.models.CardRetrieveParams
import com.increase.api.models.CardUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardServiceTest {

    @Test
    fun callCreate() {
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
        println(card)
        card.validate()
    }

    @Test
    fun callRetrieve() {
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
        println(card)
        card.validate()
    }

    @Test
    fun callUpdate() {
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
        println(card)
        card.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()
        val cardList = cardService.list()
        println(cardList)
        cardList.data().forEach { it.validate() }
    }

    @Test
    fun callDetails() {
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
        println(cardDetails)
        cardDetails.validate()
    }
}
