// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxaddresses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxAddressUpdateParamsTest {

    @Test
    fun create() {
        LockboxAddressUpdateParams.builder()
            .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
            .description("x")
            .status(LockboxAddressUpdateParams.Status.DISABLED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LockboxAddressUpdateParams.builder()
                .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("lockbox_address_lw6sbzl9ol5dfd8hdml6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LockboxAddressUpdateParams.builder()
                .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                .description("x")
                .status(LockboxAddressUpdateParams.Status.DISABLED)
                .build()

        val body = params._body()

        assertThat(body.description()).contains("x")
        assertThat(body.status()).contains(LockboxAddressUpdateParams.Status.DISABLED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LockboxAddressUpdateParams.builder()
                .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                .build()

        val body = params._body()
    }
}
