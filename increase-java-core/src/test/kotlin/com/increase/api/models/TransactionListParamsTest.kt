// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionListParamsTest {

    @Test
    fun createTransactionListParams() {
        TransactionListParams.builder()
            .accountId("account_id")
            .category(
                TransactionListParams.Category.builder()
                    .in_(listOf(TransactionListParams.Category.In.ACCOUNT_TRANSFER_INTENTION))
                    .build()
            )
            .createdAt(
                TransactionListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .limit(123L)
            .routeId("route_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TransactionListParams.builder()
                .accountId("account_id")
                .category(
                    TransactionListParams.Category.builder()
                        .in_(listOf(TransactionListParams.Category.In.ACCOUNT_TRANSFER_INTENTION))
                        .build()
                )
                .createdAt(
                    TransactionListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .limit(123L)
                .routeId("route_id")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_id", listOf("account_id"))
        TransactionListParams.Category.builder()
            .in_(listOf(TransactionListParams.Category.In.ACCOUNT_TRANSFER_INTENTION))
            .build()
            .forEachQueryParam { key, values -> expected.put("category.$key", values) }
        TransactionListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", listOf("cursor"))
        expected.put("limit", listOf("123"))
        expected.put("route_id", listOf("route_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
