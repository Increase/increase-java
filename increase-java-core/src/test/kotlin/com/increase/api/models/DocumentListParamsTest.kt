// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentListParamsTest {

    @Test
    fun create() {
        DocumentListParams.builder()
            .category(
                DocumentListParams.Category.builder()
                    .addIn(DocumentListParams.Category.In.FORM_1099_INT)
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
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DocumentListParams.builder()
                .category(
                    DocumentListParams.Category.builder()
                        .addIn(DocumentListParams.Category.In.FORM_1099_INT)
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
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        DocumentListParams.Category.builder()
            .addIn(DocumentListParams.Category.In.FORM_1099_INT)
            .build()
            .forEachQueryParam { key, values -> expected.put("category.$key", values) }
        DocumentListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("entity_id", "entity_id")
        expected.put("limit", "1")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DocumentListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
