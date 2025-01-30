// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchPrenotificationCreateParamsTest {

    @Test
    fun createAchPrenotificationCreateParams() {
        AchPrenotificationCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .accountNumber("987654321")
            .routingNumber("101050001")
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
    fun body() {
        val params =
            AchPrenotificationCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .routingNumber("101050001")
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
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.accountNumber()).isEqualTo("987654321")
        assertThat(body.routingNumber()).isEqualTo("101050001")
        assertThat(body.addendum()).contains("x")
        assertThat(body.companyDescriptiveDate()).contains("x")
        assertThat(body.companyDiscretionaryData()).contains("x")
        assertThat(body.companyEntryDescription()).contains("x")
        assertThat(body.companyName()).contains("x")
        assertThat(body.creditDebitIndicator())
            .contains(AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT)
        assertThat(body.effectiveDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.individualId()).contains("x")
        assertThat(body.individualName()).contains("x")
        assertThat(body.standardEntryClassCode())
            .contains(
                AchPrenotificationCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AchPrenotificationCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .routingNumber("101050001")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.accountNumber()).isEqualTo("987654321")
        assertThat(body.routingNumber()).isEqualTo("101050001")
    }
}
