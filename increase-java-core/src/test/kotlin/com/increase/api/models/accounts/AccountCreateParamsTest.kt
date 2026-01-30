// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCreateParamsTest {

    @Test
    fun create() {
        AccountCreateParams.builder()
            .name("New Account!")
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .funding(AccountCreateParams.Funding.LOAN)
            .informationalEntityId("informational_entity_id")
            .loan(
                AccountCreateParams.Loan.builder()
                    .creditLimit(0L)
                    .gracePeriodDays(0L)
                    .statementDayOfMonth(1L)
                    .statementPaymentType(AccountCreateParams.Loan.StatementPaymentType.BALANCE)
                    .maturityDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
            .programId("program_i2v2os4mwza1oetokh9i")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountCreateParams.builder()
                .name("New Account!")
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .funding(AccountCreateParams.Funding.LOAN)
                .informationalEntityId("informational_entity_id")
                .loan(
                    AccountCreateParams.Loan.builder()
                        .creditLimit(0L)
                        .gracePeriodDays(0L)
                        .statementDayOfMonth(1L)
                        .statementPaymentType(AccountCreateParams.Loan.StatementPaymentType.BALANCE)
                        .maturityDate(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .programId("program_i2v2os4mwza1oetokh9i")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("New Account!")
        assertThat(body.entityId()).contains("entity_n8y8tnk2p9339ti393yi")
        assertThat(body.funding()).contains(AccountCreateParams.Funding.LOAN)
        assertThat(body.informationalEntityId()).contains("informational_entity_id")
        assertThat(body.loan())
            .contains(
                AccountCreateParams.Loan.builder()
                    .creditLimit(0L)
                    .gracePeriodDays(0L)
                    .statementDayOfMonth(1L)
                    .statementPaymentType(AccountCreateParams.Loan.StatementPaymentType.BALANCE)
                    .maturityDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
        assertThat(body.programId()).contains("program_i2v2os4mwza1oetokh9i")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountCreateParams.builder().name("New Account!").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("New Account!")
    }
}
