package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntitySupplementalDocumentListParamsTest {

    @Test
    fun createEntitySupplementalDocumentListParams() {
        EntitySupplementalDocumentListParams.builder()
            .cursor("string")
            .limit(123L)
            .entityId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EntitySupplementalDocumentListParams.builder()
                .cursor("string")
                .limit(123L)
                .entityId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("entity_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EntitySupplementalDocumentListParams.builder().entityId("string").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("entity_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
