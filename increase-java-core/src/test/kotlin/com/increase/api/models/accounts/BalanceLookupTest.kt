// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceLookupTest {

    @Test
    fun create() {
        val balanceLookup =
            BalanceLookup.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .availableBalance(100L)
                .currentBalance(100L)
                .type(BalanceLookup.Type.BALANCE_LOOKUP)
                .build()

        assertThat(balanceLookup.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(balanceLookup.availableBalance()).isEqualTo(100L)
        assertThat(balanceLookup.currentBalance()).isEqualTo(100L)
        assertThat(balanceLookup.type()).isEqualTo(BalanceLookup.Type.BALANCE_LOOKUP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceLookup =
            BalanceLookup.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .availableBalance(100L)
                .currentBalance(100L)
                .type(BalanceLookup.Type.BALANCE_LOOKUP)
                .build()

        val roundtrippedBalanceLookup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceLookup),
                jacksonTypeRef<BalanceLookup>(),
            )

        assertThat(roundtrippedBalanceLookup).isEqualTo(balanceLookup)
    }
}
