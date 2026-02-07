// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.fednowtransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FednowTransferListPageResponseTest {

    @Test
    fun create() {
        val fednowTransferListPageResponse =
            FednowTransferListPageResponse.builder()
                .addData(
                    FednowTransfer.builder()
                        .id("fednow_transfer_4i0mptrdu1mueg1196bg")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .accountNumber("987654321")
                        .acknowledgement(
                            FednowTransfer.Acknowledgement.builder()
                                .acknowledgedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .amount(100L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .createdBy(
                            FednowTransfer.CreatedBy.builder()
                                .category(FednowTransfer.CreatedBy.Category.USER)
                                .apiKey(
                                    FednowTransfer.CreatedBy.ApiKey.builder()
                                        .description("description")
                                        .build()
                                )
                                .oauthApplication(
                                    FednowTransfer.CreatedBy.OAuthApplication.builder()
                                        .name("name")
                                        .build()
                                )
                                .user(
                                    FednowTransfer.CreatedBy.User.builder()
                                        .email("user@example.com")
                                        .build()
                                )
                                .build()
                        )
                        .creditorName("Ian Crease")
                        .currency(FednowTransfer.Currency.USD)
                        .debtorName("National Phonograph Company")
                        .externalAccountId(null)
                        .idempotencyKey(null)
                        .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                        .rejection(
                            FednowTransfer.Rejection.builder()
                                .rejectReasonAdditionalInformation(null)
                                .rejectReasonCode(FednowTransfer.Rejection.RejectReasonCode.OTHER)
                                .rejectedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .routingNumber("101050001")
                        .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .status(FednowTransfer.Status.COMPLETE)
                        .submission(
                            FednowTransfer.Submission.builder()
                                .messageIdentification("20250308723260130GT4LAKENDXBHQCZDWS")
                                .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .type(FednowTransfer.Type.FEDNOW_TRANSFER)
                        .uniqueEndToEndTransactionReference("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
                        .unstructuredRemittanceInformation("Invoice 29582")
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(fednowTransferListPageResponse.data())
            .containsExactly(
                FednowTransfer.builder()
                    .id("fednow_transfer_4i0mptrdu1mueg1196bg")
                    .accountId("account_in71c4amph0vgo2qllky")
                    .accountNumber("987654321")
                    .acknowledgement(
                        FednowTransfer.Acknowledgement.builder()
                            .acknowledgedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .build()
                    )
                    .amount(100L)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .createdBy(
                        FednowTransfer.CreatedBy.builder()
                            .category(FednowTransfer.CreatedBy.Category.USER)
                            .apiKey(
                                FednowTransfer.CreatedBy.ApiKey.builder()
                                    .description("description")
                                    .build()
                            )
                            .oauthApplication(
                                FednowTransfer.CreatedBy.OAuthApplication.builder()
                                    .name("name")
                                    .build()
                            )
                            .user(
                                FednowTransfer.CreatedBy.User.builder()
                                    .email("user@example.com")
                                    .build()
                            )
                            .build()
                    )
                    .creditorName("Ian Crease")
                    .currency(FednowTransfer.Currency.USD)
                    .debtorName("National Phonograph Company")
                    .externalAccountId(null)
                    .idempotencyKey(null)
                    .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                    .rejection(
                        FednowTransfer.Rejection.builder()
                            .rejectReasonAdditionalInformation(null)
                            .rejectReasonCode(FednowTransfer.Rejection.RejectReasonCode.OTHER)
                            .rejectedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .build()
                    )
                    .routingNumber("101050001")
                    .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .status(FednowTransfer.Status.COMPLETE)
                    .submission(
                        FednowTransfer.Submission.builder()
                            .messageIdentification("20250308723260130GT4LAKENDXBHQCZDWS")
                            .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .build()
                    )
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .type(FednowTransfer.Type.FEDNOW_TRANSFER)
                    .uniqueEndToEndTransactionReference("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
                    .unstructuredRemittanceInformation("Invoice 29582")
                    .build()
            )
        assertThat(fednowTransferListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fednowTransferListPageResponse =
            FednowTransferListPageResponse.builder()
                .addData(
                    FednowTransfer.builder()
                        .id("fednow_transfer_4i0mptrdu1mueg1196bg")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .accountNumber("987654321")
                        .acknowledgement(
                            FednowTransfer.Acknowledgement.builder()
                                .acknowledgedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .amount(100L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .createdBy(
                            FednowTransfer.CreatedBy.builder()
                                .category(FednowTransfer.CreatedBy.Category.USER)
                                .apiKey(
                                    FednowTransfer.CreatedBy.ApiKey.builder()
                                        .description("description")
                                        .build()
                                )
                                .oauthApplication(
                                    FednowTransfer.CreatedBy.OAuthApplication.builder()
                                        .name("name")
                                        .build()
                                )
                                .user(
                                    FednowTransfer.CreatedBy.User.builder()
                                        .email("user@example.com")
                                        .build()
                                )
                                .build()
                        )
                        .creditorName("Ian Crease")
                        .currency(FednowTransfer.Currency.USD)
                        .debtorName("National Phonograph Company")
                        .externalAccountId(null)
                        .idempotencyKey(null)
                        .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                        .rejection(
                            FednowTransfer.Rejection.builder()
                                .rejectReasonAdditionalInformation(null)
                                .rejectReasonCode(FednowTransfer.Rejection.RejectReasonCode.OTHER)
                                .rejectedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .routingNumber("101050001")
                        .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .status(FednowTransfer.Status.COMPLETE)
                        .submission(
                            FednowTransfer.Submission.builder()
                                .messageIdentification("20250308723260130GT4LAKENDXBHQCZDWS")
                                .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .type(FednowTransfer.Type.FEDNOW_TRANSFER)
                        .uniqueEndToEndTransactionReference("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
                        .unstructuredRemittanceInformation("Invoice 29582")
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedFednowTransferListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fednowTransferListPageResponse),
                jacksonTypeRef<FednowTransferListPageResponse>(),
            )

        assertThat(roundtrippedFednowTransferListPageResponse)
            .isEqualTo(fednowTransferListPageResponse)
    }
}
