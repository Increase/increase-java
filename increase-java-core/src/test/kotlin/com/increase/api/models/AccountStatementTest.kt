// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.AccountStatement

class AccountStatementTest {

    @Test
    fun createAccountStatement() {
      val accountStatement = AccountStatement.builder()
          .id("id")
          .accountId("account_id")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .endingBalance(123L)
          .fileId("file_id")
          .startingBalance(123L)
          .statementPeriodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .statementPeriodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .type(AccountStatement.Type.ACCOUNT_STATEMENT)
          .build()
      assertThat(accountStatement).isNotNull
      assertThat(accountStatement.id()).isEqualTo("id")
      assertThat(accountStatement.accountId()).isEqualTo("account_id")
      assertThat(accountStatement.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(accountStatement.endingBalance()).isEqualTo(123L)
      assertThat(accountStatement.fileId()).isEqualTo("file_id")
      assertThat(accountStatement.startingBalance()).isEqualTo(123L)
      assertThat(accountStatement.statementPeriodEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(accountStatement.statementPeriodStart()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(accountStatement.type()).isEqualTo(AccountStatement.Type.ACCOUNT_STATEMENT)
    }
}
