// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundMailItemTest {

    @Test
    fun createInboundMailItem() {
        val inboundMailItem =
            InboundMailItem.builder()
                .id("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileId("string")
                .lockboxId("string")
                .recipientName("string")
                .rejectionReason(InboundMailItem.RejectionReason.NO_MATCHING_LOCKBOX)
                .returnAddress(
                    InboundMailItem.ReturnAddress.builder()
                        .city("string")
                        .line1("string")
                        .line2("string")
                        .name("string")
                        .postalCode("string")
                        .state("string")
                        .build()
                )
                .status(InboundMailItem.Status.PENDING)
                .type(InboundMailItem.Type.INBOUND_MAIL_ITEM)
                .build()
        assertThat(inboundMailItem).isNotNull
        assertThat(inboundMailItem.id()).isEqualTo("string")
        assertThat(inboundMailItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundMailItem.fileId()).isEqualTo("string")
        assertThat(inboundMailItem.lockboxId()).contains("string")
        assertThat(inboundMailItem.recipientName()).contains("string")
        assertThat(inboundMailItem.rejectionReason())
            .contains(InboundMailItem.RejectionReason.NO_MATCHING_LOCKBOX)
        assertThat(inboundMailItem.returnAddress())
            .contains(
                InboundMailItem.ReturnAddress.builder()
                    .city("string")
                    .line1("string")
                    .line2("string")
                    .name("string")
                    .postalCode("string")
                    .state("string")
                    .build()
            )
        assertThat(inboundMailItem.status()).isEqualTo(InboundMailItem.Status.PENDING)
        assertThat(inboundMailItem.type()).isEqualTo(InboundMailItem.Type.INBOUND_MAIL_ITEM)
    }
}
