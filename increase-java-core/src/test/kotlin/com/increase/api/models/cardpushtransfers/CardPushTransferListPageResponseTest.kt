// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpushtransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPushTransferListPageResponseTest {

    @Test
    fun create() {
        val cardPushTransferListPageResponse =
            CardPushTransferListPageResponse.builder()
                .addData(
                    CardPushTransfer.builder()
                        .id("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")
                        .acceptance(
                            CardPushTransfer.Acceptance.builder()
                                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .authorizationIdentificationResponse(
                                    "authorization_identification_response"
                                )
                                .cardVerificationValue2Result(
                                    CardPushTransfer.Acceptance.CardVerificationValue2Result.MATCH
                                )
                                .networkTransactionIdentifier("network_transaction_identifier")
                                .build()
                        )
                        .accountId("account_in71c4amph0vgo2qllky")
                        .amount(100L)
                        .approval(
                            CardPushTransfer.Approval.builder()
                                .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .approvedBy("approved_by")
                                .build()
                        )
                        .businessApplicationIdentifier(
                            CardPushTransfer.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT
                        )
                        .cancellation(
                            CardPushTransfer.Cancellation.builder()
                                .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .canceledBy("canceled_by")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .createdBy(
                            CardPushTransfer.CreatedBy.builder()
                                .apiKey(
                                    CardPushTransfer.CreatedBy.ApiKey.builder()
                                        .description("description")
                                        .build()
                                )
                                .category(CardPushTransfer.CreatedBy.Category.USER)
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
                        .currency(CardPushTransfer.Currency.USD)
                        .decline(
                            CardPushTransfer.Decline.builder()
                                .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .networkTransactionIdentifier("network_transaction_identifier")
                                .reason(CardPushTransfer.Decline.Reason.DO_NOT_HONOR)
                                .build()
                        )
                        .idempotencyKey(null)
                        .merchantCategoryCode("1234")
                        .merchantCityName("New York")
                        .merchantName("Acme Corp")
                        .merchantNamePrefix("Acme")
                        .merchantPostalCode("10045")
                        .merchantState("NY")
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
                                .retrievalReferenceNumber("retrieval_reference_number")
                                .senderReference("sender_reference")
                                .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .traceNumber("trace_number")
                                .build()
                        )
                        .type(CardPushTransfer.Type.CARD_PUSH_TRANSFER)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(cardPushTransferListPageResponse.data())
            .containsExactly(
                CardPushTransfer.builder()
                    .id("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")
                    .acceptance(
                        CardPushTransfer.Acceptance.builder()
                            .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .authorizationIdentificationResponse(
                                "authorization_identification_response"
                            )
                            .cardVerificationValue2Result(
                                CardPushTransfer.Acceptance.CardVerificationValue2Result.MATCH
                            )
                            .networkTransactionIdentifier("network_transaction_identifier")
                            .build()
                    )
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(100L)
                    .approval(
                        CardPushTransfer.Approval.builder()
                            .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .approvedBy("approved_by")
                            .build()
                    )
                    .businessApplicationIdentifier(
                        CardPushTransfer.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT
                    )
                    .cancellation(
                        CardPushTransfer.Cancellation.builder()
                            .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .canceledBy("canceled_by")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .createdBy(
                        CardPushTransfer.CreatedBy.builder()
                            .apiKey(
                                CardPushTransfer.CreatedBy.ApiKey.builder()
                                    .description("description")
                                    .build()
                            )
                            .category(CardPushTransfer.CreatedBy.Category.USER)
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
                    .currency(CardPushTransfer.Currency.USD)
                    .decline(
                        CardPushTransfer.Decline.builder()
                            .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .networkTransactionIdentifier("network_transaction_identifier")
                            .reason(CardPushTransfer.Decline.Reason.DO_NOT_HONOR)
                            .build()
                    )
                    .idempotencyKey(null)
                    .merchantCategoryCode("1234")
                    .merchantCityName("New York")
                    .merchantName("Acme Corp")
                    .merchantNamePrefix("Acme")
                    .merchantPostalCode("10045")
                    .merchantState("NY")
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
                            .retrievalReferenceNumber("retrieval_reference_number")
                            .senderReference("sender_reference")
                            .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceNumber("trace_number")
                            .build()
                    )
                    .type(CardPushTransfer.Type.CARD_PUSH_TRANSFER)
                    .build()
            )
        assertThat(cardPushTransferListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardPushTransferListPageResponse =
            CardPushTransferListPageResponse.builder()
                .addData(
                    CardPushTransfer.builder()
                        .id("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")
                        .acceptance(
                            CardPushTransfer.Acceptance.builder()
                                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .authorizationIdentificationResponse(
                                    "authorization_identification_response"
                                )
                                .cardVerificationValue2Result(
                                    CardPushTransfer.Acceptance.CardVerificationValue2Result.MATCH
                                )
                                .networkTransactionIdentifier("network_transaction_identifier")
                                .build()
                        )
                        .accountId("account_in71c4amph0vgo2qllky")
                        .amount(100L)
                        .approval(
                            CardPushTransfer.Approval.builder()
                                .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .approvedBy("approved_by")
                                .build()
                        )
                        .businessApplicationIdentifier(
                            CardPushTransfer.BusinessApplicationIdentifier.FUNDS_DISBURSEMENT
                        )
                        .cancellation(
                            CardPushTransfer.Cancellation.builder()
                                .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .canceledBy("canceled_by")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .createdBy(
                            CardPushTransfer.CreatedBy.builder()
                                .apiKey(
                                    CardPushTransfer.CreatedBy.ApiKey.builder()
                                        .description("description")
                                        .build()
                                )
                                .category(CardPushTransfer.CreatedBy.Category.USER)
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
                        .currency(CardPushTransfer.Currency.USD)
                        .decline(
                            CardPushTransfer.Decline.builder()
                                .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .networkTransactionIdentifier("network_transaction_identifier")
                                .reason(CardPushTransfer.Decline.Reason.DO_NOT_HONOR)
                                .build()
                        )
                        .idempotencyKey(null)
                        .merchantCategoryCode("1234")
                        .merchantCityName("New York")
                        .merchantName("Acme Corp")
                        .merchantNamePrefix("Acme")
                        .merchantPostalCode("10045")
                        .merchantState("NY")
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
                                .retrievalReferenceNumber("retrieval_reference_number")
                                .senderReference("sender_reference")
                                .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .traceNumber("trace_number")
                                .build()
                        )
                        .type(CardPushTransfer.Type.CARD_PUSH_TRANSFER)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedCardPushTransferListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardPushTransferListPageResponse),
                jacksonTypeRef<CardPushTransferListPageResponse>(),
            )

        assertThat(roundtrippedCardPushTransferListPageResponse)
            .isEqualTo(cardPushTransferListPageResponse)
    }
}
