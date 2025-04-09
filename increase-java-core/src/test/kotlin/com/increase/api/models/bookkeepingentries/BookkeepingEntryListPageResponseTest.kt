// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingEntryListPageResponseTest {

    @Test
    fun create() {
        val bookkeepingEntryListPageResponse =
            BookkeepingEntryListPageResponse.builder()
                .addData(
                    BookkeepingEntry.builder()
                        .id("bookkeeping_entry_ctjpajsj3ks2blx10375")
                        .accountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                        .amount(1750L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entrySetId("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
                        .type(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(bookkeepingEntryListPageResponse.data())
            .containsExactly(
                BookkeepingEntry.builder()
                    .id("bookkeeping_entry_ctjpajsj3ks2blx10375")
                    .accountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                    .amount(1750L)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .entrySetId("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
                    .type(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
                    .build()
            )
        assertThat(bookkeepingEntryListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookkeepingEntryListPageResponse =
            BookkeepingEntryListPageResponse.builder()
                .addData(
                    BookkeepingEntry.builder()
                        .id("bookkeeping_entry_ctjpajsj3ks2blx10375")
                        .accountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                        .amount(1750L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entrySetId("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
                        .type(BookkeepingEntry.Type.BOOKKEEPING_ENTRY)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedBookkeepingEntryListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookkeepingEntryListPageResponse),
                jacksonTypeRef<BookkeepingEntryListPageResponse>(),
            )

        assertThat(roundtrippedBookkeepingEntryListPageResponse)
            .isEqualTo(bookkeepingEntryListPageResponse)
    }
}
