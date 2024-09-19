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
import com.increase.api.models.IntrafiBalance

class IntrafiBalanceTest {

    @Test
    fun createIntrafiBalance() {
      val intrafiBalance = IntrafiBalance.builder()
          .id("id")
          .balances(listOf(IntrafiBalance.Balance.builder()
              .id("id")
              .balance(123L)
              .bank("bank")
              .bankLocation(IntrafiBalance.Balance.BankLocation.builder()
                  .city("city")
                  .state("state")
                  .build())
              .fdicCertificateNumber("fdic_certificate_number")
              .build()))
          .currency(IntrafiBalance.Currency.CAD)
          .effectiveDate(LocalDate.parse("2019-12-27"))
          .totalBalance(123L)
          .type(IntrafiBalance.Type.INTRAFI_BALANCE)
          .build()
      assertThat(intrafiBalance).isNotNull
      assertThat(intrafiBalance.id()).isEqualTo("id")
      assertThat(intrafiBalance.balances()).containsExactly(IntrafiBalance.Balance.builder()
          .id("id")
          .balance(123L)
          .bank("bank")
          .bankLocation(IntrafiBalance.Balance.BankLocation.builder()
              .city("city")
              .state("state")
              .build())
          .fdicCertificateNumber("fdic_certificate_number")
          .build())
      assertThat(intrafiBalance.currency()).isEqualTo(IntrafiBalance.Currency.CAD)
      assertThat(intrafiBalance.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
      assertThat(intrafiBalance.totalBalance()).isEqualTo(123L)
      assertThat(intrafiBalance.type()).isEqualTo(IntrafiBalance.Type.INTRAFI_BALANCE)
    }
}
