// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingBalanceLookupTest {

    @Test
    fun create() {
        val bookkeepingBalanceLookup =
            BookkeepingBalanceLookup.builder()
                .balance(100L)
                .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .type(BookkeepingBalanceLookup.Type.BOOKKEEPING_BALANCE_LOOKUP)
                .build()

        assertThat(bookkeepingBalanceLookup.balance()).isEqualTo(100L)
        assertThat(bookkeepingBalanceLookup.bookkeepingAccountId())
            .isEqualTo("bookkeeping_account_e37p1f1iuocw5intf35v")
        assertThat(bookkeepingBalanceLookup.type())
            .isEqualTo(BookkeepingBalanceLookup.Type.BOOKKEEPING_BALANCE_LOOKUP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookkeepingBalanceLookup =
            BookkeepingBalanceLookup.builder()
                .balance(100L)
                .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .type(BookkeepingBalanceLookup.Type.BOOKKEEPING_BALANCE_LOOKUP)
                .build()

        val roundtrippedBookkeepingBalanceLookup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookkeepingBalanceLookup),
                jacksonTypeRef<BookkeepingBalanceLookup>(),
            )

        assertThat(roundtrippedBookkeepingBalanceLookup).isEqualTo(bookkeepingBalanceLookup)
    }
}
