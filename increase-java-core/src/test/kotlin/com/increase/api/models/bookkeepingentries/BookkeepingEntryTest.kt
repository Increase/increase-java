// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingEntryTest {

    @Test
    fun createBookkeepingEntry() {
        val bookkeepingEntry =
            BookkeepingEntry.builder()
                .id("bookkeeping_entry_ctjpajsj3ks2blx10375")
                .accountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .amount(1750L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .entrySetId("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
                .type(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
                .build()
        assertThat(bookkeepingEntry).isNotNull
        assertThat(bookkeepingEntry.id()).isEqualTo("bookkeeping_entry_ctjpajsj3ks2blx10375")
        assertThat(bookkeepingEntry.accountId())
            .isEqualTo("bookkeeping_account_e37p1f1iuocw5intf35v")
        assertThat(bookkeepingEntry.amount()).isEqualTo(1750L)
        assertThat(bookkeepingEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(bookkeepingEntry.entrySetId())
            .isEqualTo("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
        assertThat(bookkeepingEntry.type()).isEqualTo(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
    }
}
