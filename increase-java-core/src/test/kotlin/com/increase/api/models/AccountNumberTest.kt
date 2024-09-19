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
import com.increase.api.models.AccountNumber

class AccountNumberTest {

    @Test
    fun createAccountNumber() {
      val accountNumber = AccountNumber.builder()
          .id("id")
          .accountId("account_id")
          .accountNumber("account_number")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .idempotencyKey("idempotency_key")
          .inboundAch(AccountNumber.InboundAch.builder()
              .debitStatus(AccountNumber.InboundAch.DebitStatus.ALLOWED)
              .build())
          .inboundChecks(AccountNumber.InboundChecks.builder()
              .status(AccountNumber.InboundChecks.Status.ALLOWED)
              .build())
          .name("name")
          .routingNumber("routing_number")
          .status(AccountNumber.Status.ACTIVE)
          .type(AccountNumber.Type.ACCOUNT_NUMBER)
          .build()
      assertThat(accountNumber).isNotNull
      assertThat(accountNumber.id()).isEqualTo("id")
      assertThat(accountNumber.accountId()).isEqualTo("account_id")
      assertThat(accountNumber.accountNumber()).isEqualTo("account_number")
      assertThat(accountNumber.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(accountNumber.idempotencyKey()).contains("idempotency_key")
      assertThat(accountNumber.inboundAch()).isEqualTo(AccountNumber.InboundAch.builder()
          .debitStatus(AccountNumber.InboundAch.DebitStatus.ALLOWED)
          .build())
      assertThat(accountNumber.inboundChecks()).isEqualTo(AccountNumber.InboundChecks.builder()
          .status(AccountNumber.InboundChecks.Status.ALLOWED)
          .build())
      assertThat(accountNumber.name()).isEqualTo("name")
      assertThat(accountNumber.routingNumber()).isEqualTo("routing_number")
      assertThat(accountNumber.status()).isEqualTo(AccountNumber.Status.ACTIVE)
      assertThat(accountNumber.type()).isEqualTo(AccountNumber.Type.ACCOUNT_NUMBER)
    }
}
