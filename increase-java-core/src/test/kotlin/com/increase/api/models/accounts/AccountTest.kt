// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountTest {

    @Test
    fun create() {
        val account =
            Account.builder()
                .id("account_in71c4amph0vgo2qllky")
                .accountRevenueRate(null)
                .bank(Account.Bank.FIRST_INTERNET_BANK)
                .closedAt(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .currency(Account.Currency.USD)
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .funding(Account.Funding.DEPOSITS)
                .idempotencyKey(null)
                .informationalEntityId(null)
                .interestAccrued("0.01")
                .interestAccruedAt(LocalDate.parse("2020-01-31"))
                .interestRate("0.055")
                .loan(
                    Account.Loan.builder()
                        .creditLimit(0L)
                        .gracePeriodDays(0L)
                        .maturityDate(LocalDate.parse("2019-12-27"))
                        .statementDayOfMonth(0L)
                        .statementPaymentType(Account.Loan.StatementPaymentType.BALANCE)
                        .build()
                )
                .name("My first account!")
                .programId("program_i2v2os4mwza1oetokh9i")
                .status(Account.Status.OPEN)
                .type(Account.Type.ACCOUNT)
                .build()

        assertThat(account.id()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(account.accountRevenueRate()).isEmpty
        assertThat(account.bank()).isEqualTo(Account.Bank.FIRST_INTERNET_BANK)
        assertThat(account.closedAt()).isEmpty
        assertThat(account.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(account.currency()).isEqualTo(Account.Currency.USD)
        assertThat(account.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(account.funding()).isEqualTo(Account.Funding.DEPOSITS)
        assertThat(account.idempotencyKey()).isEmpty
        assertThat(account.informationalEntityId()).isEmpty
        assertThat(account.interestAccrued()).isEqualTo("0.01")
        assertThat(account.interestAccruedAt()).contains(LocalDate.parse("2020-01-31"))
        assertThat(account.interestRate()).isEqualTo("0.055")
        assertThat(account.loan())
            .contains(
                Account.Loan.builder()
                    .creditLimit(0L)
                    .gracePeriodDays(0L)
                    .maturityDate(LocalDate.parse("2019-12-27"))
                    .statementDayOfMonth(0L)
                    .statementPaymentType(Account.Loan.StatementPaymentType.BALANCE)
                    .build()
            )
        assertThat(account.name()).isEqualTo("My first account!")
        assertThat(account.programId()).isEqualTo("program_i2v2os4mwza1oetokh9i")
        assertThat(account.status()).isEqualTo(Account.Status.OPEN)
        assertThat(account.type()).isEqualTo(Account.Type.ACCOUNT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val account =
            Account.builder()
                .id("account_in71c4amph0vgo2qllky")
                .accountRevenueRate(null)
                .bank(Account.Bank.FIRST_INTERNET_BANK)
                .closedAt(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .currency(Account.Currency.USD)
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .funding(Account.Funding.DEPOSITS)
                .idempotencyKey(null)
                .informationalEntityId(null)
                .interestAccrued("0.01")
                .interestAccruedAt(LocalDate.parse("2020-01-31"))
                .interestRate("0.055")
                .loan(
                    Account.Loan.builder()
                        .creditLimit(0L)
                        .gracePeriodDays(0L)
                        .maturityDate(LocalDate.parse("2019-12-27"))
                        .statementDayOfMonth(0L)
                        .statementPaymentType(Account.Loan.StatementPaymentType.BALANCE)
                        .build()
                )
                .name("My first account!")
                .programId("program_i2v2os4mwza1oetokh9i")
                .status(Account.Status.OPEN)
                .type(Account.Type.ACCOUNT)
                .build()

        val roundtrippedAccount =
            jsonMapper.readValue(jsonMapper.writeValueAsString(account), jacksonTypeRef<Account>())

        assertThat(roundtrippedAccount).isEqualTo(account)
    }
}
