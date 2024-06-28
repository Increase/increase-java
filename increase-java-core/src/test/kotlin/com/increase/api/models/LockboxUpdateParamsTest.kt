// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LockboxUpdateParamsTest {

    @Test
    fun createLockboxUpdateParams() {
        LockboxUpdateParams.builder()
            .lockboxId("string")
            .description("x")
            .status(LockboxUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LockboxUpdateParams.builder()
                .lockboxId("string")
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
        val params = LockboxUpdateParams.builder().lockboxId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LockboxUpdateParams.builder().lockboxId("string").build()
        assertThat(params).isNotNull
        // path param "lockboxId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
