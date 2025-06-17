// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundMailItemListPageResponseTest {

    @Test
    fun create() {
        val inboundMailItemListPageResponse =
            InboundMailItemListPageResponse.builder()
                .addData(
                    InboundMailItem.builder()
                        .id("inbound_mail_item_q6rrg7mmqpplx80zceev")
                        .addCheck(
                            InboundMailItem.Check.builder()
                                .amount(1750L)
                                .backFileId("file_makxrc67oh9l6sg7w9yc")
                                .frontFileId("file_makxrc67oh9l6sg7w9yc")
                                .build()
                        )
                        .addCheck(
                            InboundMailItem.Check.builder()
                                .amount(1750L)
                                .backFileId("file_makxrc67oh9l6sg7w9yc")
                                .frontFileId("file_makxrc67oh9l6sg7w9yc")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .lockboxId("lockbox_3xt21ok13q19advds4t5")
                        .recipientName("Ian Crease")
                        .rejectionReason(null)
                        .status(InboundMailItem.Status.PROCESSED)
                        .type(InboundMailItem.Type.INBOUND_MAIL_ITEM)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(inboundMailItemListPageResponse.data())
            .containsExactly(
                InboundMailItem.builder()
                    .id("inbound_mail_item_q6rrg7mmqpplx80zceev")
                    .addCheck(
                        InboundMailItem.Check.builder()
                            .amount(1750L)
                            .backFileId("file_makxrc67oh9l6sg7w9yc")
                            .frontFileId("file_makxrc67oh9l6sg7w9yc")
                            .build()
                    )
                    .addCheck(
                        InboundMailItem.Check.builder()
                            .amount(1750L)
                            .backFileId("file_makxrc67oh9l6sg7w9yc")
                            .frontFileId("file_makxrc67oh9l6sg7w9yc")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .fileId("file_makxrc67oh9l6sg7w9yc")
                    .lockboxId("lockbox_3xt21ok13q19advds4t5")
                    .recipientName("Ian Crease")
                    .rejectionReason(null)
                    .status(InboundMailItem.Status.PROCESSED)
                    .type(InboundMailItem.Type.INBOUND_MAIL_ITEM)
                    .build()
            )
        assertThat(inboundMailItemListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundMailItemListPageResponse =
            InboundMailItemListPageResponse.builder()
                .addData(
                    InboundMailItem.builder()
                        .id("inbound_mail_item_q6rrg7mmqpplx80zceev")
                        .addCheck(
                            InboundMailItem.Check.builder()
                                .amount(1750L)
                                .backFileId("file_makxrc67oh9l6sg7w9yc")
                                .frontFileId("file_makxrc67oh9l6sg7w9yc")
                                .build()
                        )
                        .addCheck(
                            InboundMailItem.Check.builder()
                                .amount(1750L)
                                .backFileId("file_makxrc67oh9l6sg7w9yc")
                                .frontFileId("file_makxrc67oh9l6sg7w9yc")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .lockboxId("lockbox_3xt21ok13q19advds4t5")
                        .recipientName("Ian Crease")
                        .rejectionReason(null)
                        .status(InboundMailItem.Status.PROCESSED)
                        .type(InboundMailItem.Type.INBOUND_MAIL_ITEM)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedInboundMailItemListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundMailItemListPageResponse),
                jacksonTypeRef<InboundMailItemListPageResponse>(),
            )

        assertThat(roundtrippedInboundMailItemListPageResponse)
            .isEqualTo(inboundMailItemListPageResponse)
    }
}
