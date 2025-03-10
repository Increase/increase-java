// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntrySetListParamsTest {

    @Test
    fun create() {
        BookkeepingEntrySetListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .transactionId("transaction_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BookkeepingEntrySetListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .transactionId("transaction_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        expected.put("transaction_id", "transaction_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BookkeepingEntrySetListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
