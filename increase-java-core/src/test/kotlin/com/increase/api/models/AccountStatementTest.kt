// File generated from our OpenAPI spec by Stainless.

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
                .endingBalance(123L)
                .fileId("string")
                .startingBalance(123L)
                .statementPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .statementPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(AccountStatement.Type.ACCOUNT_STATEMENT)
                .build()
        assertThat(accountStatement).isNotNull
        assertThat(accountStatement.id()).isEqualTo("string")
        assertThat(accountStatement.accountId()).isEqualTo("string")
        assertThat(accountStatement.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountStatement.endingBalance()).isEqualTo(123L)
        assertThat(accountStatement.fileId()).isEqualTo("string")
        assertThat(accountStatement.startingBalance()).isEqualTo(123L)
        assertThat(accountStatement.statementPeriodEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountStatement.statementPeriodStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountStatement.type()).isEqualTo(AccountStatement.Type.ACCOUNT_STATEMENT)
    }
}
