// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntryListParamsTest {

    @Test
    fun createBookkeepingEntryListParams() {
        BookkeepingEntryListParams.builder().cursor("cursor").limit(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = BookkeepingEntryListParams.builder().cursor("cursor").limit(123L).build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("limit", "123")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BookkeepingEntryListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
