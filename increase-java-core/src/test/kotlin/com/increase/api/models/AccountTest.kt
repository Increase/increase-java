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
import com.increase.api.models.Account

class AccountTest {

    @Test
    fun createAccount() {
      val account = Account.builder()
          .id("id")
          .bank(Account.Bank.BLUE_RIDGE_BANK)
          .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .currency(Account.Currency.CAD)
          .entityId("entity_id")
          .idempotencyKey("idempotency_key")
          .informationalEntityId("informational_entity_id")
          .interestAccrued("interest_accrued")
          .interestAccruedAt(LocalDate.parse("2019-12-27"))
          .interestRate("interest_rate")
          .name("name")
          .programId("program_id")
          .status(Account.Status.OPEN)
          .type(Account.Type.ACCOUNT)
          .build()
      assertThat(account).isNotNull
      assertThat(account.id()).isEqualTo("id")
      assertThat(account.bank()).isEqualTo(Account.Bank.BLUE_RIDGE_BANK)
      assertThat(account.closedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(account.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(account.currency()).isEqualTo(Account.Currency.CAD)
      assertThat(account.entityId()).contains("entity_id")
      assertThat(account.idempotencyKey()).contains("idempotency_key")
      assertThat(account.informationalEntityId()).contains("informational_entity_id")
      assertThat(account.interestAccrued()).isEqualTo("interest_accrued")
      assertThat(account.interestAccruedAt()).contains(LocalDate.parse("2019-12-27"))
      assertThat(account.interestRate()).isEqualTo("interest_rate")
      assertThat(account.name()).isEqualTo("name")
      assertThat(account.programId()).isEqualTo("program_id")
      assertThat(account.status()).isEqualTo(Account.Status.OPEN)
      assertThat(account.type()).isEqualTo(Account.Type.ACCOUNT)
    }
}
