// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardValidationTest {

    @Test
    fun create() {
        val cardValidation =
            CardValidation.builder()
                .id("outbound_card_validation_qqlzagpc6v1x2gcdhe24")
                .acceptance(
                    CardValidation.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .authorizationIdentificationResponse("ABCDEF")
                        .cardVerificationValue2Result(null)
                        .cardholderFirstNameResult(null)
                        .cardholderFullNameResult(null)
                        .cardholderLastNameResult(null)
                        .cardholderMiddleNameResult(null)
                        .cardholderPostalCodeResult(null)
                        .cardholderStreetAddressResult(null)
                        .networkTransactionIdentifier("841488484271872")
                        .build()
                )
                .accountId("account_in71c4amph0vgo2qllky")
                .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                .cardholderFirstName("Dee")
                .cardholderLastName("Hock")
                .cardholderMiddleName("Ward")
                .cardholderPostalCode("10045")
                .cardholderStreetAddress("33 Liberty Street")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    CardValidation.CreatedBy.builder()
                        .category(CardValidation.CreatedBy.Category.USER)
                        .apiKey(
                            CardValidation.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            CardValidation.CreatedBy.OAuthApplication.builder().name("name").build()
                        )
                        .user(
                            CardValidation.CreatedBy.User.builder()
                                .email("user@example.com")
                                .build()
                        )
                        .build()
                )
                .decline(
                    CardValidation.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .networkTransactionIdentifier("841488484271872")
                        .reason(
                            CardValidation.Decline.Reason.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
                        )
                        .build()
                )
                .idempotencyKey(null)
                .merchantCategoryCode("1234")
                .merchantCityName("New York")
                .merchantName("Acme Corp")
                .merchantPostalCode("10045")
                .merchantState("NY")
                .status(CardValidation.Status.PENDING_SUBMISSION)
                .submission(
                    CardValidation.Submission.builder()
                        .retrievalReferenceNumber("123456789012")
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .traceNumber("123456")
                        .build()
                )
                .type(CardValidation.Type.CARD_VALIDATION)
                .build()

        assertThat(cardValidation.id()).isEqualTo("outbound_card_validation_qqlzagpc6v1x2gcdhe24")
        assertThat(cardValidation.acceptance())
            .contains(
                CardValidation.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .authorizationIdentificationResponse("ABCDEF")
                    .cardVerificationValue2Result(null)
                    .cardholderFirstNameResult(null)
                    .cardholderFullNameResult(null)
                    .cardholderLastNameResult(null)
                    .cardholderMiddleNameResult(null)
                    .cardholderPostalCodeResult(null)
                    .cardholderStreetAddressResult(null)
                    .networkTransactionIdentifier("841488484271872")
                    .build()
            )
        assertThat(cardValidation.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(cardValidation.cardTokenId())
            .isEqualTo("outbound_card_token_zlt0ml6youq3q7vcdlg0")
        assertThat(cardValidation.cardholderFirstName()).contains("Dee")
        assertThat(cardValidation.cardholderLastName()).contains("Hock")
        assertThat(cardValidation.cardholderMiddleName()).contains("Ward")
        assertThat(cardValidation.cardholderPostalCode()).contains("10045")
        assertThat(cardValidation.cardholderStreetAddress()).contains("33 Liberty Street")
        assertThat(cardValidation.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(cardValidation.createdBy())
            .contains(
                CardValidation.CreatedBy.builder()
                    .category(CardValidation.CreatedBy.Category.USER)
                    .apiKey(
                        CardValidation.CreatedBy.ApiKey.builder().description("description").build()
                    )
                    .oauthApplication(
                        CardValidation.CreatedBy.OAuthApplication.builder().name("name").build()
                    )
                    .user(CardValidation.CreatedBy.User.builder().email("user@example.com").build())
                    .build()
            )
        assertThat(cardValidation.decline())
            .contains(
                CardValidation.Decline.builder()
                    .declinedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .networkTransactionIdentifier("841488484271872")
                    .reason(CardValidation.Decline.Reason.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER)
                    .build()
            )
        assertThat(cardValidation.idempotencyKey()).isEmpty
        assertThat(cardValidation.merchantCategoryCode()).isEqualTo("1234")
        assertThat(cardValidation.merchantCityName()).isEqualTo("New York")
        assertThat(cardValidation.merchantName()).isEqualTo("Acme Corp")
        assertThat(cardValidation.merchantPostalCode()).isEqualTo("10045")
        assertThat(cardValidation.merchantState()).isEqualTo("NY")
        assertThat(cardValidation.status()).isEqualTo(CardValidation.Status.PENDING_SUBMISSION)
        assertThat(cardValidation.submission())
            .contains(
                CardValidation.Submission.builder()
                    .retrievalReferenceNumber("123456789012")
                    .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .traceNumber("123456")
                    .build()
            )
        assertThat(cardValidation.type()).isEqualTo(CardValidation.Type.CARD_VALIDATION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardValidation =
            CardValidation.builder()
                .id("outbound_card_validation_qqlzagpc6v1x2gcdhe24")
                .acceptance(
                    CardValidation.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .authorizationIdentificationResponse("ABCDEF")
                        .cardVerificationValue2Result(null)
                        .cardholderFirstNameResult(null)
                        .cardholderFullNameResult(null)
                        .cardholderLastNameResult(null)
                        .cardholderMiddleNameResult(null)
                        .cardholderPostalCodeResult(null)
                        .cardholderStreetAddressResult(null)
                        .networkTransactionIdentifier("841488484271872")
                        .build()
                )
                .accountId("account_in71c4amph0vgo2qllky")
                .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                .cardholderFirstName("Dee")
                .cardholderLastName("Hock")
                .cardholderMiddleName("Ward")
                .cardholderPostalCode("10045")
                .cardholderStreetAddress("33 Liberty Street")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    CardValidation.CreatedBy.builder()
                        .category(CardValidation.CreatedBy.Category.USER)
                        .apiKey(
                            CardValidation.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            CardValidation.CreatedBy.OAuthApplication.builder().name("name").build()
                        )
                        .user(
                            CardValidation.CreatedBy.User.builder()
                                .email("user@example.com")
                                .build()
                        )
                        .build()
                )
                .decline(
                    CardValidation.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .networkTransactionIdentifier("841488484271872")
                        .reason(
                            CardValidation.Decline.Reason.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
                        )
                        .build()
                )
                .idempotencyKey(null)
                .merchantCategoryCode("1234")
                .merchantCityName("New York")
                .merchantName("Acme Corp")
                .merchantPostalCode("10045")
                .merchantState("NY")
                .status(CardValidation.Status.PENDING_SUBMISSION)
                .submission(
                    CardValidation.Submission.builder()
                        .retrievalReferenceNumber("123456789012")
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .traceNumber("123456")
                        .build()
                )
                .type(CardValidation.Type.CARD_VALIDATION)
                .build()

        val roundtrippedCardValidation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardValidation),
                jacksonTypeRef<CardValidation>(),
            )

        assertThat(roundtrippedCardValidation).isEqualTo(cardValidation)
    }
}
