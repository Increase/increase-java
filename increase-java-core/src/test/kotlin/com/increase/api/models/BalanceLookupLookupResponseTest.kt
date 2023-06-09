package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceLookupLookupResponseTest {

    @Test
    fun createBalanceLookupLookupResponse() {
        val balanceLookupLookupResponse =
            BalanceLookupLookupResponse.builder()
                .accountId("string")
                .currentBalance(123L)
                .availableBalance(123L)
                .type(BalanceLookupLookupResponse.Type.BALANCE_LOOKUP)
                .build()
        assertThat(balanceLookupLookupResponse).isNotNull
        assertThat(balanceLookupLookupResponse.accountId()).isEqualTo("string")
        assertThat(balanceLookupLookupResponse.currentBalance()).isEqualTo(123L)
        assertThat(balanceLookupLookupResponse.availableBalance()).isEqualTo(123L)
        assertThat(balanceLookupLookupResponse.type())
            .isEqualTo(BalanceLookupLookupResponse.Type.BALANCE_LOOKUP)
    }
}
