// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DeclinedTransactionListParamsTest {

    @Test
    fun createDeclinedTransactionListParams() {
        DeclinedTransactionListParams.builder()
            .accountId("string")
            .category(
                DeclinedTransactionListParams.Category.builder()
                    .in_(listOf(DeclinedTransactionListParams.Category.In.ACH_DECLINE))
                    .build()
            )
            .createdAt(
                DeclinedTransactionListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("string")
            .limit(123L)
            .routeId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DeclinedTransactionListParams.builder()
                .accountId("string")
                .category(
                    DeclinedTransactionListParams.Category.builder()
                        .in_(listOf(DeclinedTransactionListParams.Category.In.ACH_DECLINE))
                        .build()
                )
                .createdAt(
                    DeclinedTransactionListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("string")
                .limit(123L)
                .routeId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_id", listOf("string"))
        DeclinedTransactionListParams.Category.builder()
            .in_(listOf(DeclinedTransactionListParams.Category.In.ACH_DECLINE))
            .build()
            .forEachQueryParam { key, values -> expected.put("category.$key", values) }
        DeclinedTransactionListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("route_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DeclinedTransactionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
