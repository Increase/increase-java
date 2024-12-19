// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LockboxUpdateParamsTest {

    @Test
    fun createLockboxUpdateParams() {
        LockboxUpdateParams.builder()
            .lockboxId("lockbox_3xt21ok13q19advds4t5")
            .description("x")
            .recipientName("x")
            .status(LockboxUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LockboxUpdateParams.builder()
                .lockboxId("lockbox_3xt21ok13q19advds4t5")
                .description("x")
                .recipientName("x")
                .status(LockboxUpdateParams.Status.ACTIVE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.recipientName()).isEqualTo("x")
        assertThat(body.status()).isEqualTo(LockboxUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LockboxUpdateParams.builder().lockboxId("lockbox_3xt21ok13q19advds4t5").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LockboxUpdateParams.builder().lockboxId("lockbox_3xt21ok13q19advds4t5").build()
        assertThat(params).isNotNull
        // path param "lockboxId"
        assertThat(params.getPathParam(0)).isEqualTo("lockbox_3xt21ok13q19advds4t5")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
