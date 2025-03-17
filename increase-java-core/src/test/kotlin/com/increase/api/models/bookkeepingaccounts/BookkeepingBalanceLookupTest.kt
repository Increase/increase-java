// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingBalanceLookupTest {

    @Test
    fun createBookkeepingBalanceLookup() {
        val bookkeepingBalanceLookup =
            BookkeepingBalanceLookup.builder()
                .balance(100L)
                .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .type(BookkeepingBalanceLookup.Type.BOOKKEEPING_BALANCE_LOOKUP)
                .build()
        assertThat(bookkeepingBalanceLookup).isNotNull
        assertThat(bookkeepingBalanceLookup.balance()).isEqualTo(100L)
        assertThat(bookkeepingBalanceLookup.bookkeepingAccountId())
            .isEqualTo("bookkeeping_account_e37p1f1iuocw5intf35v")
        assertThat(bookkeepingBalanceLookup.type())
            .isEqualTo(BookkeepingBalanceLookup.Type.BOOKKEEPING_BALANCE_LOOKUP)
    }
}
