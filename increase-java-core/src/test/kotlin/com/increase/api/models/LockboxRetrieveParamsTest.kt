// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LockboxRetrieveParamsTest {

    @Test
    fun createLockboxRetrieveParams() {
        LockboxRetrieveParams.builder().lockboxId("lockbox_3xt21ok13q19advds4t5").build()
    }

    @Test
    fun getPathParam() {
        val params =
            LockboxRetrieveParams.builder().lockboxId("lockbox_3xt21ok13q19advds4t5").build()
        assertThat(params).isNotNull
        // path param "lockboxId"
        assertThat(params.getPathParam(0)).isEqualTo("lockbox_3xt21ok13q19advds4t5")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
