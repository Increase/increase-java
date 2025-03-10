// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundmailitems

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundMailItemCreateParamsTest {

    @Test
    fun create() {
        InboundMailItemCreateParams.builder()
            .amount(1000L)
            .lockboxId("lockbox_3xt21ok13q19advds4t5")
            .contentsFileId("contents_file_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundMailItemCreateParams.builder()
                .amount(1000L)
                .lockboxId("lockbox_3xt21ok13q19advds4t5")
                .contentsFileId("contents_file_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.lockboxId()).isEqualTo("lockbox_3xt21ok13q19advds4t5")
        assertThat(body.contentsFileId()).contains("contents_file_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundMailItemCreateParams.builder()
                .amount(1000L)
                .lockboxId("lockbox_3xt21ok13q19advds4t5")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.lockboxId()).isEqualTo("lockbox_3xt21ok13q19advds4t5")
    }
}
