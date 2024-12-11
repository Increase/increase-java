// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentTest {

    @Test
    fun createDocument() {
        val document =
            Document.builder()
                .id("document_qjtqc6s4c14ve2q89izm")
                .category(Document.Category.FORM_1099_INT)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .type(Document.Type.DOCUMENT)
                .build()
        assertThat(document).isNotNull
        assertThat(document.id()).isEqualTo("document_qjtqc6s4c14ve2q89izm")
        assertThat(document.category()).isEqualTo(Document.Category.FORM_1099_INT)
        assertThat(document.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(document.entityId()).contains("entity_n8y8tnk2p9339ti393yi")
        assertThat(document.fileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(document.type()).isEqualTo(Document.Type.DOCUMENT)
    }
}
