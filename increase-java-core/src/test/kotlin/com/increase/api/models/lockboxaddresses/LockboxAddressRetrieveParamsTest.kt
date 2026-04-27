// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxaddresses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxAddressRetrieveParamsTest {

    @Test
    fun create() {
        LockboxAddressRetrieveParams.builder()
            .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LockboxAddressRetrieveParams.builder()
                .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("lockbox_address_lw6sbzl9ol5dfd8hdml6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
