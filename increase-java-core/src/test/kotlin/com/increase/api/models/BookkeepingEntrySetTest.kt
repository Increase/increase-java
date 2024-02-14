// File generated from our OpenAPI spec by Stainless.

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
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .date(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entries(
                    listOf(
                        BookkeepingEntrySet.Entry.builder()
                            .id("string")
                            .accountId("string")
                            .amount(123L)
                            .build()
                    )
                )
                .idempotencyKey("string")
                .transactionId("string")
                .type(BookkeepingEntrySet.Type.BOOKKEEPING_ENTRY_SET)
                .build()
        assertThat(bookkeepingEntrySet).isNotNull
        assertThat(bookkeepingEntrySet.id()).isEqualTo("string")
        assertThat(bookkeepingEntrySet.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bookkeepingEntrySet.date())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(bookkeepingEntrySet.entries())
            .containsExactly(
                BookkeepingEntrySet.Entry.builder()
                    .id("string")
                    .accountId("string")
                    .amount(123L)
                    .build()
            )
        assertThat(bookkeepingEntrySet.idempotencyKey()).contains("string")
        assertThat(bookkeepingEntrySet.transactionId()).contains("string")
        assertThat(bookkeepingEntrySet.type())
            .isEqualTo(BookkeepingEntrySet.Type.BOOKKEEPING_ENTRY_SET)
    }
}
