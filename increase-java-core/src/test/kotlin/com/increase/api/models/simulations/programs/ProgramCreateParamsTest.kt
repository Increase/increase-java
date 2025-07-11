// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.programs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProgramCreateParamsTest {

    @Test
    fun create() {
        ProgramCreateParams.builder()
            .name("For Benefit Of")
            .bank(ProgramCreateParams.Bank.BLUE_RIDGE_BANK)
            .reserveAccountId("reserve_account_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProgramCreateParams.builder()
                .name("For Benefit Of")
                .bank(ProgramCreateParams.Bank.BLUE_RIDGE_BANK)
                .reserveAccountId("reserve_account_id")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("For Benefit Of")
        assertThat(body.bank()).contains(ProgramCreateParams.Bank.BLUE_RIDGE_BANK)
        assertThat(body.reserveAccountId()).contains("reserve_account_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProgramCreateParams.builder().name("For Benefit Of").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("For Benefit Of")
    }
}
