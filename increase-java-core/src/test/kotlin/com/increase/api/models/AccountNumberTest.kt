package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountNumberTest {

    @Test
    fun createAccountNumber() {
        val accountNumber =
            AccountNumber.builder()
                .id("string")
                .accountId("string")
                .accountNumber("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("string")
                .routingNumber("string")
                .status(AccountNumber.Status.ACTIVE)
                .type(AccountNumber.Type.ACCOUNT_NUMBER)
                .build()
        assertThat(accountNumber).isNotNull
        assertThat(accountNumber.id()).isEqualTo("string")
        assertThat(accountNumber.accountId()).isEqualTo("string")
        assertThat(accountNumber.accountNumber()).isEqualTo("string")
        assertThat(accountNumber.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountNumber.name()).isEqualTo("string")
        assertThat(accountNumber.routingNumber()).isEqualTo("string")
        assertThat(accountNumber.status()).isEqualTo(AccountNumber.Status.ACTIVE)
        assertThat(accountNumber.type()).isEqualTo(AccountNumber.Type.ACCOUNT_NUMBER)
    }
}
