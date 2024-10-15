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
                .id("id")
                .accountId("account_id")
                .accountNumber("account_number")
                .acknowledgement(
                    AchTransfer.Acknowledgement.builder().acknowledgedAt("acknowledged_at").build()
                )
                .addenda(
                    AchTransfer.Addenda.builder()
                        .category(AchTransfer.Addenda.Category.FREEFORM)
                        .freeform(
                            AchTransfer.Addenda.Freeform.builder()
                                .entries(
                                    listOf(
                                        AchTransfer.Addenda.Freeform.Entry.builder()
                                            .paymentRelatedInformation(
                                                "payment_related_information"
                                            )
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
                                            .invoiceNumber("invoice_number")
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
                        .approvedBy("approved_by")
                        .build()
                )
                .cancellation(
                    AchTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .canceledBy("canceled_by")
                        .build()
                )
                .companyDescriptiveDate("company_descriptive_date")
                .companyDiscretionaryData("company_discretionary_data")
                .companyEntryDescription("company_entry_description")
                .companyName("company_name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy(
                    AchTransfer.CreatedBy.builder()
                        .apiKey(
                            AchTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .category(AchTransfer.CreatedBy.Category.API_KEY)
                        .oauthApplication(
                            AchTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                        )
                        .user(AchTransfer.CreatedBy.User.builder().email("email").build())
                        .build()
                )
                .currency(AchTransfer.Currency.CAD)
                .destinationAccountHolder(AchTransfer.DestinationAccountHolder.BUSINESS)
                .externalAccountId("external_account_id")
                .funding(AchTransfer.Funding.CHECKING)
                .idempotencyKey("idempotency_key")
                .inboundFundsHold(
                    AchTransfer.InboundFundsHold.builder()
                        .id("id")
                        .amount(123L)
                        .automaticallyReleasesAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(AchTransfer.InboundFundsHold.Currency.CAD)
                        .heldTransactionId("held_transaction_id")
                        .pendingTransactionId("pending_transaction_id")
                        .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(AchTransfer.InboundFundsHold.Status.HELD)
                        .type(AchTransfer.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                        .build()
                )
                .individualId("individual_id")
                .individualName("individual_name")
                .network(AchTransfer.Network.ACH)
                .notificationsOfChange(
                    listOf(
                        AchTransfer.NotificationsOfChange.builder()
                            .changeCode(
                                AchTransfer.NotificationsOfChange.ChangeCode
                                    .INCORRECT_ACCOUNT_NUMBER
                            )
                            .correctedData("corrected_data")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .pendingTransactionId("pending_transaction_id")
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
                        .rawReturnReasonCode("raw_return_reason_code")
                        .returnReasonCode(AchTransfer.Return.ReturnReasonCode.INSUFFICIENT_FUND)
                        .traceNumber("trace_number")
                        .transactionId("transaction_id")
                        .transferId("transfer_id")
                        .build()
                )
                .routingNumber("routing_number")
                .settlement(
                    AchTransfer.Settlement.builder()
                        .settledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .standardEntryClassCode(
                    AchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .statementDescriptor("statement_descriptor")
                .status(AchTransfer.Status.PENDING_APPROVAL)
                .submission(
                    AchTransfer.Submission.builder()
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .expectedFundsSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expectedSettlementSchedule(
                            AchTransfer.Submission.ExpectedSettlementSchedule.SAME_DAY
                        )
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceNumber("trace_number")
                        .build()
                )
                .transactionId("transaction_id")
                .type(AchTransfer.Type.ACH_TRANSFER)
                .build()
        assertThat(achTransfer).isNotNull
        assertThat(achTransfer.id()).isEqualTo("id")
        assertThat(achTransfer.accountId()).isEqualTo("account_id")
        assertThat(achTransfer.accountNumber()).isEqualTo("account_number")
        assertThat(achTransfer.acknowledgement())
            .contains(
                AchTransfer.Acknowledgement.builder().acknowledgedAt("acknowledged_at").build()
            )
        assertThat(achTransfer.addenda())
            .contains(
                AchTransfer.Addenda.builder()
                    .category(AchTransfer.Addenda.Category.FREEFORM)
                    .freeform(
                        AchTransfer.Addenda.Freeform.builder()
                            .entries(
                                listOf(
                                    AchTransfer.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("payment_related_information")
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
                                        .invoiceNumber("invoice_number")
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
                    .approvedBy("approved_by")
                    .build()
            )
        assertThat(achTransfer.cancellation())
            .contains(
                AchTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .canceledBy("canceled_by")
                    .build()
            )
        assertThat(achTransfer.companyDescriptiveDate()).contains("company_descriptive_date")
        assertThat(achTransfer.companyDiscretionaryData()).contains("company_discretionary_data")
        assertThat(achTransfer.companyEntryDescription()).contains("company_entry_description")
        assertThat(achTransfer.companyName()).contains("company_name")
        assertThat(achTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(achTransfer.createdBy())
            .contains(
                AchTransfer.CreatedBy.builder()
                    .apiKey(
                        AchTransfer.CreatedBy.ApiKey.builder().description("description").build()
                    )
                    .category(AchTransfer.CreatedBy.Category.API_KEY)
                    .oauthApplication(
                        AchTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                    )
                    .user(AchTransfer.CreatedBy.User.builder().email("email").build())
                    .build()
            )
        assertThat(achTransfer.currency()).isEqualTo(AchTransfer.Currency.CAD)
        assertThat(achTransfer.destinationAccountHolder())
            .isEqualTo(AchTransfer.DestinationAccountHolder.BUSINESS)
        assertThat(achTransfer.externalAccountId()).contains("external_account_id")
        assertThat(achTransfer.funding()).isEqualTo(AchTransfer.Funding.CHECKING)
        assertThat(achTransfer.idempotencyKey()).contains("idempotency_key")
        assertThat(achTransfer.inboundFundsHold())
            .contains(
                AchTransfer.InboundFundsHold.builder()
                    .id("id")
                    .amount(123L)
                    .automaticallyReleasesAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(AchTransfer.InboundFundsHold.Currency.CAD)
                    .heldTransactionId("held_transaction_id")
                    .pendingTransactionId("pending_transaction_id")
                    .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(AchTransfer.InboundFundsHold.Status.HELD)
                    .type(AchTransfer.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                    .build()
            )
        assertThat(achTransfer.individualId()).contains("individual_id")
        assertThat(achTransfer.individualName()).contains("individual_name")
        assertThat(achTransfer.network()).isEqualTo(AchTransfer.Network.ACH)
        assertThat(achTransfer.notificationsOfChange())
            .containsExactly(
                AchTransfer.NotificationsOfChange.builder()
                    .changeCode(
                        AchTransfer.NotificationsOfChange.ChangeCode.INCORRECT_ACCOUNT_NUMBER
                    )
                    .correctedData("corrected_data")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(achTransfer.pendingTransactionId()).contains("pending_transaction_id")
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
                    .rawReturnReasonCode("raw_return_reason_code")
                    .returnReasonCode(AchTransfer.Return.ReturnReasonCode.INSUFFICIENT_FUND)
                    .traceNumber("trace_number")
                    .transactionId("transaction_id")
                    .transferId("transfer_id")
                    .build()
            )
        assertThat(achTransfer.routingNumber()).isEqualTo("routing_number")
        assertThat(achTransfer.settlement())
            .contains(
                AchTransfer.Settlement.builder()
                    .settledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(achTransfer.standardEntryClassCode())
            .isEqualTo(AchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
        assertThat(achTransfer.statementDescriptor()).isEqualTo("statement_descriptor")
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
                    .traceNumber("trace_number")
                    .build()
            )
        assertThat(achTransfer.transactionId()).contains("transaction_id")
        assertThat(achTransfer.type()).isEqualTo(AchTransfer.Type.ACH_TRANSFER)
    }
}
