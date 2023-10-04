// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingNumberListParamsTest {

    @Test
    fun createRoutingNumberListParams() {
        RoutingNumberListParams.builder()
            .cursor("string")
            .limit(123L)
            .routingNumber("xxxxxxxxx")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            RoutingNumberListParams.builder()
                .cursor("string")
                .limit(123L)
                .routingNumber("xxxxxxxxx")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("routing_number", listOf("xxxxxxxxx"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = RoutingNumberListParams.builder().routingNumber("xxxxxxxxx").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("routing_number", listOf("xxxxxxxxx"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
