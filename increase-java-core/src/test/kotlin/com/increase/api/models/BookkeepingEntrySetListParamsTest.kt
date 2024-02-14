// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntrySetListParamsTest {

    @Test
    fun createBookkeepingEntrySetListParams() {
        BookkeepingEntrySetListParams.builder()
            .cursor("string")
            .idempotencyKey("x")
            .limit(123L)
            .transactionId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            BookkeepingEntrySetListParams.builder()
                .cursor("string")
                .idempotencyKey("x")
                .limit(123L)
                .transactionId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("idempotency_key", listOf("x"))
        expected.put("limit", listOf("123"))
        expected.put("transaction_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BookkeepingEntrySetListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
