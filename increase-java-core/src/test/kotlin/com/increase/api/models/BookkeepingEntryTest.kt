// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
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
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entrySetId("string")
                .type(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
                .build()
        assertThat(bookkeepingEntry).isNotNull
        assertThat(bookkeepingEntry.id()).isEqualTo("string")
        assertThat(bookkeepingEntry.accountId()).isEqualTo("string")
        assertThat(bookkeepingEntry.amount()).isEqualTo(123L)
        assertThat(bookkeepingEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bookkeepingEntry.entrySetId()).isEqualTo("string")
        assertThat(bookkeepingEntry.type()).isEqualTo(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
    }
}
