// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.cards.CardCreateDetailsIframeParams
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardUpdateParams
import com.increase.api.models.cards.CardUpdatePinParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardServiceTest {

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
                    .authorizationControls(
                        CardCreateParams.AuthorizationControls.builder()
                            .merchantAcceptorIdentifier(
                                CardCreateParams.AuthorizationControls.MerchantAcceptorIdentifier
                                    .builder()
                                    .addAllowed(
                                        CardCreateParams.AuthorizationControls
                                            .MerchantAcceptorIdentifier
                                            .Allowed
                                            .builder()
                                            .identifier("x")
                                            .build()
                                    )
                                    .addBlocked(
                                        CardCreateParams.AuthorizationControls
                                            .MerchantAcceptorIdentifier
                                            .Blocked
                                            .builder()
                                            .identifier("x")
                                            .build()
                                    )
                                    .build()
                            )
                            .merchantCategoryCode(
                                CardCreateParams.AuthorizationControls.MerchantCategoryCode
                                    .builder()
                                    .addAllowed(
                                        CardCreateParams.AuthorizationControls.MerchantCategoryCode
                                            .Allowed
                                            .builder()
                                            .code("0253")
                                            .build()
                                    )
                                    .addBlocked(
                                        CardCreateParams.AuthorizationControls.MerchantCategoryCode
                                            .Blocked
                                            .builder()
                                            .code("0253")
                                            .build()
                                    )
                                    .build()
                            )
                            .merchantCountry(
                                CardCreateParams.AuthorizationControls.MerchantCountry.builder()
                                    .addAllowed(
                                        CardCreateParams.AuthorizationControls.MerchantCountry
                                            .Allowed
                                            .builder()
                                            .country("xx")
                                            .build()
                                    )
                                    .addBlocked(
                                        CardCreateParams.AuthorizationControls.MerchantCountry
                                            .Blocked
                                            .builder()
                                            .country("xx")
                                            .build()
                                    )
                                    .build()
                            )
                            .usage(
                                CardCreateParams.AuthorizationControls.Usage.builder()
                                    .category(
                                        CardCreateParams.AuthorizationControls.Usage.Category
                                            .SINGLE_USE
                                    )
                                    .multiUse(
                                        CardCreateParams.AuthorizationControls.Usage.MultiUse
                                            .builder()
                                            .addSpendingLimit(
                                                CardCreateParams.AuthorizationControls.Usage
                                                    .MultiUse
                                                    .SpendingLimit
                                                    .builder()
                                                    .interval(
                                                        CardCreateParams.AuthorizationControls.Usage
                                                            .MultiUse
                                                            .SpendingLimit
                                                            .Interval
                                                            .ALL_TIME
                                                    )
                                                    .settlementAmount(0L)
                                                    .addMerchantCategoryCode(
                                                        CardCreateParams.AuthorizationControls.Usage
                                                            .MultiUse
                                                            .SpendingLimit
                                                            .MerchantCategoryCode
                                                            .builder()
                                                            .code("x")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .singleUse(
                                        CardCreateParams.AuthorizationControls.Usage.SingleUse
                                            .builder()
                                            .settlementAmount(
                                                CardCreateParams.AuthorizationControls.Usage
                                                    .SingleUse
                                                    .SettlementAmount
                                                    .builder()
                                                    .comparison(
                                                        CardCreateParams.AuthorizationControls.Usage
                                                            .SingleUse
                                                            .SettlementAmount
                                                            .Comparison
                                                            .EQUALS
                                                    )
                                                    .value(0L)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
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

        val card = cardService.retrieve("card_oubs0hwk5rn6knuecxg2")

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
                    .authorizationControls(
                        CardUpdateParams.AuthorizationControls.builder()
                            .merchantAcceptorIdentifier(
                                CardUpdateParams.AuthorizationControls.MerchantAcceptorIdentifier
                                    .builder()
                                    .addAllowed(
                                        CardUpdateParams.AuthorizationControls
                                            .MerchantAcceptorIdentifier
                                            .Allowed
                                            .builder()
                                            .identifier("x")
                                            .build()
                                    )
                                    .addBlocked(
                                        CardUpdateParams.AuthorizationControls
                                            .MerchantAcceptorIdentifier
                                            .Blocked
                                            .builder()
                                            .identifier("x")
                                            .build()
                                    )
                                    .build()
                            )
                            .merchantCategoryCode(
                                CardUpdateParams.AuthorizationControls.MerchantCategoryCode
                                    .builder()
                                    .addAllowed(
                                        CardUpdateParams.AuthorizationControls.MerchantCategoryCode
                                            .Allowed
                                            .builder()
                                            .code("0253")
                                            .build()
                                    )
                                    .addBlocked(
                                        CardUpdateParams.AuthorizationControls.MerchantCategoryCode
                                            .Blocked
                                            .builder()
                                            .code("0253")
                                            .build()
                                    )
                                    .build()
                            )
                            .merchantCountry(
                                CardUpdateParams.AuthorizationControls.MerchantCountry.builder()
                                    .addAllowed(
                                        CardUpdateParams.AuthorizationControls.MerchantCountry
                                            .Allowed
                                            .builder()
                                            .country("xx")
                                            .build()
                                    )
                                    .addBlocked(
                                        CardUpdateParams.AuthorizationControls.MerchantCountry
                                            .Blocked
                                            .builder()
                                            .country("xx")
                                            .build()
                                    )
                                    .build()
                            )
                            .usage(
                                CardUpdateParams.AuthorizationControls.Usage.builder()
                                    .category(
                                        CardUpdateParams.AuthorizationControls.Usage.Category
                                            .SINGLE_USE
                                    )
                                    .multiUse(
                                        CardUpdateParams.AuthorizationControls.Usage.MultiUse
                                            .builder()
                                            .addSpendingLimit(
                                                CardUpdateParams.AuthorizationControls.Usage
                                                    .MultiUse
                                                    .SpendingLimit
                                                    .builder()
                                                    .interval(
                                                        CardUpdateParams.AuthorizationControls.Usage
                                                            .MultiUse
                                                            .SpendingLimit
                                                            .Interval
                                                            .ALL_TIME
                                                    )
                                                    .settlementAmount(0L)
                                                    .addMerchantCategoryCode(
                                                        CardUpdateParams.AuthorizationControls.Usage
                                                            .MultiUse
                                                            .SpendingLimit
                                                            .MerchantCategoryCode
                                                            .builder()
                                                            .code("x")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .singleUse(
                                        CardUpdateParams.AuthorizationControls.Usage.SingleUse
                                            .builder()
                                            .settlementAmount(
                                                CardUpdateParams.AuthorizationControls.Usage
                                                    .SingleUse
                                                    .SettlementAmount
                                                    .builder()
                                                    .comparison(
                                                        CardUpdateParams.AuthorizationControls.Usage
                                                            .SingleUse
                                                            .SettlementAmount
                                                            .Comparison
                                                            .EQUALS
                                                    )
                                                    .value(0L)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
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
    fun createDetailsIframe() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()

        val cardIframeUrl =
            cardService.createDetailsIframe(
                CardCreateDetailsIframeParams.builder()
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
        val cardService = client.cards()

        val cardDetails = cardService.details("card_oubs0hwk5rn6knuecxg2")

        cardDetails.validate()
    }

    @Test
    fun updatePin() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()

        val cardDetails =
            cardService.updatePin(
                CardUpdatePinParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .pin("1234")
                    .build()
            )

        cardDetails.validate()
    }
}
