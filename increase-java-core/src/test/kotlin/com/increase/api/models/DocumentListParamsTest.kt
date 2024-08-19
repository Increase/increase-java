// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentListParamsTest {

    @Test
    fun createDocumentListParams() {
        DocumentListParams.builder()
            .category(
                DocumentListParams.Category.builder()
                    .in_(listOf(DocumentListParams.Category.In.FORM_1099_INT))
                    .build()
            )
            .createdAt(
                DocumentListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .entityId("entity_id")
            .limit(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DocumentListParams.builder()
                .category(
                    DocumentListParams.Category.builder()
                        .in_(listOf(DocumentListParams.Category.In.FORM_1099_INT))
                        .build()
                )
                .createdAt(
                    DocumentListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .entityId("entity_id")
                .limit(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        DocumentListParams.Category.builder()
            .in_(listOf(DocumentListParams.Category.In.FORM_1099_INT))
            .build()
            .forEachQueryParam { key, values -> expected.put("category.$key", values) }
        DocumentListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", listOf("cursor"))
        expected.put("entity_id", listOf("entity_id"))
        expected.put("limit", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DocumentListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
