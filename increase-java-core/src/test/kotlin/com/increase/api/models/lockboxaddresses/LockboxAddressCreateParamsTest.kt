// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxaddresses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxAddressCreateParamsTest {

    @Test
    fun create() {
        LockboxAddressCreateParams.builder().description("Lockbox Address 1").build()
    }

    @Test
    fun body() {
        val params = LockboxAddressCreateParams.builder().description("Lockbox Address 1").build()

        val body = params._body()

        assertThat(body.description()).contains("Lockbox Address 1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LockboxAddressCreateParams.builder().build()

        val body = params._body()
    }
}
