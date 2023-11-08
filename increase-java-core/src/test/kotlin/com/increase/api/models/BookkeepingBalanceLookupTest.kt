// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingBalanceLookupTest {

    @Test
    fun createBookkeepingBalanceLookup() {
        val bookkeepingBalanceLookup =
            BookkeepingBalanceLookup.builder()
                .balance(123L)
                .bookkeepingAccountId("string")
                .type(BookkeepingBalanceLookup.Type.BOOKKEEPING_BALANCE_LOOKUP)
                .build()
        assertThat(bookkeepingBalanceLookup).isNotNull
        assertThat(bookkeepingBalanceLookup.balance()).isEqualTo(123L)
        assertThat(bookkeepingBalanceLookup.bookkeepingAccountId()).isEqualTo("string")
        assertThat(bookkeepingBalanceLookup.type())
            .isEqualTo(BookkeepingBalanceLookup.Type.BOOKKEEPING_BALANCE_LOOKUP)
    }
}
