// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntryListParamsTest {

    @Test
    fun createBookkeepingEntryListParams() {
        BookkeepingEntryListParams.builder()
            .accountId("account_id")
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            BookkeepingEntryListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("account_id", "account_id")
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BookkeepingEntryListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
