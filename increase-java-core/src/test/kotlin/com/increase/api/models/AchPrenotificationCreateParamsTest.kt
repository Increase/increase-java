// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchPrenotificationCreateParamsTest {

    @Test
    fun createAchPrenotificationCreateParams() {
        AchPrenotificationCreateParams.builder()
            .accountId("account_id")
            .accountNumber("x")
            .routingNumber("xxxxxxxxx")
            .addendum("x")
            .companyDescriptiveDate("x")
            .companyDiscretionaryData("x")
            .companyEntryDescription("x")
            .companyName("x")
            .creditDebitIndicator(AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT)
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .individualId("x")
            .individualName("x")
            .standardEntryClassCode(
                AchPrenotificationCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AchPrenotificationCreateParams.builder()
                .accountId("account_id")
                .accountNumber("x")
                .routingNumber("xxxxxxxxx")
                .addendum("x")
                .companyDescriptiveDate("x")
                .companyDiscretionaryData("x")
                .companyEntryDescription("x")
                .companyName("x")
                .creditDebitIndicator(AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .individualId("x")
                .individualName("x")
                .standardEntryClassCode(
                    AchPrenotificationCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.addendum()).isEqualTo("x")
        assertThat(body.companyDescriptiveDate()).isEqualTo("x")
        assertThat(body.companyDiscretionaryData()).isEqualTo("x")
        assertThat(body.companyEntryDescription()).isEqualTo("x")
        assertThat(body.companyName()).isEqualTo("x")
        assertThat(body.creditDebitIndicator())
            .isEqualTo(AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.individualId()).isEqualTo("x")
        assertThat(body.individualName()).isEqualTo("x")
        assertThat(body.standardEntryClassCode())
            .isEqualTo(
                AchPrenotificationCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AchPrenotificationCreateParams.builder()
                .accountId("account_id")
                .accountNumber("x")
                .routingNumber("xxxxxxxxx")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
    }
}
