// File generated from our OpenAPI spec by Stainless.

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
                .id("string")
                .accountId("string")
                .accountNumber("string")
                .acknowledgement(
                    AchTransfer.Acknowledgement.builder().acknowledgedAt("string").build()
                )
                .addenda(
                    AchTransfer.Addenda.builder()
                        .category(AchTransfer.Addenda.Category.FREEFORM)
                        .freeform(
                            AchTransfer.Addenda.Freeform.builder()
                                .entries(
                                    listOf(
                                        AchTransfer.Addenda.Freeform.Entry.builder()
                                            .paymentRelatedInformation("string")
                                            .build()
                                    )
                                )
                                .build()
                        )
                        .paymentOrderRemittanceAdvice(
                            AchTransfer.Addenda.PaymentOrderRemittanceAdvice.builder()
                                .invoices(
                                    listOf(
                                        AchTransfer.Addenda.PaymentOrderRemittanceAdvice.Invoice
                                            .builder()
                                            .invoiceNumber("string")
                                            .paidAmount(123L)
                                            .build()
                                    )
                                )
                                .build()
                        )
                        .build()
                )
                .amount(123L)
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
                .companyDescriptiveDate("string")
                .companyDiscretionaryData("string")
                .companyEntryDescription("string")
                .companyName("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy(
                    AchTransfer.CreatedBy.builder()
                        .apiKey(
                            AchTransfer.CreatedBy.ApiKey.builder().description("string").build()
                        )
                        .category(AchTransfer.CreatedBy.Category.API_KEY)
                        .oauthApplication(
                            AchTransfer.CreatedBy.OAuthApplication.builder().name("string").build()
                        )
                        .user(AchTransfer.CreatedBy.User.builder().email("string").build())
                        .build()
                )
                .currency(AchTransfer.Currency.CAD)
                .destinationAccountHolder(AchTransfer.DestinationAccountHolder.BUSINESS)
                .externalAccountId("string")
                .funding(AchTransfer.Funding.CHECKING)
                .idempotencyKey("string")
                .individualId("string")
                .individualName("string")
                .network(AchTransfer.Network.ACH)
                .notificationsOfChange(
                    listOf(
                        AchTransfer.NotificationsOfChange.builder()
                            .changeCode(
                                AchTransfer.NotificationsOfChange.ChangeCode
                                    .INCORRECT_ACCOUNT_NUMBER
                            )
                            .correctedData("string")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .pendingTransactionId("string")
                .preferredEffectiveDate(
                    AchTransfer.PreferredEffectiveDate.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .settlementSchedule(
                            AchTransfer.PreferredEffectiveDate.SettlementSchedule.SAME_DAY
                        )
                        .build()
                )
                .return_(
                    AchTransfer.Return.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .rawReturnReasonCode("string")
                        .returnReasonCode(AchTransfer.Return.ReturnReasonCode.INSUFFICIENT_FUND)
                        .traceNumber("string")
                        .transactionId("string")
                        .transferId("string")
                        .build()
                )
                .routingNumber("string")
                .standardEntryClassCode(
                    AchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .statementDescriptor("string")
                .status(AchTransfer.Status.PENDING_APPROVAL)
                .submission(
                    AchTransfer.Submission.builder()
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .expectedFundsSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expectedSettlementSchedule(
                            AchTransfer.Submission.ExpectedSettlementSchedule.SAME_DAY
                        )
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceNumber("string")
                        .build()
                )
                .transactionId("string")
                .type(AchTransfer.Type.ACH_TRANSFER)
                .build()
        assertThat(achTransfer).isNotNull
        assertThat(achTransfer.id()).isEqualTo("string")
        assertThat(achTransfer.accountId()).isEqualTo("string")
        assertThat(achTransfer.accountNumber()).isEqualTo("string")
        assertThat(achTransfer.acknowledgement())
            .contains(AchTransfer.Acknowledgement.builder().acknowledgedAt("string").build())
        assertThat(achTransfer.addenda())
            .contains(
                AchTransfer.Addenda.builder()
                    .category(AchTransfer.Addenda.Category.FREEFORM)
                    .freeform(
                        AchTransfer.Addenda.Freeform.builder()
                            .entries(
                                listOf(
                                    AchTransfer.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("string")
                                        .build()
                                )
                            )
                            .build()
                    )
                    .paymentOrderRemittanceAdvice(
                        AchTransfer.Addenda.PaymentOrderRemittanceAdvice.builder()
                            .invoices(
                                listOf(
                                    AchTransfer.Addenda.PaymentOrderRemittanceAdvice.Invoice
                                        .builder()
                                        .invoiceNumber("string")
                                        .paidAmount(123L)
                                        .build()
                                )
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(achTransfer.amount()).isEqualTo(123L)
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
        assertThat(achTransfer.companyDescriptiveDate()).contains("string")
        assertThat(achTransfer.companyDiscretionaryData()).contains("string")
        assertThat(achTransfer.companyEntryDescription()).contains("string")
        assertThat(achTransfer.companyName()).contains("string")
        assertThat(achTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(achTransfer.createdBy())
            .contains(
                AchTransfer.CreatedBy.builder()
                    .apiKey(AchTransfer.CreatedBy.ApiKey.builder().description("string").build())
                    .category(AchTransfer.CreatedBy.Category.API_KEY)
                    .oauthApplication(
                        AchTransfer.CreatedBy.OAuthApplication.builder().name("string").build()
                    )
                    .user(AchTransfer.CreatedBy.User.builder().email("string").build())
                    .build()
            )
        assertThat(achTransfer.currency()).isEqualTo(AchTransfer.Currency.CAD)
        assertThat(achTransfer.destinationAccountHolder())
            .isEqualTo(AchTransfer.DestinationAccountHolder.BUSINESS)
        assertThat(achTransfer.externalAccountId()).contains("string")
        assertThat(achTransfer.funding()).isEqualTo(AchTransfer.Funding.CHECKING)
        assertThat(achTransfer.idempotencyKey()).contains("string")
        assertThat(achTransfer.individualId()).contains("string")
        assertThat(achTransfer.individualName()).contains("string")
        assertThat(achTransfer.network()).isEqualTo(AchTransfer.Network.ACH)
        assertThat(achTransfer.notificationsOfChange())
            .containsExactly(
                AchTransfer.NotificationsOfChange.builder()
                    .changeCode(
                        AchTransfer.NotificationsOfChange.ChangeCode.INCORRECT_ACCOUNT_NUMBER
                    )
                    .correctedData("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(achTransfer.pendingTransactionId()).contains("string")
        assertThat(achTransfer.preferredEffectiveDate())
            .isEqualTo(
                AchTransfer.PreferredEffectiveDate.builder()
                    .date(LocalDate.parse("2019-12-27"))
                    .settlementSchedule(
                        AchTransfer.PreferredEffectiveDate.SettlementSchedule.SAME_DAY
                    )
                    .build()
            )
        assertThat(achTransfer.return_())
            .contains(
                AchTransfer.Return.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .rawReturnReasonCode("string")
                    .returnReasonCode(AchTransfer.Return.ReturnReasonCode.INSUFFICIENT_FUND)
                    .traceNumber("string")
                    .transactionId("string")
                    .transferId("string")
                    .build()
            )
        assertThat(achTransfer.routingNumber()).isEqualTo("string")
        assertThat(achTransfer.standardEntryClassCode())
            .isEqualTo(AchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
        assertThat(achTransfer.statementDescriptor()).isEqualTo("string")
        assertThat(achTransfer.status()).isEqualTo(AchTransfer.Status.PENDING_APPROVAL)
        assertThat(achTransfer.submission())
            .contains(
                AchTransfer.Submission.builder()
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .expectedFundsSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expectedSettlementSchedule(
                        AchTransfer.Submission.ExpectedSettlementSchedule.SAME_DAY
                    )
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .traceNumber("string")
                    .build()
            )
        assertThat(achTransfer.transactionId()).contains("string")
        assertThat(achTransfer.type()).isEqualTo(AchTransfer.Type.ACH_TRANSFER)
    }
}
