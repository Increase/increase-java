package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntryTest {

    @Test
    fun createBookkeepingEntry() {
        val bookkeepingEntry =
            BookkeepingEntry.builder()
                .id("string")
                .accountId("string")
                .amount(123L)
                .entrySetId("string")
                .type(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
                .build()
        assertThat(bookkeepingEntry).isNotNull
        assertThat(bookkeepingEntry.accountId()).isEqualTo("string")
        assertThat(bookkeepingEntry.amount()).isEqualTo(123L)
        assertThat(bookkeepingEntry.entrySetId()).isEqualTo("string")
        assertThat(bookkeepingEntry.id()).isEqualTo("string")
        assertThat(bookkeepingEntry.type()).isEqualTo(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
    }
}
