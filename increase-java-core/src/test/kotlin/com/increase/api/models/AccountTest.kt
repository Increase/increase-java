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
                .balances(
                    Account.Balances.builder().currentBalance(123L).availableBalance(123L).build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Account.Currency.CAD)
                .entityId("string")
                .informationalEntityId("string")
                .id("string")
                .interestAccrued("string")
                .interestAccruedAt(LocalDate.parse("2019-12-27"))
                .name("string")
                .status(Account.Status.OPEN)
                .type(Account.Type.ACCOUNT)
                .build()
        assertThat(account).isNotNull
        assertThat(account.balances())
            .isEqualTo(
                Account.Balances.builder().currentBalance(123L).availableBalance(123L).build()
            )
        assertThat(account.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(account.currency()).isEqualTo(Account.Currency.CAD)
        assertThat(account.entityId()).contains("string")
        assertThat(account.informationalEntityId()).contains("string")
        assertThat(account.id()).isEqualTo("string")
        assertThat(account.interestAccrued()).isEqualTo("string")
        assertThat(account.interestAccruedAt()).contains(LocalDate.parse("2019-12-27"))
        assertThat(account.name()).isEqualTo("string")
        assertThat(account.status()).isEqualTo(Account.Status.OPEN)
        assertThat(account.type()).isEqualTo(Account.Type.ACCOUNT)
    }
}
