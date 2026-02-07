// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpushtransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPushTransferTest {

    @Test
    fun create() {
        val cardPushTransfer =
            CardPushTransfer.builder()
                .id("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")
                .acceptance(
                    CardPushTransfer.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .authorizationIdentificationResponse("ABCDEF")
                        .cardVerificationValue2Result(null)
                        .networkTransactionIdentifier("841488484271872")
                        .settlementAmount(100L)
                        .build()
                )
                .accountId("account_in71c4amph0vgo2qllky")
                .approval(
                    CardPushTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .approvedBy(null)
                        .build()
                )
                .businessApplicationIdentifier(
                    CardPushTransfer.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT
                )
                .cancellation(
                    CardPushTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .canceledBy(null)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    CardPushTransfer.CreatedBy.builder()
                        .category(CardPushTransfer.CreatedBy.Category.USER)
                        .apiKey(
                            CardPushTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            CardPushTransfer.CreatedBy.OAuthApplication.builder()
                                .name("name")
                                .build()
                        )
                        .user(
                            CardPushTransfer.CreatedBy.User.builder()
                                .email("user@example.com")
                                .build()
                        )
                        .build()
                )
                .decline(
                    CardPushTransfer.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .networkTransactionIdentifier("841488484271872")
                        .reason(
                            CardPushTransfer.Decline.Reason.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
                        )
                        .build()
                )
                .idempotencyKey(null)
                .merchantCategoryCode("1234")
                .merchantCityName("New York")
                .merchantName("Acme Corp")
                .merchantNamePrefix("Acme")
                .merchantPostalCode("10045")
                .merchantState("NY")
                .presentmentAmount(
                    CardPushTransfer.PresentmentAmount.builder()
                        .currency(CardPushTransfer.PresentmentAmount.Currency.USD)
                        .value("12.34")
                        .build()
                )
                .recipientName("Ian Crease")
                .senderAddressCity("New York")
                .senderAddressLine1("33 Liberty Street")
                .senderAddressPostalCode("10045")
                .senderAddressState("NY")
                .senderName("Ian Crease")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .status(CardPushTransfer.Status.PENDING_SUBMISSION)
                .submission(
                    CardPushTransfer.Submission.builder()
                        .retrievalReferenceNumber("123456789012")
                        .senderReference("OPQRRX3BNAKA6QLT")
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .traceNumber("123456")
                        .build()
                )
                .type(CardPushTransfer.Type.CARD_PUSH_TRANSFER)
                .build()

        assertThat(cardPushTransfer.id())
            .isEqualTo("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")
        assertThat(cardPushTransfer.acceptance())
            .contains(
                CardPushTransfer.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .authorizationIdentificationResponse("ABCDEF")
                    .cardVerificationValue2Result(null)
                    .networkTransactionIdentifier("841488484271872")
                    .settlementAmount(100L)
                    .build()
            )
        assertThat(cardPushTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(cardPushTransfer.approval())
            .contains(
                CardPushTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .approvedBy(null)
                    .build()
            )
        assertThat(cardPushTransfer.businessApplicationIdentifier())
            .isEqualTo(CardPushTransfer.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT)
        assertThat(cardPushTransfer.cancellation())
            .contains(
                CardPushTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .canceledBy(null)
                    .build()
            )
        assertThat(cardPushTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(cardPushTransfer.createdBy())
            .contains(
                CardPushTransfer.CreatedBy.builder()
                    .category(CardPushTransfer.CreatedBy.Category.USER)
                    .apiKey(
                        CardPushTransfer.CreatedBy.ApiKey.builder()
                            .description("description")
                            .build()
                    )
                    .oauthApplication(
                        CardPushTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                    )
                    .user(
                        CardPushTransfer.CreatedBy.User.builder().email("user@example.com").build()
                    )
                    .build()
            )
        assertThat(cardPushTransfer.decline())
            .contains(
                CardPushTransfer.Decline.builder()
                    .declinedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .networkTransactionIdentifier("841488484271872")
                    .reason(CardPushTransfer.Decline.Reason.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER)
                    .build()
            )
        assertThat(cardPushTransfer.idempotencyKey()).isEmpty
        assertThat(cardPushTransfer.merchantCategoryCode()).isEqualTo("1234")
        assertThat(cardPushTransfer.merchantCityName()).isEqualTo("New York")
        assertThat(cardPushTransfer.merchantName()).isEqualTo("Acme Corp")
        assertThat(cardPushTransfer.merchantNamePrefix()).isEqualTo("Acme")
        assertThat(cardPushTransfer.merchantPostalCode()).isEqualTo("10045")
        assertThat(cardPushTransfer.merchantState()).isEqualTo("NY")
        assertThat(cardPushTransfer.presentmentAmount())
            .isEqualTo(
                CardPushTransfer.PresentmentAmount.builder()
                    .currency(CardPushTransfer.PresentmentAmount.Currency.USD)
                    .value("12.34")
                    .build()
            )
        assertThat(cardPushTransfer.recipientName()).isEqualTo("Ian Crease")
        assertThat(cardPushTransfer.senderAddressCity()).isEqualTo("New York")
        assertThat(cardPushTransfer.senderAddressLine1()).isEqualTo("33 Liberty Street")
        assertThat(cardPushTransfer.senderAddressPostalCode()).isEqualTo("10045")
        assertThat(cardPushTransfer.senderAddressState()).isEqualTo("NY")
        assertThat(cardPushTransfer.senderName()).isEqualTo("Ian Crease")
        assertThat(cardPushTransfer.sourceAccountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(cardPushTransfer.status()).isEqualTo(CardPushTransfer.Status.PENDING_SUBMISSION)
        assertThat(cardPushTransfer.submission())
            .contains(
                CardPushTransfer.Submission.builder()
                    .retrievalReferenceNumber("123456789012")
                    .senderReference("OPQRRX3BNAKA6QLT")
                    .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .traceNumber("123456")
                    .build()
            )
        assertThat(cardPushTransfer.type()).isEqualTo(CardPushTransfer.Type.CARD_PUSH_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardPushTransfer =
            CardPushTransfer.builder()
                .id("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")
                .acceptance(
                    CardPushTransfer.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .authorizationIdentificationResponse("ABCDEF")
                        .cardVerificationValue2Result(null)
                        .networkTransactionIdentifier("841488484271872")
                        .settlementAmount(100L)
                        .build()
                )
                .accountId("account_in71c4amph0vgo2qllky")
                .approval(
                    CardPushTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .approvedBy(null)
                        .build()
                )
                .businessApplicationIdentifier(
                    CardPushTransfer.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT
                )
                .cancellation(
                    CardPushTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .canceledBy(null)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    CardPushTransfer.CreatedBy.builder()
                        .category(CardPushTransfer.CreatedBy.Category.USER)
                        .apiKey(
                            CardPushTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            CardPushTransfer.CreatedBy.OAuthApplication.builder()
                                .name("name")
                                .build()
                        )
                        .user(
                            CardPushTransfer.CreatedBy.User.builder()
                                .email("user@example.com")
                                .build()
                        )
                        .build()
                )
                .decline(
                    CardPushTransfer.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .networkTransactionIdentifier("841488484271872")
                        .reason(
                            CardPushTransfer.Decline.Reason.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
                        )
                        .build()
                )
                .idempotencyKey(null)
                .merchantCategoryCode("1234")
                .merchantCityName("New York")
                .merchantName("Acme Corp")
                .merchantNamePrefix("Acme")
                .merchantPostalCode("10045")
                .merchantState("NY")
                .presentmentAmount(
                    CardPushTransfer.PresentmentAmount.builder()
                        .currency(CardPushTransfer.PresentmentAmount.Currency.USD)
                        .value("12.34")
                        .build()
                )
                .recipientName("Ian Crease")
                .senderAddressCity("New York")
                .senderAddressLine1("33 Liberty Street")
                .senderAddressPostalCode("10045")
                .senderAddressState("NY")
                .senderName("Ian Crease")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .status(CardPushTransfer.Status.PENDING_SUBMISSION)
                .submission(
                    CardPushTransfer.Submission.builder()
                        .retrievalReferenceNumber("123456789012")
                        .senderReference("OPQRRX3BNAKA6QLT")
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .traceNumber("123456")
                        .build()
                )
                .type(CardPushTransfer.Type.CARD_PUSH_TRANSFER)
                .build()

        val roundtrippedCardPushTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardPushTransfer),
                jacksonTypeRef<CardPushTransfer>(),
            )

        assertThat(roundtrippedCardPushTransfer).isEqualTo(cardPushTransfer)
    }
}
