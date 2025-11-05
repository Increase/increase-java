// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxUpdateParamsTest {

    @Test
    fun create() {
        LockboxUpdateParams.builder()
            .lockboxId("lockbox_3xt21ok13q19advds4t5")
            .checkDepositBehavior(LockboxUpdateParams.CheckDepositBehavior.DISABLED)
            .description("x")
            .recipientName("x")
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
                .checkDepositBehavior(LockboxUpdateParams.CheckDepositBehavior.DISABLED)
                .description("x")
                .recipientName("x")
                .build()

        val body = params._body()

        assertThat(body.checkDepositBehavior())
            .contains(LockboxUpdateParams.CheckDepositBehavior.DISABLED)
        assertThat(body.description()).contains("x")
        assertThat(body.recipientName()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LockboxUpdateParams.builder().lockboxId("lockbox_3xt21ok13q19advds4t5").build()

        val body = params._body()
    }
}
