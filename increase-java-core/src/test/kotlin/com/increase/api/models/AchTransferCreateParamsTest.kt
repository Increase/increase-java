package com.increase.api.models

import com.increase.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchTransferCreateParamsTest {

    @Test
    fun createAchTransferCreateParams() {
        AchTransferCreateParams.builder()
            .accountId("string")
            .accountNumber("x")
            .addendum("x")
            .amount(123L)
            .companyDescriptiveDate("x")
            .companyDiscretionaryData("x")
            .companyEntryDescription("x")
            .companyName("x")
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .externalAccountId("string")
            .funding(AchTransferCreateParams.Funding.CHECKING)
            .individualId("x")
            .individualName("x")
            .requireApproval(true)
            .routingNumber("xxxxxxxxx")
            .standardEntryClassCode(
                AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
            )
            .statementDescriptor("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AchTransferCreateParams.builder()
                .accountId("string")
                .accountNumber("x")
                .addendum("x")
                .amount(123L)
                .companyDescriptiveDate("x")
                .companyDiscretionaryData("x")
                .companyEntryDescription("x")
                .companyName("x")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .externalAccountId("string")
                .funding(AchTransferCreateParams.Funding.CHECKING)
                .individualId("x")
                .individualName("x")
                .requireApproval(true)
                .routingNumber("xxxxxxxxx")
                .standardEntryClassCode(
                    AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .statementDescriptor("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.addendum()).isEqualTo("x")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.companyDescriptiveDate()).isEqualTo("x")
        assertThat(body.companyDiscretionaryData()).isEqualTo("x")
        assertThat(body.companyEntryDescription()).isEqualTo("x")
        assertThat(body.companyName()).isEqualTo("x")
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.externalAccountId()).isEqualTo("string")
        assertThat(body.funding()).isEqualTo(AchTransferCreateParams.Funding.CHECKING)
        assertThat(body.individualId()).isEqualTo("x")
        assertThat(body.individualName()).isEqualTo("x")
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.standardEntryClassCode())
            .isEqualTo(AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
        assertThat(body.statementDescriptor()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AchTransferCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .statementDescriptor("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.statementDescriptor()).isEqualTo("x")
    }
}
