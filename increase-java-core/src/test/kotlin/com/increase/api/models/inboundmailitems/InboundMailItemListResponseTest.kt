// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundMailItemListResponseTest {

    @Test
    fun create() {
        val inboundMailItemListResponse =
            InboundMailItemListResponse.builder()
                .addData(
                    InboundMailItem.builder()
                        .id("inbound_mail_item_q6rrg7mmqpplx80zceev")
                        .addCheck(
                            InboundMailItem.Check.builder()
                                .amount(1750L)
                                .backFileId("file_makxrc67oh9l6sg7w9yc")
                                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                                .frontFileId("file_makxrc67oh9l6sg7w9yc")
                                .status(InboundMailItem.Check.Status.DEPOSITED)
                                .build()
                        )
                        .addCheck(
                            InboundMailItem.Check.builder()
                                .amount(1750L)
                                .backFileId("file_makxrc67oh9l6sg7w9yc")
                                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                                .frontFileId("file_makxrc67oh9l6sg7w9yc")
                                .status(InboundMailItem.Check.Status.DEPOSITED)
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

        assertThat(inboundMailItemListResponse.data())
            .containsExactly(
                InboundMailItem.builder()
                    .id("inbound_mail_item_q6rrg7mmqpplx80zceev")
                    .addCheck(
                        InboundMailItem.Check.builder()
                            .amount(1750L)
                            .backFileId("file_makxrc67oh9l6sg7w9yc")
                            .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                            .frontFileId("file_makxrc67oh9l6sg7w9yc")
                            .status(InboundMailItem.Check.Status.DEPOSITED)
                            .build()
                    )
                    .addCheck(
                        InboundMailItem.Check.builder()
                            .amount(1750L)
                            .backFileId("file_makxrc67oh9l6sg7w9yc")
                            .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                            .frontFileId("file_makxrc67oh9l6sg7w9yc")
                            .status(InboundMailItem.Check.Status.DEPOSITED)
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
        assertThat(inboundMailItemListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundMailItemListResponse =
            InboundMailItemListResponse.builder()
                .addData(
                    InboundMailItem.builder()
                        .id("inbound_mail_item_q6rrg7mmqpplx80zceev")
                        .addCheck(
                            InboundMailItem.Check.builder()
                                .amount(1750L)
                                .backFileId("file_makxrc67oh9l6sg7w9yc")
                                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                                .frontFileId("file_makxrc67oh9l6sg7w9yc")
                                .status(InboundMailItem.Check.Status.DEPOSITED)
                                .build()
                        )
                        .addCheck(
                            InboundMailItem.Check.builder()
                                .amount(1750L)
                                .backFileId("file_makxrc67oh9l6sg7w9yc")
                                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                                .frontFileId("file_makxrc67oh9l6sg7w9yc")
                                .status(InboundMailItem.Check.Status.DEPOSITED)
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

        val roundtrippedInboundMailItemListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundMailItemListResponse),
                jacksonTypeRef<InboundMailItemListResponse>(),
            )

        assertThat(roundtrippedInboundMailItemListResponse).isEqualTo(inboundMailItemListResponse)
    }
}
