// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.cardvalidations.CardValidationCreateParams
import com.increase.api.models.cardvalidations.CardValidationListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardValidationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardValidationServiceAsync = client.cardValidations()

        val cardValidationFuture =
            cardValidationServiceAsync.create(
                CardValidationCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                    .merchantCategoryCode("1234")
                    .merchantCityName("New York")
                    .merchantName("Acme Corp")
                    .merchantPostalCode("10045")
                    .merchantState("NY")
                    .cardholderFirstName("Dee")
                    .cardholderLastName("Hock")
                    .cardholderMiddleName("Ward")
                    .cardholderPostalCode("10045")
                    .cardholderStreetAddress("33 Liberty Street")
                    .build()
            )

        val cardValidation = cardValidationFuture.get()
        cardValidation.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardValidationServiceAsync = client.cardValidations()

        val cardValidationFuture =
            cardValidationServiceAsync.retrieve("outbound_card_validation_qqlzagpc6v1x2gcdhe24")

        val cardValidation = cardValidationFuture.get()
        cardValidation.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardValidationServiceAsync = client.cardValidations()

        val cardValidationsFuture =
            cardValidationServiceAsync.list(
                CardValidationListParams.builder()
                    .accountId("account_id")
                    .createdAt(
                        CardValidationListParams.CreatedAt.builder()
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
                        CardValidationListParams.Status.builder()
                            .addIn(CardValidationListParams.Status.In.REQUIRES_ATTENTION)
                            .build()
                    )
                    .build()
            )

        val cardValidations = cardValidationsFuture.get()
        cardValidations.validate()
    }
}
