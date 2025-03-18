// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundcheckdeposits

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundCheckDepositCreateParamsTest {

    @Test
    fun create() {
        InboundCheckDepositCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .checkNumber("1234567890")
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundCheckDepositCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .checkNumber("1234567890")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.checkNumber()).isEqualTo("1234567890")
    }
}
