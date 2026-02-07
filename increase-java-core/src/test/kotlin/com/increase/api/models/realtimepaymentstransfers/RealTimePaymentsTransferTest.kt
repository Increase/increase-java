// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentstransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimePaymentsTransferTest {

    @Test
    fun create() {
        val realTimePaymentsTransfer =
            RealTimePaymentsTransfer.builder()
                .id("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                .accountId("account_in71c4amph0vgo2qllky")
                .acknowledgement(
                    RealTimePaymentsTransfer.Acknowledgement.builder()
                        .acknowledgedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .amount(100L)
                .approval(
                    RealTimePaymentsTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .approvedBy(null)
                        .build()
                )
                .cancellation(
                    RealTimePaymentsTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .canceledBy(null)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    RealTimePaymentsTransfer.CreatedBy.builder()
                        .category(RealTimePaymentsTransfer.CreatedBy.Category.USER)
                        .apiKey(
                            RealTimePaymentsTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            RealTimePaymentsTransfer.CreatedBy.OAuthApplication.builder()
                                .name("name")
                                .build()
                        )
                        .user(
                            RealTimePaymentsTransfer.CreatedBy.User.builder()
                                .email("user@example.com")
                                .build()
                        )
                        .build()
                )
                .creditorName("Ian Crease")
                .currency(RealTimePaymentsTransfer.Currency.USD)
                .debtorName(null)
                .destinationAccountNumber("987654321")
                .destinationRoutingNumber("101050001")
                .externalAccountId(null)
                .idempotencyKey(null)
                .pendingTransactionId(null)
                .rejection(
                    RealTimePaymentsTransfer.Rejection.builder()
                        .rejectReasonAdditionalInformation(null)
                        .rejectReasonCode(
                            RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                        )
                        .rejectedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .remittanceInformation("Invoice 29582")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .status(RealTimePaymentsTransfer.Status.COMPLETE)
                .submission(
                    RealTimePaymentsTransfer.Submission.builder()
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transactionIdentification("20220501234567891T1BSLZO01745013025")
                        .build()
                )
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
                .ultimateCreditorName(null)
                .ultimateDebtorName(null)
                .build()

        assertThat(realTimePaymentsTransfer.id())
            .isEqualTo("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
        assertThat(realTimePaymentsTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(realTimePaymentsTransfer.acknowledgement())
            .contains(
                RealTimePaymentsTransfer.Acknowledgement.builder()
                    .acknowledgedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(realTimePaymentsTransfer.amount()).isEqualTo(100L)
        assertThat(realTimePaymentsTransfer.approval())
            .contains(
                RealTimePaymentsTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .approvedBy(null)
                    .build()
            )
        assertThat(realTimePaymentsTransfer.cancellation())
            .contains(
                RealTimePaymentsTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .canceledBy(null)
                    .build()
            )
        assertThat(realTimePaymentsTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(realTimePaymentsTransfer.createdBy())
            .contains(
                RealTimePaymentsTransfer.CreatedBy.builder()
                    .category(RealTimePaymentsTransfer.CreatedBy.Category.USER)
                    .apiKey(
                        RealTimePaymentsTransfer.CreatedBy.ApiKey.builder()
                            .description("description")
                            .build()
                    )
                    .oauthApplication(
                        RealTimePaymentsTransfer.CreatedBy.OAuthApplication.builder()
                            .name("name")
                            .build()
                    )
                    .user(
                        RealTimePaymentsTransfer.CreatedBy.User.builder()
                            .email("user@example.com")
                            .build()
                    )
                    .build()
            )
        assertThat(realTimePaymentsTransfer.creditorName()).isEqualTo("Ian Crease")
        assertThat(realTimePaymentsTransfer.currency())
            .isEqualTo(RealTimePaymentsTransfer.Currency.USD)
        assertThat(realTimePaymentsTransfer.debtorName()).isEmpty
        assertThat(realTimePaymentsTransfer.destinationAccountNumber()).isEqualTo("987654321")
        assertThat(realTimePaymentsTransfer.destinationRoutingNumber()).isEqualTo("101050001")
        assertThat(realTimePaymentsTransfer.externalAccountId()).isEmpty
        assertThat(realTimePaymentsTransfer.idempotencyKey()).isEmpty
        assertThat(realTimePaymentsTransfer.pendingTransactionId()).isEmpty
        assertThat(realTimePaymentsTransfer.rejection())
            .contains(
                RealTimePaymentsTransfer.Rejection.builder()
                    .rejectReasonAdditionalInformation(null)
                    .rejectReasonCode(
                        RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                    )
                    .rejectedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(realTimePaymentsTransfer.remittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(realTimePaymentsTransfer.sourceAccountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(realTimePaymentsTransfer.status())
            .isEqualTo(RealTimePaymentsTransfer.Status.COMPLETE)
        assertThat(realTimePaymentsTransfer.submission())
            .contains(
                RealTimePaymentsTransfer.Submission.builder()
                    .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .transactionIdentification("20220501234567891T1BSLZO01745013025")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.transactionId())
            .contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(realTimePaymentsTransfer.type())
            .isEqualTo(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
        assertThat(realTimePaymentsTransfer.ultimateCreditorName()).isEmpty
        assertThat(realTimePaymentsTransfer.ultimateDebtorName()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val realTimePaymentsTransfer =
            RealTimePaymentsTransfer.builder()
                .id("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                .accountId("account_in71c4amph0vgo2qllky")
                .acknowledgement(
                    RealTimePaymentsTransfer.Acknowledgement.builder()
                        .acknowledgedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .amount(100L)
                .approval(
                    RealTimePaymentsTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .approvedBy(null)
                        .build()
                )
                .cancellation(
                    RealTimePaymentsTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .canceledBy(null)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    RealTimePaymentsTransfer.CreatedBy.builder()
                        .category(RealTimePaymentsTransfer.CreatedBy.Category.USER)
                        .apiKey(
                            RealTimePaymentsTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            RealTimePaymentsTransfer.CreatedBy.OAuthApplication.builder()
                                .name("name")
                                .build()
                        )
                        .user(
                            RealTimePaymentsTransfer.CreatedBy.User.builder()
                                .email("user@example.com")
                                .build()
                        )
                        .build()
                )
                .creditorName("Ian Crease")
                .currency(RealTimePaymentsTransfer.Currency.USD)
                .debtorName(null)
                .destinationAccountNumber("987654321")
                .destinationRoutingNumber("101050001")
                .externalAccountId(null)
                .idempotencyKey(null)
                .pendingTransactionId(null)
                .rejection(
                    RealTimePaymentsTransfer.Rejection.builder()
                        .rejectReasonAdditionalInformation(null)
                        .rejectReasonCode(
                            RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                        )
                        .rejectedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .remittanceInformation("Invoice 29582")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .status(RealTimePaymentsTransfer.Status.COMPLETE)
                .submission(
                    RealTimePaymentsTransfer.Submission.builder()
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transactionIdentification("20220501234567891T1BSLZO01745013025")
                        .build()
                )
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
                .ultimateCreditorName(null)
                .ultimateDebtorName(null)
                .build()

        val roundtrippedRealTimePaymentsTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(realTimePaymentsTransfer),
                jacksonTypeRef<RealTimePaymentsTransfer>(),
            )

        assertThat(roundtrippedRealTimePaymentsTransfer).isEqualTo(realTimePaymentsTransfer)
    }
}
