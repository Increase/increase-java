// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireDrawdownRequestListParamsTest {

    @Test
    fun create() {
        InboundWireDrawdownRequestListParams.builder().cursor("cursor").limit(1L).build()
    }

    @Test
    fun queryParams() {
        val params =
            InboundWireDrawdownRequestListParams.builder().cursor("cursor").limit(1L).build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InboundWireDrawdownRequestListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
