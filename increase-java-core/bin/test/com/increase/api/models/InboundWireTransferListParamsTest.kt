// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireTransferListParamsTest {

    @Test
    fun createInboundWireTransferListParams() {
        InboundWireTransferListParams.builder()
            .accountId("account_id")
            .accountNumberId("account_number_id")
            .createdAt(
                InboundWireTransferListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .limit(123L)
            .status(InboundWireTransferListParams.Status.PENDING)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InboundWireTransferListParams.builder()
                .accountId("account_id")
                .accountNumberId("account_number_id")
                .createdAt(
                    InboundWireTransferListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .limit(123L)
                .status(InboundWireTransferListParams.Status.PENDING)
                .build()
        val expected = QueryParams.builder()
        expected.put("account_id", "account_id")
        expected.put("account_number_id", "account_number_id")
        InboundWireTransferListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("limit", "123")
        expected.put("status", InboundWireTransferListParams.Status.PENDING.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = InboundWireTransferListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
