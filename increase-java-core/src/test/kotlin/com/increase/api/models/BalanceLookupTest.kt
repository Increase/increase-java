// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceLookupTest {

    @Test
    fun createBalanceLookup() {
        val balanceLookup =
            BalanceLookup.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .availableBalance(100L)
                .currentBalance(100L)
                .type(BalanceLookup.Type.BALANCE_LOOKUP)
                .build()
        assertThat(balanceLookup).isNotNull
        assertThat(balanceLookup.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(balanceLookup.availableBalance()).isEqualTo(100L)
        assertThat(balanceLookup.currentBalance()).isEqualTo(100L)
        assertThat(balanceLookup.type()).isEqualTo(BalanceLookup.Type.BALANCE_LOOKUP)
    }
}
