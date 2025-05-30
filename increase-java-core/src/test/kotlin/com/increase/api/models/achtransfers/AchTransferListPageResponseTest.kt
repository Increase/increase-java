// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achtransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AchTransferListPageResponseTest {

    @Test
    fun create() {
        val achTransferListPageResponse =
            AchTransferListPageResponse.builder()
                .addData(
                    AchTransfer.builder()
                        .id("ach_transfer_uoxatyh3lt5evrsdvo7q")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .accountNumber("987654321")
                        .acknowledgement(
                            AchTransfer.Acknowledgement.builder()
                                .acknowledgedAt("2020-01-31T23:59:59Z")
                                .build()
                        )
                        .addenda(
                            AchTransfer.Addenda.builder()
                                .category(AchTransfer.Addenda.Category.FREEFORM)
                                .freeform(
                                    AchTransfer.Addenda.Freeform.builder()
                                        .addEntry(
                                            AchTransfer.Addenda.Freeform.Entry.builder()
                                                .paymentRelatedInformation(
                                                    "payment_related_information"
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .paymentOrderRemittanceAdvice(
                                    AchTransfer.Addenda.PaymentOrderRemittanceAdvice.builder()
                                        .addInvoice(
                                            AchTransfer.Addenda.PaymentOrderRemittanceAdvice.Invoice
                                                .builder()
                                                .invoiceNumber("invoice_number")
                                                .paidAmount(0L)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .amount(100L)
                        .approval(
                            AchTransfer.Approval.builder()
                                .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .approvedBy(null)
                                .build()
                        )
                        .cancellation(
                            AchTransfer.Cancellation.builder()
                                .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .canceledBy("canceled_by")
                                .build()
                        )
                        .companyDescriptiveDate(null)
                        .companyDiscretionaryData(null)
                        .companyEntryDescription(null)
                        .companyId("1234987601")
                        .companyName("National Phonograph Company")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .createdBy(
                            AchTransfer.CreatedBy.builder()
                                .apiKey(
                                    AchTransfer.CreatedBy.ApiKey.builder()
                                        .description("description")
                                        .build()
                                )
                                .category(AchTransfer.CreatedBy.Category.USER)
                                .oauthApplication(
                                    AchTransfer.CreatedBy.OAuthApplication.builder()
                                        .name("name")
                                        .build()
                                )
                                .user(
                                    AchTransfer.CreatedBy.User.builder()
                                        .email("user@example.com")
                                        .build()
                                )
                                .build()
                        )
                        .currency(AchTransfer.Currency.USD)
                        .destinationAccountHolder(AchTransfer.DestinationAccountHolder.BUSINESS)
                        .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                        .funding(AchTransfer.Funding.CHECKING)
                        .idempotencyKey(null)
                        .inboundFundsHold(
                            AchTransfer.InboundFundsHold.builder()
                                .id("id")
                                .amount(0L)
                                .automaticallyReleasesAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency(AchTransfer.InboundFundsHold.Currency.CAD)
                                .heldTransactionId("held_transaction_id")
                                .pendingTransactionId("pending_transaction_id")
                                .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(AchTransfer.InboundFundsHold.Status.HELD)
                                .type(AchTransfer.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                                .build()
                        )
                        .individualId(null)
                        .individualName("Ian Crease")
                        .network(AchTransfer.Network.ACH)
                        .addNotificationsOfChange(
                            AchTransfer.NotificationsOfChange.builder()
                                .changeCode(
                                    AchTransfer.NotificationsOfChange.ChangeCode
                                        .INCORRECT_TRANSACTION_CODE
                                )
                                .correctedData("32")
                                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .pendingTransactionId(null)
                        .preferredEffectiveDate(
                            AchTransfer.PreferredEffectiveDate.builder()
                                .date(null)
                                .settlementSchedule(
                                    AchTransfer.PreferredEffectiveDate.SettlementSchedule.SAME_DAY
                                )
                                .build()
                        )
                        .return_(
                            AchTransfer.Return.builder()
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .rawReturnReasonCode("raw_return_reason_code")
                                .returnReasonCode(
                                    AchTransfer.Return.ReturnReasonCode.INSUFFICIENT_FUND
                                )
                                .traceNumber("trace_number")
                                .transactionId("transaction_id")
                                .transferId("transfer_id")
                                .build()
                        )
                        .routingNumber("101050001")
                        .settlement(
                            AchTransfer.Settlement.builder()
                                .settledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .standardEntryClassCode(
                            AchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                        )
                        .statementDescriptor("Statement descriptor")
                        .status(AchTransfer.Status.RETURNED)
                        .submission(
                            AchTransfer.Submission.builder()
                                .effectiveDate(LocalDate.parse("2020-01-31"))
                                .expectedFundsSettlementAt(
                                    OffsetDateTime.parse("2020-02-03T13:30:00Z")
                                )
                                .expectedSettlementSchedule(
                                    AchTransfer.Submission.ExpectedSettlementSchedule.FUTURE_DATED
                                )
                                .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .traceNumber("058349238292834")
                                .build()
                        )
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .type(AchTransfer.Type.ACH_TRANSFER)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(achTransferListPageResponse.data())
            .containsExactly(
                AchTransfer.builder()
                    .id("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .accountId("account_in71c4amph0vgo2qllky")
                    .accountNumber("987654321")
                    .acknowledgement(
                        AchTransfer.Acknowledgement.builder()
                            .acknowledgedAt("2020-01-31T23:59:59Z")
                            .build()
                    )
                    .addenda(
                        AchTransfer.Addenda.builder()
                            .category(AchTransfer.Addenda.Category.FREEFORM)
                            .freeform(
                                AchTransfer.Addenda.Freeform.builder()
                                    .addEntry(
                                        AchTransfer.Addenda.Freeform.Entry.builder()
                                            .paymentRelatedInformation(
                                                "payment_related_information"
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .paymentOrderRemittanceAdvice(
                                AchTransfer.Addenda.PaymentOrderRemittanceAdvice.builder()
                                    .addInvoice(
                                        AchTransfer.Addenda.PaymentOrderRemittanceAdvice.Invoice
                                            .builder()
                                            .invoiceNumber("invoice_number")
                                            .paidAmount(0L)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .amount(100L)
                    .approval(
                        AchTransfer.Approval.builder()
                            .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .approvedBy(null)
                            .build()
                    )
                    .cancellation(
                        AchTransfer.Cancellation.builder()
                            .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .canceledBy("canceled_by")
                            .build()
                    )
                    .companyDescriptiveDate(null)
                    .companyDiscretionaryData(null)
                    .companyEntryDescription(null)
                    .companyId("1234987601")
                    .companyName("National Phonograph Company")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .createdBy(
                        AchTransfer.CreatedBy.builder()
                            .apiKey(
                                AchTransfer.CreatedBy.ApiKey.builder()
                                    .description("description")
                                    .build()
                            )
                            .category(AchTransfer.CreatedBy.Category.USER)
                            .oauthApplication(
                                AchTransfer.CreatedBy.OAuthApplication.builder()
                                    .name("name")
                                    .build()
                            )
                            .user(
                                AchTransfer.CreatedBy.User.builder()
                                    .email("user@example.com")
                                    .build()
                            )
                            .build()
                    )
                    .currency(AchTransfer.Currency.USD)
                    .destinationAccountHolder(AchTransfer.DestinationAccountHolder.BUSINESS)
                    .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                    .funding(AchTransfer.Funding.CHECKING)
                    .idempotencyKey(null)
                    .inboundFundsHold(
                        AchTransfer.InboundFundsHold.builder()
                            .id("id")
                            .amount(0L)
                            .automaticallyReleasesAt(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(AchTransfer.InboundFundsHold.Currency.CAD)
                            .heldTransactionId("held_transaction_id")
                            .pendingTransactionId("pending_transaction_id")
                            .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(AchTransfer.InboundFundsHold.Status.HELD)
                            .type(AchTransfer.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                            .build()
                    )
                    .individualId(null)
                    .individualName("Ian Crease")
                    .network(AchTransfer.Network.ACH)
                    .addNotificationsOfChange(
                        AchTransfer.NotificationsOfChange.builder()
                            .changeCode(
                                AchTransfer.NotificationsOfChange.ChangeCode
                                    .INCORRECT_TRANSACTION_CODE
                            )
                            .correctedData("32")
                            .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .build()
                    )
                    .pendingTransactionId(null)
                    .preferredEffectiveDate(
                        AchTransfer.PreferredEffectiveDate.builder()
                            .date(null)
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
                    .routingNumber("101050001")
                    .settlement(
                        AchTransfer.Settlement.builder()
                            .settledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .standardEntryClassCode(
                        AchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                    )
                    .statementDescriptor("Statement descriptor")
                    .status(AchTransfer.Status.RETURNED)
                    .submission(
                        AchTransfer.Submission.builder()
                            .effectiveDate(LocalDate.parse("2020-01-31"))
                            .expectedFundsSettlementAt(OffsetDateTime.parse("2020-02-03T13:30:00Z"))
                            .expectedSettlementSchedule(
                                AchTransfer.Submission.ExpectedSettlementSchedule.FUTURE_DATED
                            )
                            .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .traceNumber("058349238292834")
                            .build()
                    )
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .type(AchTransfer.Type.ACH_TRANSFER)
                    .build()
            )
        assertThat(achTransferListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val achTransferListPageResponse =
            AchTransferListPageResponse.builder()
                .addData(
                    AchTransfer.builder()
                        .id("ach_transfer_uoxatyh3lt5evrsdvo7q")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .accountNumber("987654321")
                        .acknowledgement(
                            AchTransfer.Acknowledgement.builder()
                                .acknowledgedAt("2020-01-31T23:59:59Z")
                                .build()
                        )
                        .addenda(
                            AchTransfer.Addenda.builder()
                                .category(AchTransfer.Addenda.Category.FREEFORM)
                                .freeform(
                                    AchTransfer.Addenda.Freeform.builder()
                                        .addEntry(
                                            AchTransfer.Addenda.Freeform.Entry.builder()
                                                .paymentRelatedInformation(
                                                    "payment_related_information"
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .paymentOrderRemittanceAdvice(
                                    AchTransfer.Addenda.PaymentOrderRemittanceAdvice.builder()
                                        .addInvoice(
                                            AchTransfer.Addenda.PaymentOrderRemittanceAdvice.Invoice
                                                .builder()
                                                .invoiceNumber("invoice_number")
                                                .paidAmount(0L)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .amount(100L)
                        .approval(
                            AchTransfer.Approval.builder()
                                .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .approvedBy(null)
                                .build()
                        )
                        .cancellation(
                            AchTransfer.Cancellation.builder()
                                .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .canceledBy("canceled_by")
                                .build()
                        )
                        .companyDescriptiveDate(null)
                        .companyDiscretionaryData(null)
                        .companyEntryDescription(null)
                        .companyId("1234987601")
                        .companyName("National Phonograph Company")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .createdBy(
                            AchTransfer.CreatedBy.builder()
                                .apiKey(
                                    AchTransfer.CreatedBy.ApiKey.builder()
                                        .description("description")
                                        .build()
                                )
                                .category(AchTransfer.CreatedBy.Category.USER)
                                .oauthApplication(
                                    AchTransfer.CreatedBy.OAuthApplication.builder()
                                        .name("name")
                                        .build()
                                )
                                .user(
                                    AchTransfer.CreatedBy.User.builder()
                                        .email("user@example.com")
                                        .build()
                                )
                                .build()
                        )
                        .currency(AchTransfer.Currency.USD)
                        .destinationAccountHolder(AchTransfer.DestinationAccountHolder.BUSINESS)
                        .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                        .funding(AchTransfer.Funding.CHECKING)
                        .idempotencyKey(null)
                        .inboundFundsHold(
                            AchTransfer.InboundFundsHold.builder()
                                .id("id")
                                .amount(0L)
                                .automaticallyReleasesAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency(AchTransfer.InboundFundsHold.Currency.CAD)
                                .heldTransactionId("held_transaction_id")
                                .pendingTransactionId("pending_transaction_id")
                                .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(AchTransfer.InboundFundsHold.Status.HELD)
                                .type(AchTransfer.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                                .build()
                        )
                        .individualId(null)
                        .individualName("Ian Crease")
                        .network(AchTransfer.Network.ACH)
                        .addNotificationsOfChange(
                            AchTransfer.NotificationsOfChange.builder()
                                .changeCode(
                                    AchTransfer.NotificationsOfChange.ChangeCode
                                        .INCORRECT_TRANSACTION_CODE
                                )
                                .correctedData("32")
                                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .pendingTransactionId(null)
                        .preferredEffectiveDate(
                            AchTransfer.PreferredEffectiveDate.builder()
                                .date(null)
                                .settlementSchedule(
                                    AchTransfer.PreferredEffectiveDate.SettlementSchedule.SAME_DAY
                                )
                                .build()
                        )
                        .return_(
                            AchTransfer.Return.builder()
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .rawReturnReasonCode("raw_return_reason_code")
                                .returnReasonCode(
                                    AchTransfer.Return.ReturnReasonCode.INSUFFICIENT_FUND
                                )
                                .traceNumber("trace_number")
                                .transactionId("transaction_id")
                                .transferId("transfer_id")
                                .build()
                        )
                        .routingNumber("101050001")
                        .settlement(
                            AchTransfer.Settlement.builder()
                                .settledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .standardEntryClassCode(
                            AchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                        )
                        .statementDescriptor("Statement descriptor")
                        .status(AchTransfer.Status.RETURNED)
                        .submission(
                            AchTransfer.Submission.builder()
                                .effectiveDate(LocalDate.parse("2020-01-31"))
                                .expectedFundsSettlementAt(
                                    OffsetDateTime.parse("2020-02-03T13:30:00Z")
                                )
                                .expectedSettlementSchedule(
                                    AchTransfer.Submission.ExpectedSettlementSchedule.FUTURE_DATED
                                )
                                .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .traceNumber("058349238292834")
                                .build()
                        )
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .type(AchTransfer.Type.ACH_TRANSFER)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedAchTransferListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(achTransferListPageResponse),
                jacksonTypeRef<AchTransferListPageResponse>(),
            )

        assertThat(roundtrippedAchTransferListPageResponse).isEqualTo(achTransferListPageResponse)
    }
}
