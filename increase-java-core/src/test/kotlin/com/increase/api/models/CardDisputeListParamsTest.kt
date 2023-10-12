// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDisputeListParamsTest {

    @Test
    fun createCardDisputeListParams() {
        CardDisputeListParams.builder()
            .createdAt(
                CardDisputeListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("string")
            .limit(123L)
            .status(
                CardDisputeListParams.Status.builder()
                    .in_(listOf(CardDisputeListParams.Status.In.PENDING_REVIEWING))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CardDisputeListParams.builder()
                .createdAt(
                    CardDisputeListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("string")
                .limit(123L)
                .status(
                    CardDisputeListParams.Status.builder()
                        .in_(listOf(CardDisputeListParams.Status.In.PENDING_REVIEWING))
                        .build()
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        CardDisputeListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        CardDisputeListParams.Status.builder()
            .in_(listOf(CardDisputeListParams.Status.In.PENDING_REVIEWING))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CardDisputeListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
