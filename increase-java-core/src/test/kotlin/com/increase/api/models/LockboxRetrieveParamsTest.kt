// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LockboxRetrieveParamsTest {

    @Test
    fun createLockboxRetrieveParams() {
        LockboxRetrieveParams.builder().lockboxId("lockbox_id").build()
    }

    @Test
    fun getPathParam() {
        val params = LockboxRetrieveParams.builder().lockboxId("lockbox_id").build()
        assertThat(params).isNotNull
        // path param "lockboxId"
        assertThat(params.getPathParam(0)).isEqualTo("lockbox_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
