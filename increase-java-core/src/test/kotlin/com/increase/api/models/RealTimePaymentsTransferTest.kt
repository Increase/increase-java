// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsTransferTest {

    @Test
    fun createRealTimePaymentsTransfer() {
        val realTimePaymentsTransfer =
            RealTimePaymentsTransfer.builder()
                .id("string")
                .accountId("string")
                .amount(123L)
                .approval(
                    RealTimePaymentsTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .approvedBy("string")
                        .build()
                )
                .cancellation(
                    RealTimePaymentsTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .canceledBy("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditorName("string")
                .currency(RealTimePaymentsTransfer.Currency.CAD)
                .debtorName("string")
                .destinationAccountNumber("string")
                .destinationRoutingNumber("string")
                .externalAccountId("string")
                .idempotencyKey("string")
                .pendingTransactionId("string")
                .rejection(
                    RealTimePaymentsTransfer.Rejection.builder()
                        .rejectReasonAdditionalInformation("string")
                        .rejectReasonCode(
                            RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                        )
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .remittanceInformation("string")
                .sourceAccountNumberId("string")
                .status(RealTimePaymentsTransfer.Status.PENDING_APPROVAL)
                .submission(
                    RealTimePaymentsTransfer.Submission.builder()
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionIdentification("string")
                        .build()
                )
                .transactionId("string")
                .type(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
                .ultimateCreditorName("string")
                .ultimateDebtorName("string")
                .build()
        assertThat(realTimePaymentsTransfer).isNotNull
        assertThat(realTimePaymentsTransfer.id()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.accountId()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.amount()).isEqualTo(123L)
        assertThat(realTimePaymentsTransfer.approval())
            .contains(
                RealTimePaymentsTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .approvedBy("string")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.cancellation())
            .contains(
                RealTimePaymentsTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .canceledBy("string")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(realTimePaymentsTransfer.creditorName()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.currency())
            .isEqualTo(RealTimePaymentsTransfer.Currency.CAD)
        assertThat(realTimePaymentsTransfer.debtorName()).contains("string")
        assertThat(realTimePaymentsTransfer.destinationAccountNumber()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.destinationRoutingNumber()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.externalAccountId()).contains("string")
        assertThat(realTimePaymentsTransfer.idempotencyKey()).contains("string")
        assertThat(realTimePaymentsTransfer.pendingTransactionId()).contains("string")
        assertThat(realTimePaymentsTransfer.rejection())
            .contains(
                RealTimePaymentsTransfer.Rejection.builder()
                    .rejectReasonAdditionalInformation("string")
                    .rejectReasonCode(
                        RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                    )
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(realTimePaymentsTransfer.remittanceInformation()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.sourceAccountNumberId()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.status())
            .isEqualTo(RealTimePaymentsTransfer.Status.PENDING_APPROVAL)
        assertThat(realTimePaymentsTransfer.submission())
            .contains(
                RealTimePaymentsTransfer.Submission.builder()
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionIdentification("string")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.transactionId()).contains("string")
        assertThat(realTimePaymentsTransfer.type())
            .isEqualTo(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
        assertThat(realTimePaymentsTransfer.ultimateCreditorName()).contains("string")
        assertThat(realTimePaymentsTransfer.ultimateDebtorName()).contains("string")
    }
}
