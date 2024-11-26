// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingNumberListParamsTest {

    @Test
    fun createRoutingNumberListParams() {
        RoutingNumberListParams.builder()
            .routingNumber("xxxxxxxxx")
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            RoutingNumberListParams.builder()
                .routingNumber("xxxxxxxxx")
                .cursor("cursor")
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("routing_number", "xxxxxxxxx")
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = RoutingNumberListParams.builder().routingNumber("xxxxxxxxx").build()
        val expected = QueryParams.builder()
        expected.put("routing_number", "xxxxxxxxx")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
