package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PendingTransactionListParamsTest {

    @Test
    fun createPendingTransactionListParams() {
        PendingTransactionListParams.builder()
            .cursor("string")
            .limit(123L)
            .accountId("string")
            .routeId("string")
            .sourceId("string")
            .status(
                PendingTransactionListParams.Status.builder()
                    .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
                    .build()
            )
            .createdAt(
                PendingTransactionListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PendingTransactionListParams.builder()
                .cursor("string")
                .limit(123L)
                .accountId("string")
                .routeId("string")
                .sourceId("string")
                .status(
                    PendingTransactionListParams.Status.builder()
                        .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
                        .build()
                )
                .createdAt(
                    PendingTransactionListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("account_id", listOf("string"))
        expected.put("route_id", listOf("string"))
        expected.put("source_id", listOf("string"))
        PendingTransactionListParams.Status.builder()
            .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        PendingTransactionListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PendingTransactionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
