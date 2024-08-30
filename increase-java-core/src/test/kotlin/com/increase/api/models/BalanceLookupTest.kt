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
import com.increase.api.models.BalanceLookup

class BalanceLookupTest {

    @Test
    fun createBalanceLookup() {
      val balanceLookup = BalanceLookup.builder()
          .accountId("account_id")
          .availableBalance(123L)
          .currentBalance(123L)
          .type(BalanceLookup.Type.BALANCE_LOOKUP)
          .build()
      assertThat(balanceLookup).isNotNull
      assertThat(balanceLookup.accountId()).isEqualTo("account_id")
      assertThat(balanceLookup.availableBalance()).isEqualTo(123L)
      assertThat(balanceLookup.currentBalance()).isEqualTo(123L)
      assertThat(balanceLookup.type()).isEqualTo(BalanceLookup.Type.BALANCE_LOOKUP)
    }
}
