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
                    )
                )
                .nextCursor("string")
                .build()
        assertThat(inboundMailItemList).isNotNull
        assertThat(inboundMailItemList.data())
            .containsExactly(
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
            )
        assertThat(inboundMailItemList.nextCursor()).contains("string")
    }
}
