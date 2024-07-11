// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceLookupTest {

    @Test
    fun createBalanceLookup() {
        val balanceLookup =
            BalanceLookup.builder()
                .accountId("account_id")
                .availableBalance(123L)
                .currentBalance(123L)
                .type(BalanceLookup.Type.BALANCE_LOOKUP)
                .build()
        assertThat(balanceLookup).isNotNull
        assertThat(balanceLookup.accountId()).isEqualTo("account_id")
        assertThat(balanceLookup.availableBalance()).isEqualTo(123L)
        assertThat(balanceLookup.currentBalance()).isEqualTo(123L)
        assertThat(balanceLookup.type()).isEqualTo(BalanceLookup.Type.BALANCE_LOOKUP)
    }
}
