// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountStatementTest {

    @Test
    fun createAccountStatement() {
        val accountStatement =
            AccountStatement.builder()
                .id("account_statement_lkc03a4skm2k7f38vj15")
                .accountId("account_in71c4amph0vgo2qllky")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .endingBalance(100L)
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .startingBalance(0L)
                .statementPeriodEnd(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .statementPeriodStart(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(AccountStatement.Type.ACCOUNT_STATEMENT)
                .build()
        assertThat(accountStatement).isNotNull
        assertThat(accountStatement.id()).isEqualTo("account_statement_lkc03a4skm2k7f38vj15")
        assertThat(accountStatement.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(accountStatement.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(accountStatement.endingBalance()).isEqualTo(100L)
        assertThat(accountStatement.fileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(accountStatement.startingBalance()).isEqualTo(0L)
        assertThat(accountStatement.statementPeriodEnd())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(accountStatement.statementPeriodStart())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(accountStatement.type()).isEqualTo(AccountStatement.Type.ACCOUNT_STATEMENT)
    }
}
