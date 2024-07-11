// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundMailItemListTest {

    @Test
    fun createInboundMailItemList() {
        val inboundMailItemList =
            InboundMailItemList.builder()
                .data(
                    listOf(
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
                    )
                )
                .nextCursor("next_cursor")
                .build()
        assertThat(inboundMailItemList).isNotNull
        assertThat(inboundMailItemList.data())
            .containsExactly(
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
            )
        assertThat(inboundMailItemList.nextCursor()).contains("next_cursor")
    }
}
