// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LockboxUpdateParamsTest {

    @Test
    fun createLockboxUpdateParams() {
        LockboxUpdateParams.builder()
            .lockboxId("lockbox_id")
            .description("x")
            .status(LockboxUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LockboxUpdateParams.builder()
                .lockboxId("lockbox_id")
                .description("x")
                .status(LockboxUpdateParams.Status.ACTIVE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.status()).isEqualTo(LockboxUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LockboxUpdateParams.builder().lockboxId("lockbox_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LockboxUpdateParams.builder().lockboxId("lockbox_id").build()
        assertThat(params).isNotNull
        // path param "lockboxId"
        assertThat(params.getPathParam(0)).isEqualTo("lockbox_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
