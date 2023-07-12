package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsTransferTest {

    @Test
    fun createRealTimePaymentsTransfer() {
        val realTimePaymentsTransfer =
            RealTimePaymentsTransfer.builder()
                .type(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
                .id("string")
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
                .status(RealTimePaymentsTransfer.Status.PENDING_APPROVAL)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountId("string")
                .externalAccountId("string")
                .sourceAccountNumberId("string")
                .creditorName("string")
                .remittanceInformation("string")
                .amount(123L)
                .currency(RealTimePaymentsTransfer.Currency.CAD)
                .destinationAccountNumber("string")
                .destinationRoutingNumber("string")
                .transactionId("string")
                .submission(
                    RealTimePaymentsTransfer.Submission.builder()
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionIdentification("string")
                        .build()
                )
                .rejection(
                    RealTimePaymentsTransfer.Rejection.builder()
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .rejectReasonCode(
                            RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                        )
                        .rejectReasonAdditionalInformation("string")
                        .build()
                )
                .uniqueIdentifier("string")
                .build()
        assertThat(realTimePaymentsTransfer).isNotNull
        assertThat(realTimePaymentsTransfer.type())
            .isEqualTo(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
        assertThat(realTimePaymentsTransfer.id()).isEqualTo("string")
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
        assertThat(realTimePaymentsTransfer.status())
            .isEqualTo(RealTimePaymentsTransfer.Status.PENDING_APPROVAL)
        assertThat(realTimePaymentsTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(realTimePaymentsTransfer.accountId()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.externalAccountId()).contains("string")
        assertThat(realTimePaymentsTransfer.sourceAccountNumberId()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.creditorName()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.remittanceInformation()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.amount()).isEqualTo(123L)
        assertThat(realTimePaymentsTransfer.currency())
            .isEqualTo(RealTimePaymentsTransfer.Currency.CAD)
        assertThat(realTimePaymentsTransfer.destinationAccountNumber()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.destinationRoutingNumber()).isEqualTo("string")
        assertThat(realTimePaymentsTransfer.transactionId()).contains("string")
        assertThat(realTimePaymentsTransfer.submission())
            .contains(
                RealTimePaymentsTransfer.Submission.builder()
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionIdentification("string")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.rejection())
            .contains(
                RealTimePaymentsTransfer.Rejection.builder()
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .rejectReasonCode(
                        RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                    )
                    .rejectReasonAdditionalInformation("string")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.uniqueIdentifier()).contains("string")
    }
}
