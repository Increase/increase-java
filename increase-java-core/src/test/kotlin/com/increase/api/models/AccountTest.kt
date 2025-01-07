// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTest {

    @Test
    fun createAccount() {
        val account =
            Account.builder()
                .id("account_in71c4amph0vgo2qllky")
                .bank(Account.Bank.BLUE_RIDGE_BANK)
                .closedAt(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .currency(Account.Currency.CAD)
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .idempotencyKey(null)
                .informationalEntityId(null)
                .interestAccrued("0.01")
                .interestAccruedAt(LocalDate.parse("2020-01-31"))
                .interestRate("0.055")
                .name("My first account!")
                .programId("program_i2v2os4mwza1oetokh9i")
                .status(Account.Status.CLOSED)
                .type(Account.Type.ACCOUNT)
                .build()
        assertThat(account).isNotNull
        assertThat(account.id()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(account.bank()).isEqualTo(Account.Bank.BLUE_RIDGE_BANK)
        assertThat(account.closedAt()).isEmpty
        assertThat(account.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(account.currency()).isEqualTo(Account.Currency.CAD)
        assertThat(account.entityId()).contains("entity_n8y8tnk2p9339ti393yi")
        assertThat(account.idempotencyKey()).isEmpty
        assertThat(account.informationalEntityId()).isEmpty
        assertThat(account.interestAccrued()).isEqualTo("0.01")
        assertThat(account.interestAccruedAt()).contains(LocalDate.parse("2020-01-31"))
        assertThat(account.interestRate()).isEqualTo("0.055")
        assertThat(account.name()).isEqualTo("My first account!")
        assertThat(account.programId()).isEqualTo("program_i2v2os4mwza1oetokh9i")
        assertThat(account.status()).isEqualTo(Account.Status.CLOSED)
        assertThat(account.type()).isEqualTo(Account.Type.ACCOUNT)
    }
}
