// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.checkdeposits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckDepositSubmitParamsTest {

    @Test
    fun create() {
        CheckDepositSubmitParams.builder()
            .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
            .scan(
                CheckDepositSubmitParams.Scan.builder()
                    .accountNumber("x")
                    .routingNumber("x")
                    .auxiliaryOnUs("x")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CheckDepositSubmitParams.builder()
                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("check_deposit_f06n9gpg7sxn8t19lfc1")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CheckDepositSubmitParams.builder()
                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                .scan(
                    CheckDepositSubmitParams.Scan.builder()
                        .accountNumber("x")
                        .routingNumber("x")
                        .auxiliaryOnUs("x")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.scan())
            .contains(
                CheckDepositSubmitParams.Scan.builder()
                    .accountNumber("x")
                    .routingNumber("x")
                    .auxiliaryOnUs("x")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CheckDepositSubmitParams.builder()
                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                .build()

        val body = params._body()
    }
}
