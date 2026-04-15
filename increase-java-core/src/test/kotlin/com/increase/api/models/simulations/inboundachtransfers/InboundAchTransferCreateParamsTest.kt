// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundachtransfers

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundAchTransferCreateParamsTest {

    @Test
    fun create() {
        InboundAchTransferCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .addenda(
                InboundAchTransferCreateParams.Addenda.builder()
                    .category(InboundAchTransferCreateParams.Addenda.Category.FREEFORM)
                    .freeform(
                        InboundAchTransferCreateParams.Addenda.Freeform.builder()
                            .addEntry(
                                InboundAchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                    .paymentRelatedInformation("payment_related_information")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .companyDescriptiveDate("J!")
            .companyDiscretionaryData("J!")
            .companyEntryDescription("J!")
            .companyId("company_id")
            .companyName("company_name")
            .receiverIdNumber("x")
            .receiverName("x")
            .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .standardEntryClassCode(
                InboundAchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundAchTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .addenda(
                    InboundAchTransferCreateParams.Addenda.builder()
                        .category(InboundAchTransferCreateParams.Addenda.Category.FREEFORM)
                        .freeform(
                            InboundAchTransferCreateParams.Addenda.Freeform.builder()
                                .addEntry(
                                    InboundAchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("payment_related_information")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .companyDescriptiveDate("J!")
                .companyDiscretionaryData("J!")
                .companyEntryDescription("J!")
                .companyId("company_id")
                .companyName("company_name")
                .receiverIdNumber("x")
                .receiverName("x")
                .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .standardEntryClassCode(
                    InboundAchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.addenda())
            .contains(
                InboundAchTransferCreateParams.Addenda.builder()
                    .category(InboundAchTransferCreateParams.Addenda.Category.FREEFORM)
                    .freeform(
                        InboundAchTransferCreateParams.Addenda.Freeform.builder()
                            .addEntry(
                                InboundAchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                    .paymentRelatedInformation("payment_related_information")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.companyDescriptiveDate()).contains("J!")
        assertThat(body.companyDiscretionaryData()).contains("J!")
        assertThat(body.companyEntryDescription()).contains("J!")
        assertThat(body.companyId()).contains("company_id")
        assertThat(body.companyName()).contains("company_name")
        assertThat(body.receiverIdNumber()).contains("x")
        assertThat(body.receiverName()).contains("x")
        assertThat(body.resolveAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.standardEntryClassCode())
            .contains(
                InboundAchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundAchTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
