// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.fednowtransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FednowTransferTest {

    @Test
    fun create() {
        val fednowTransfer =
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
                            FednowTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
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

        assertThat(fednowTransfer.id()).isEqualTo("fednow_transfer_4i0mptrdu1mueg1196bg")
        assertThat(fednowTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(fednowTransfer.accountNumber()).isEqualTo("987654321")
        assertThat(fednowTransfer.acknowledgement())
            .contains(
                FednowTransfer.Acknowledgement.builder()
                    .acknowledgedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(fednowTransfer.amount()).isEqualTo(100L)
        assertThat(fednowTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(fednowTransfer.createdBy())
            .contains(
                FednowTransfer.CreatedBy.builder()
                    .category(FednowTransfer.CreatedBy.Category.USER)
                    .apiKey(
                        FednowTransfer.CreatedBy.ApiKey.builder().description("description").build()
                    )
                    .oauthApplication(
                        FednowTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                    )
                    .user(FednowTransfer.CreatedBy.User.builder().email("user@example.com").build())
                    .build()
            )
        assertThat(fednowTransfer.creditorName()).isEqualTo("Ian Crease")
        assertThat(fednowTransfer.currency()).isEqualTo(FednowTransfer.Currency.USD)
        assertThat(fednowTransfer.debtorName()).isEqualTo("National Phonograph Company")
        assertThat(fednowTransfer.externalAccountId()).isEmpty
        assertThat(fednowTransfer.idempotencyKey()).isEmpty
        assertThat(fednowTransfer.pendingTransactionId())
            .contains("pending_transaction_k1sfetcau2qbvjbzgju4")
        assertThat(fednowTransfer.rejection())
            .contains(
                FednowTransfer.Rejection.builder()
                    .rejectReasonAdditionalInformation(null)
                    .rejectReasonCode(FednowTransfer.Rejection.RejectReasonCode.OTHER)
                    .rejectedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(fednowTransfer.routingNumber()).isEqualTo("101050001")
        assertThat(fednowTransfer.sourceAccountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(fednowTransfer.status()).isEqualTo(FednowTransfer.Status.COMPLETE)
        assertThat(fednowTransfer.submission())
            .contains(
                FednowTransfer.Submission.builder()
                    .messageIdentification("20250308723260130GT4LAKENDXBHQCZDWS")
                    .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(fednowTransfer.transactionId()).contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(fednowTransfer.type()).isEqualTo(FednowTransfer.Type.FEDNOW_TRANSFER)
        assertThat(fednowTransfer.uniqueEndToEndTransactionReference())
            .isEqualTo("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
        assertThat(fednowTransfer.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fednowTransfer =
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
                            FednowTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
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

        val roundtrippedFednowTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fednowTransfer),
                jacksonTypeRef<FednowTransfer>(),
            )

        assertThat(roundtrippedFednowTransfer).isEqualTo(fednowTransfer)
    }
}
