// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchTransferCreateParamsTest {

    @Test
    fun createAchTransferCreateParams() {
        AchTransferCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .amount(100L)
            .statementDescriptor("New ACH transfer")
            .accountNumber("987654321")
            .addenda(
                AchTransferCreateParams.Addenda.builder()
                    .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
                    .freeform(
                        AchTransferCreateParams.Addenda.Freeform.builder()
                            .addEntry(
                                AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                    .paymentRelatedInformation("x")
                                    .build()
                            )
                            .build()
                    )
                    .paymentOrderRemittanceAdvice(
                        AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.builder()
                            .addInvoice(
                                AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.Invoice
                                    .builder()
                                    .invoiceNumber("x")
                                    .paidAmount(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .companyDescriptiveDate("x")
            .companyDiscretionaryData("x")
            .companyEntryDescription("x")
            .companyName("x")
            .destinationAccountHolder(AchTransferCreateParams.DestinationAccountHolder.BUSINESS)
            .externalAccountId("external_account_id")
            .funding(AchTransferCreateParams.Funding.CHECKING)
            .individualId("x")
            .individualName("x")
            .preferredEffectiveDate(
                AchTransferCreateParams.PreferredEffectiveDate.builder()
                    .date(LocalDate.parse("2019-12-27"))
                    .settlementSchedule(
                        AchTransferCreateParams.PreferredEffectiveDate.SettlementSchedule.SAME_DAY
                    )
                    .build()
            )
            .requireApproval(true)
            .routingNumber("101050001")
            .standardEntryClassCode(
                AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
            )
            .transactionTiming(AchTransferCreateParams.TransactionTiming.SYNCHRONOUS)
            .build()
    }

    @Test
    fun body() {
        val params =
            AchTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(100L)
                .statementDescriptor("New ACH transfer")
                .accountNumber("987654321")
                .addenda(
                    AchTransferCreateParams.Addenda.builder()
                        .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
                        .freeform(
                            AchTransferCreateParams.Addenda.Freeform.builder()
                                .addEntry(
                                    AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("x")
                                        .build()
                                )
                                .build()
                        )
                        .paymentOrderRemittanceAdvice(
                            AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.builder()
                                .addInvoice(
                                    AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice
                                        .Invoice
                                        .builder()
                                        .invoiceNumber("x")
                                        .paidAmount(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .companyDescriptiveDate("x")
                .companyDiscretionaryData("x")
                .companyEntryDescription("x")
                .companyName("x")
                .destinationAccountHolder(AchTransferCreateParams.DestinationAccountHolder.BUSINESS)
                .externalAccountId("external_account_id")
                .funding(AchTransferCreateParams.Funding.CHECKING)
                .individualId("x")
                .individualName("x")
                .preferredEffectiveDate(
                    AchTransferCreateParams.PreferredEffectiveDate.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .settlementSchedule(
                            AchTransferCreateParams.PreferredEffectiveDate.SettlementSchedule
                                .SAME_DAY
                        )
                        .build()
                )
                .requireApproval(true)
                .routingNumber("101050001")
                .standardEntryClassCode(
                    AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .transactionTiming(AchTransferCreateParams.TransactionTiming.SYNCHRONOUS)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.statementDescriptor()).isEqualTo("New ACH transfer")
        assertThat(body.accountNumber()).contains("987654321")
        assertThat(body.addenda())
            .contains(
                AchTransferCreateParams.Addenda.builder()
                    .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
                    .freeform(
                        AchTransferCreateParams.Addenda.Freeform.builder()
                            .addEntry(
                                AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                    .paymentRelatedInformation("x")
                                    .build()
                            )
                            .build()
                    )
                    .paymentOrderRemittanceAdvice(
                        AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.builder()
                            .addInvoice(
                                AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.Invoice
                                    .builder()
                                    .invoiceNumber("x")
                                    .paidAmount(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.companyDescriptiveDate()).contains("x")
        assertThat(body.companyDiscretionaryData()).contains("x")
        assertThat(body.companyEntryDescription()).contains("x")
        assertThat(body.companyName()).contains("x")
        assertThat(body.destinationAccountHolder())
            .contains(AchTransferCreateParams.DestinationAccountHolder.BUSINESS)
        assertThat(body.externalAccountId()).contains("external_account_id")
        assertThat(body.funding()).contains(AchTransferCreateParams.Funding.CHECKING)
        assertThat(body.individualId()).contains("x")
        assertThat(body.individualName()).contains("x")
        assertThat(body.preferredEffectiveDate())
            .contains(
                AchTransferCreateParams.PreferredEffectiveDate.builder()
                    .date(LocalDate.parse("2019-12-27"))
                    .settlementSchedule(
                        AchTransferCreateParams.PreferredEffectiveDate.SettlementSchedule.SAME_DAY
                    )
                    .build()
            )
        assertThat(body.requireApproval()).contains(true)
        assertThat(body.routingNumber()).contains("101050001")
        assertThat(body.standardEntryClassCode())
            .contains(AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
        assertThat(body.transactionTiming())
            .contains(AchTransferCreateParams.TransactionTiming.SYNCHRONOUS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AchTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(100L)
                .statementDescriptor("New ACH transfer")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.statementDescriptor()).isEqualTo("New ACH transfer")
    }
}
