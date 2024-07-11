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
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileId("file_id")
                .lockboxId("lockbox_id")
                .recipientName("recipient_name")
                .rejectionReason(InboundMailItem.RejectionReason.NO_MATCHING_LOCKBOX)
                .returnAddress(
                    InboundMailItem.ReturnAddress.builder()
                        .city("city")
                        .line1("line1")
                        .line2("line2")
                        .name("name")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .status(InboundMailItem.Status.PENDING)
                .type(InboundMailItem.Type.INBOUND_MAIL_ITEM)
                .build()
        assertThat(inboundMailItem).isNotNull
        assertThat(inboundMailItem.id()).isEqualTo("id")
        assertThat(inboundMailItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundMailItem.fileId()).isEqualTo("file_id")
        assertThat(inboundMailItem.lockboxId()).contains("lockbox_id")
        assertThat(inboundMailItem.recipientName()).contains("recipient_name")
        assertThat(inboundMailItem.rejectionReason())
            .contains(InboundMailItem.RejectionReason.NO_MATCHING_LOCKBOX)
        assertThat(inboundMailItem.returnAddress())
            .contains(
                InboundMailItem.ReturnAddress.builder()
                    .city("city")
                    .line1("line1")
                    .line2("line2")
                    .name("name")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(inboundMailItem.status()).isEqualTo(InboundMailItem.Status.PENDING)
        assertThat(inboundMailItem.type()).isEqualTo(InboundMailItem.Type.INBOUND_MAIL_ITEM)
    }
}
