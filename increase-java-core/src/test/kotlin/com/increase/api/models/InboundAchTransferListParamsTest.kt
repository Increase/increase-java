// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferListParamsTest {

    @Test
    fun createInboundAchTransferListParams() {
        InboundAchTransferListParams.builder()
            .accountId("string")
            .accountNumberId("string")
            .createdAt(
                InboundAchTransferListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("string")
            .limit(123L)
            .status(InboundAchTransferListParams.Status.PENDING)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InboundAchTransferListParams.builder()
                .accountId("string")
                .accountNumberId("string")
                .createdAt(
                    InboundAchTransferListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("string")
                .limit(123L)
                .status(InboundAchTransferListParams.Status.PENDING)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_id", listOf("string"))
        expected.put("account_number_id", listOf("string"))
        InboundAchTransferListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("status", listOf(InboundAchTransferListParams.Status.PENDING.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = InboundAchTransferListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
