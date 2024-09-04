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
import com.increase.api.models.BookkeepingBalanceLookup

class BookkeepingBalanceLookupTest {

    @Test
    fun createBookkeepingBalanceLookup() {
      val bookkeepingBalanceLookup = BookkeepingBalanceLookup.builder()
          .balance(123L)
          .bookkeepingAccountId("bookkeeping_account_id")
          .type(BookkeepingBalanceLookup.Type.BOOKKEEPING_BALANCE_LOOKUP)
          .build()
      assertThat(bookkeepingBalanceLookup).isNotNull
      assertThat(bookkeepingBalanceLookup.balance()).isEqualTo(123L)
      assertThat(bookkeepingBalanceLookup.bookkeepingAccountId()).isEqualTo("bookkeeping_account_id")
      assertThat(bookkeepingBalanceLookup.type()).isEqualTo(BookkeepingBalanceLookup.Type.BOOKKEEPING_BALANCE_LOOKUP)
    }
}
