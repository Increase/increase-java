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
import com.increase.api.models.BookkeepingEntry

class BookkeepingEntryTest {

    @Test
    fun createBookkeepingEntry() {
      val bookkeepingEntry = BookkeepingEntry.builder()
          .id("id")
          .accountId("account_id")
          .amount(123L)
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .entrySetId("entry_set_id")
          .type(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
          .build()
      assertThat(bookkeepingEntry).isNotNull
      assertThat(bookkeepingEntry.id()).isEqualTo("id")
      assertThat(bookkeepingEntry.accountId()).isEqualTo("account_id")
      assertThat(bookkeepingEntry.amount()).isEqualTo(123L)
      assertThat(bookkeepingEntry.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(bookkeepingEntry.entrySetId()).isEqualTo("entry_set_id")
      assertThat(bookkeepingEntry.type()).isEqualTo(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
    }
}
