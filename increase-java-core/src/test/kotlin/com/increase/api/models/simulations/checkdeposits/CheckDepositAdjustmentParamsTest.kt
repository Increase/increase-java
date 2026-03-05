// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.checkdeposits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckDepositAdjustmentParamsTest {

    @Test
    fun create() {
        CheckDepositAdjustmentParams.builder()
            .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
            .amount(-1000000000L)
            .reason(CheckDepositAdjustmentParams.Reason.LATE_RETURN)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CheckDepositAdjustmentParams.builder()
                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("check_deposit_f06n9gpg7sxn8t19lfc1")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CheckDepositAdjustmentParams.builder()
                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                .amount(-1000000000L)
                .reason(CheckDepositAdjustmentParams.Reason.LATE_RETURN)
                .build()

        val body = params._body()

        assertThat(body.amount()).contains(-1000000000L)
        assertThat(body.reason()).contains(CheckDepositAdjustmentParams.Reason.LATE_RETURN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CheckDepositAdjustmentParams.builder()
                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                .build()

        val body = params._body()
    }
}
