// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingAccountListParamsTest {

    @Test
    fun createBookkeepingAccountListParams() {
        BookkeepingAccountListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            BookkeepingAccountListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("cursor"))
        expected.put("idempotency_key", listOf("x"))
        expected.put("limit", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BookkeepingAccountListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
