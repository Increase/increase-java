// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntrySetListParamsTest {

    @Test
    fun createBookkeepingEntrySetListParams() {
        BookkeepingEntrySetListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(123L)
            .transactionId("transaction_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            BookkeepingEntrySetListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(123L)
                .transactionId("transaction_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "123")
        expected.put("transaction_id", "transaction_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BookkeepingEntrySetListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
