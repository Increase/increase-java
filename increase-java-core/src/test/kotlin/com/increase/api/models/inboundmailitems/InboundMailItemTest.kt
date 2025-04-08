// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundMailItemTest {

    @Test
    fun create() {
        val inboundMailItem =
            InboundMailItem.builder()
                .id("inbound_mail_item_q6rrg7mmqpplx80zceev")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .lockboxId("lockbox_3xt21ok13q19advds4t5")
                .recipientName("Ian Crease")
                .rejectionReason(null)
                .status(InboundMailItem.Status.PROCESSED)
                .type(InboundMailItem.Type.INBOUND_MAIL_ITEM)
                .build()

        assertThat(inboundMailItem.id()).isEqualTo("inbound_mail_item_q6rrg7mmqpplx80zceev")
        assertThat(inboundMailItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundMailItem.fileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(inboundMailItem.lockboxId()).contains("lockbox_3xt21ok13q19advds4t5")
        assertThat(inboundMailItem.recipientName()).contains("Ian Crease")
        assertThat(inboundMailItem.rejectionReason()).isEmpty
        assertThat(inboundMailItem.status()).isEqualTo(InboundMailItem.Status.PROCESSED)
        assertThat(inboundMailItem.type()).isEqualTo(InboundMailItem.Type.INBOUND_MAIL_ITEM)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundMailItem =
            InboundMailItem.builder()
                .id("inbound_mail_item_q6rrg7mmqpplx80zceev")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .lockboxId("lockbox_3xt21ok13q19advds4t5")
                .recipientName("Ian Crease")
                .rejectionReason(null)
                .status(InboundMailItem.Status.PROCESSED)
                .type(InboundMailItem.Type.INBOUND_MAIL_ITEM)
                .build()

        val roundtrippedInboundMailItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundMailItem),
                jacksonTypeRef<InboundMailItem>(),
            )

        assertThat(roundtrippedInboundMailItem).isEqualTo(inboundMailItem)
    }
}
