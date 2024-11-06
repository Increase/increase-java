// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PendingTransactionListParamsTest {

    @Test
    fun createPendingTransactionListParams() {
        PendingTransactionListParams.builder()
            .accountId("account_id")
            .category(
                PendingTransactionListParams.Category.builder()
                    .in_(
                        listOf(
                            PendingTransactionListParams.Category.In.ACCOUNT_TRANSFER_INSTRUCTION
                        )
                    )
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
            .cursor("cursor")
            .limit(123L)
            .routeId("route_id")
            .status(
                PendingTransactionListParams.Status.builder()
                    .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PendingTransactionListParams.builder()
                .accountId("account_id")
                .category(
                    PendingTransactionListParams.Category.builder()
                        .in_(
                            listOf(
                                PendingTransactionListParams.Category.In
                                    .ACCOUNT_TRANSFER_INSTRUCTION
                            )
                        )
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
                .cursor("cursor")
                .limit(123L)
                .routeId("route_id")
                .status(
                    PendingTransactionListParams.Status.builder()
                        .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("account_id", "account_id")
        PendingTransactionListParams.Category.builder()
            .in_(listOf(PendingTransactionListParams.Category.In.ACCOUNT_TRANSFER_INSTRUCTION))
            .build()
            .forEachQueryParam { key, values -> expected.put("category.$key", values) }
        PendingTransactionListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("limit", "123")
        expected.put("route_id", "route_id")
        PendingTransactionListParams.Status.builder()
            .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PendingTransactionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
