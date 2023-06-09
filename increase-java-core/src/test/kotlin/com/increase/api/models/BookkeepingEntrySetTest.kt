package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntrySetTest {

    @Test
    fun createBookkeepingEntrySet() {
        val bookkeepingEntrySet =
            BookkeepingEntrySet.builder()
                .id("string")
                .transactionId("string")
                .date(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entries(
                    listOf(
                        BookkeepingEntrySet.Entry.builder()
                            .accountId("string")
                            .amount(123L)
                            .id("string")
                            .build()
                    )
                )
                .type(BookkeepingEntrySet.Type.BOOKKEEPING_ENTRY_SET)
                .build()
        assertThat(bookkeepingEntrySet).isNotNull
        assertThat(bookkeepingEntrySet.id()).isEqualTo("string")
        assertThat(bookkeepingEntrySet.transactionId()).contains("string")
        assertThat(bookkeepingEntrySet.date())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bookkeepingEntrySet.entries())
            .containsExactly(
                BookkeepingEntrySet.Entry.builder()
                    .accountId("string")
                    .amount(123L)
                    .id("string")
                    .build()
            )
        assertThat(bookkeepingEntrySet.type())
            .isEqualTo(BookkeepingEntrySet.Type.BOOKKEEPING_ENTRY_SET)
    }
}
