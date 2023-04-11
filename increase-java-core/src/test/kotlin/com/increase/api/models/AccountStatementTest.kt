package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountStatementTest {

    @Test
    fun createAccountStatement() {
        val accountStatement =
            AccountStatement.builder()
                .id("string")
                .accountId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileId("string")
                .statementPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .statementPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(123L)
                .endingBalance(123L)
                .type(AccountStatement.Type.ACCOUNT_STATEMENT)
                .build()
        assertThat(accountStatement).isNotNull
        assertThat(accountStatement.id()).isEqualTo("string")
        assertThat(accountStatement.accountId()).isEqualTo("string")
        assertThat(accountStatement.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountStatement.fileId()).isEqualTo("string")
        assertThat(accountStatement.statementPeriodStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountStatement.statementPeriodEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountStatement.startingBalance()).isEqualTo(123L)
        assertThat(accountStatement.endingBalance()).isEqualTo(123L)
        assertThat(accountStatement.type()).isEqualTo(AccountStatement.Type.ACCOUNT_STATEMENT)
    }
}
