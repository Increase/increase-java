// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiExclusionListParamsTest {

    @Test
    fun createIntrafiExclusionListParams() {
        IntrafiExclusionListParams.builder().cursor("string").entityId("string").limit(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params =
            IntrafiExclusionListParams.builder()
                .cursor("string")
                .entityId("string")
                .limit(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("entity_id", listOf("string"))
        expected.put("limit", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = IntrafiExclusionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
