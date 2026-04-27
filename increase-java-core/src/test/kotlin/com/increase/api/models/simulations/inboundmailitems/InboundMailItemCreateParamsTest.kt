// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundmailitems

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundMailItemCreateParamsTest {

    @Test
    fun create() {
        InboundMailItemCreateParams.builder()
            .amount(1000L)
            .contentsFileId("contents_file_id")
            .lockboxAddressId("lockbox_address_id")
            .lockboxRecipientId("lockbox_3xt21ok13q19advds4t5")
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundMailItemCreateParams.builder()
                .amount(1000L)
                .contentsFileId("contents_file_id")
                .lockboxAddressId("lockbox_address_id")
                .lockboxRecipientId("lockbox_3xt21ok13q19advds4t5")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.contentsFileId()).contains("contents_file_id")
        assertThat(body.lockboxAddressId()).contains("lockbox_address_id")
        assertThat(body.lockboxRecipientId()).contains("lockbox_3xt21ok13q19advds4t5")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InboundMailItemCreateParams.builder().amount(1000L).build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1000L)
    }
}
