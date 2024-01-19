// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.CardListParams
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
                    .accountId("string")
                    .billingAddress(
                        CardCreateParams.BillingAddress.builder()
                            .city("x")
                            .line1("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .build()
                    )
                    .description("x")
                    .digitalWallet(
                        CardCreateParams.DigitalWallet.builder()
                            .cardProfileId("string")
                            .digitalCardProfileId("string")
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .entityId("string")
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
        val card = cardService.retrieve(CardRetrieveParams.builder().cardId("string").build())
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
                    .cardId("string")
                    .billingAddress(
                        CardUpdateParams.BillingAddress.builder()
                            .city("x")
                            .line1("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .build()
                    )
                    .description("x")
                    .digitalWallet(
                        CardUpdateParams.DigitalWallet.builder()
                            .cardProfileId("string")
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .entityId("string")
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
        val cardList = cardService.list(CardListParams.builder().build())
        println(cardList)
        cardList.data().forEach { it.validate() }
    }

    @Test
    fun callRetrieveSensitiveDetails() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()
        val cardDetails =
            cardService.retrieveSensitiveDetails(
                CardRetrieveSensitiveDetailsParams.builder().cardId("string").build()
            )
        println(cardDetails)
        cardDetails.validate()
    }
}
