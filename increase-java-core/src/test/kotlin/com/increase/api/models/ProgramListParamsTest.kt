// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProgramListParamsTest {

    @Test
    fun createProgramListParams() {
        ProgramListParams.builder().cursor("cursor").limit(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = ProgramListParams.builder().cursor("cursor").limit(123L).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("cursor"))
        expected.put("limit", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ProgramListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
