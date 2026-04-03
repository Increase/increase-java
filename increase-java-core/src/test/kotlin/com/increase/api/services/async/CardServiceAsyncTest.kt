// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.cards.CardCreateDetailsIframeParams
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardUpdateParams
import com.increase.api.models.cards.CardUpdatePinParams
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
                    .authorizationControls(
                        CardCreateParams.AuthorizationControls.builder()
                            .maximumAuthorizationCount(
                                CardCreateParams.AuthorizationControls.MaximumAuthorizationCount
                                    .builder()
                                    .allTime(0L)
                                    .build()
                            )
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
                                            .code("xxxx")
                                            .build()
                                    )
                                    .addBlocked(
                                        CardCreateParams.AuthorizationControls.MerchantCategoryCode
                                            .Blocked
                                            .builder()
                                            .code("xxxx")
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
                            .addSpendingLimit(
                                CardCreateParams.AuthorizationControls.SpendingLimit.builder()
                                    .interval(
                                        CardCreateParams.AuthorizationControls.SpendingLimit
                                            .Interval
                                            .ALL_TIME
                                    )
                                    .settlementAmount(0L)
                                    .addMerchantCategoryCode(
                                        CardCreateParams.AuthorizationControls.SpendingLimit
                                            .MerchantCategoryCode
                                            .builder()
                                            .code("x")
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
                    .authorizationControls(
                        CardUpdateParams.AuthorizationControls.builder()
                            .maximumAuthorizationCount(
                                CardUpdateParams.AuthorizationControls.MaximumAuthorizationCount
                                    .builder()
                                    .allTime(0L)
                                    .build()
                            )
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
                                            .code("xxxx")
                                            .build()
                                    )
                                    .addBlocked(
                                        CardUpdateParams.AuthorizationControls.MerchantCategoryCode
                                            .Blocked
                                            .builder()
                                            .code("xxxx")
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
                            .addSpendingLimit(
                                CardUpdateParams.AuthorizationControls.SpendingLimit.builder()
                                    .interval(
                                        CardUpdateParams.AuthorizationControls.SpendingLimit
                                            .Interval
                                            .ALL_TIME
                                    )
                                    .settlementAmount(0L)
                                    .addMerchantCategoryCode(
                                        CardUpdateParams.AuthorizationControls.SpendingLimit
                                            .MerchantCategoryCode
                                            .builder()
                                            .code("x")
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

        val pageFuture = cardServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
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
