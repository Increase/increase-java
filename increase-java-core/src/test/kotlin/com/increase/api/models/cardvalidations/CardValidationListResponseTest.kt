// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardValidationListResponseTest {

    @Test
    fun create() {
        val cardValidationListResponse =
            CardValidationListResponse.builder()
                .addData(
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
                                .apiKey(
                                    CardValidation.CreatedBy.ApiKey.builder()
                                        .description("description")
                                        .build()
                                )
                                .category(CardValidation.CreatedBy.Category.USER)
                                .oauthApplication(
                                    CardValidation.CreatedBy.OAuthApplication.builder()
                                        .name("name")
                                        .build()
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
                                    CardValidation.Decline.Reason
                                        .TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(cardValidationListResponse.data())
            .containsExactly(
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
                            .apiKey(
                                CardValidation.CreatedBy.ApiKey.builder()
                                    .description("description")
                                    .build()
                            )
                            .category(CardValidation.CreatedBy.Category.USER)
                            .oauthApplication(
                                CardValidation.CreatedBy.OAuthApplication.builder()
                                    .name("name")
                                    .build()
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
                                CardValidation.Decline.Reason
                                    .TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
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
            )
        assertThat(cardValidationListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardValidationListResponse =
            CardValidationListResponse.builder()
                .addData(
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
                                .apiKey(
                                    CardValidation.CreatedBy.ApiKey.builder()
                                        .description("description")
                                        .build()
                                )
                                .category(CardValidation.CreatedBy.Category.USER)
                                .oauthApplication(
                                    CardValidation.CreatedBy.OAuthApplication.builder()
                                        .name("name")
                                        .build()
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
                                    CardValidation.Decline.Reason
                                        .TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedCardValidationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardValidationListResponse),
                jacksonTypeRef<CardValidationListResponse>(),
            )

        assertThat(roundtrippedCardValidationListResponse).isEqualTo(cardValidationListResponse)
    }
}
