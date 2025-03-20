// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxUpdateParamsTest {

    @Test
    fun create() {
        LockboxUpdateParams.builder()
            .lockboxId("lockbox_3xt21ok13q19advds4t5")
            .description("x")
            .recipientName("x")
            .status(LockboxUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun pathParams() {
        val params = LockboxUpdateParams.builder().lockboxId("lockbox_3xt21ok13q19advds4t5").build()

        assertThat(params._pathParam(0)).isEqualTo("lockbox_3xt21ok13q19advds4t5")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LockboxUpdateParams.builder()
                .lockboxId("lockbox_3xt21ok13q19advds4t5")
                .description("x")
                .recipientName("x")
                .status(LockboxUpdateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body.description()).contains("x")
        assertThat(body.recipientName()).contains("x")
        assertThat(body.status()).contains(LockboxUpdateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LockboxUpdateParams.builder().lockboxId("lockbox_3xt21ok13q19advds4t5").build()

        val body = params._body()
    }
}
