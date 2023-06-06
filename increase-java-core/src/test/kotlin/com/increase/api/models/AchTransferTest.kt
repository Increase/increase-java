package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchTransferTest {

    @Test
    fun createAchTransfer() {
        val achTransfer =
            AchTransfer.builder()
                .accountId("string")
                .accountNumber("string")
                .addendum("string")
                .amount(123L)
                .currency(AchTransfer.Currency.CAD)
                .approval(
                    AchTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .approvedBy("string")
                        .build()
                )
                .cancellation(
                    AchTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .canceledBy("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("string")
                .id("string")
                .network(AchTransfer.Network.ACH)
                .notificationsOfChange(
                    listOf(
                        AchTransfer.NotificationsOfChange.builder()
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .changeCode("string")
                            .correctedData("string")
                            .build()
                    )
                )
                .return_(
                    AchTransfer.Return.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .returnReasonCode(AchTransfer.Return.ReturnReasonCode.INSUFFICIENT_FUND)
                        .rawReturnReasonCode("string")
                        .transferId("string")
                        .transactionId("string")
                        .build()
                )
                .routingNumber("string")
                .statementDescriptor("string")
                .status(AchTransfer.Status.PENDING_APPROVAL)
                .submission(
                    AchTransfer.Submission.builder()
                        .traceNumber("string")
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .transactionId("string")
                .companyDescriptiveDate("string")
                .companyDiscretionaryData("string")
                .companyEntryDescription("string")
                .companyName("string")
                .funding(AchTransfer.Funding.CHECKING)
                .individualId("string")
                .individualName("string")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .standardEntryClassCode(
                    AchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .type(AchTransfer.Type.ACH_TRANSFER)
                .build()
        assertThat(achTransfer).isNotNull
        assertThat(achTransfer.accountId()).isEqualTo("string")
        assertThat(achTransfer.accountNumber()).isEqualTo("string")
        assertThat(achTransfer.addendum()).contains("string")
        assertThat(achTransfer.amount()).isEqualTo(123L)
        assertThat(achTransfer.currency()).isEqualTo(AchTransfer.Currency.CAD)
        assertThat(achTransfer.approval())
            .contains(
                AchTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .approvedBy("string")
                    .build()
            )
        assertThat(achTransfer.cancellation())
            .contains(
                AchTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .canceledBy("string")
                    .build()
            )
        assertThat(achTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(achTransfer.externalAccountId()).contains("string")
        assertThat(achTransfer.id()).isEqualTo("string")
        assertThat(achTransfer.network()).isEqualTo(AchTransfer.Network.ACH)
        assertThat(achTransfer.notificationsOfChange())
            .containsExactly(
                AchTransfer.NotificationsOfChange.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .changeCode("string")
                    .correctedData("string")
                    .build()
            )
        assertThat(achTransfer.return_())
            .contains(
                AchTransfer.Return.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .returnReasonCode(AchTransfer.Return.ReturnReasonCode.INSUFFICIENT_FUND)
                    .rawReturnReasonCode("string")
                    .transferId("string")
                    .transactionId("string")
                    .build()
            )
        assertThat(achTransfer.routingNumber()).isEqualTo("string")
        assertThat(achTransfer.statementDescriptor()).isEqualTo("string")
        assertThat(achTransfer.status()).isEqualTo(AchTransfer.Status.PENDING_APPROVAL)
        assertThat(achTransfer.submission())
            .contains(
                AchTransfer.Submission.builder()
                    .traceNumber("string")
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(achTransfer.transactionId()).contains("string")
        assertThat(achTransfer.companyDescriptiveDate()).contains("string")
        assertThat(achTransfer.companyDiscretionaryData()).contains("string")
        assertThat(achTransfer.companyEntryDescription()).contains("string")
        assertThat(achTransfer.companyName()).contains("string")
        assertThat(achTransfer.funding()).isEqualTo(AchTransfer.Funding.CHECKING)
        assertThat(achTransfer.individualId()).contains("string")
        assertThat(achTransfer.individualName()).contains("string")
        assertThat(achTransfer.effectiveDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(achTransfer.standardEntryClassCode())
            .isEqualTo(AchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
        assertThat(achTransfer.type()).isEqualTo(AchTransfer.Type.ACH_TRANSFER)
    }
}
