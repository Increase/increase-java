package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentListParamsTest {

    @Test
    fun createDocumentListParams() {
        DocumentListParams.builder()
            .cursor("string")
            .limit(123L)
            .entityId("string")
            .category(
                DocumentListParams.Category.builder()
                    .in_(listOf(DocumentListParams.Category.In.ANTI_MONEY_LAUNDERING_POLICY))
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
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DocumentListParams.builder()
                .cursor("string")
                .limit(123L)
                .entityId("string")
                .category(
                    DocumentListParams.Category.builder()
                        .in_(listOf(DocumentListParams.Category.In.ANTI_MONEY_LAUNDERING_POLICY))
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
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("entity_id", listOf("string"))
        DocumentListParams.Category.builder()
            .in_(listOf(DocumentListParams.Category.In.ANTI_MONEY_LAUNDERING_POLICY))
            .build()
            .forEachQueryParam { key, values -> expected.put("category.$key", values) }
        DocumentListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DocumentListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
