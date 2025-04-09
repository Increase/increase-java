// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListPageResponseTest {

    @Test
    fun create() {
        val documentListPageResponse =
            DocumentListPageResponse.builder()
                .addData(
                    Document.builder()
                        .id("document_qjtqc6s4c14ve2q89izm")
                        .category(Document.Category.FORM_1099_INT)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .type(Document.Type.DOCUMENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(documentListPageResponse.data())
            .containsExactly(
                Document.builder()
                    .id("document_qjtqc6s4c14ve2q89izm")
                    .category(Document.Category.FORM_1099_INT)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .fileId("file_makxrc67oh9l6sg7w9yc")
                    .type(Document.Type.DOCUMENT)
                    .build()
            )
        assertThat(documentListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentListPageResponse =
            DocumentListPageResponse.builder()
                .addData(
                    Document.builder()
                        .id("document_qjtqc6s4c14ve2q89izm")
                        .category(Document.Category.FORM_1099_INT)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .type(Document.Type.DOCUMENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedDocumentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListPageResponse),
                jacksonTypeRef<DocumentListPageResponse>(),
            )

        assertThat(roundtrippedDocumentListPageResponse).isEqualTo(documentListPageResponse)
    }
}
