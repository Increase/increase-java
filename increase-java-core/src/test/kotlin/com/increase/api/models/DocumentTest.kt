package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentTest {

    @Test
    fun createDocument() {
        val document =
            Document.builder()
                .id("string")
                .category(Document.Category.ANTI_MONEY_LAUNDERING_POLICY)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entityId("string")
                .fileId("string")
                .type(Document.Type.DOCUMENT)
                .build()
        assertThat(document).isNotNull
        assertThat(document.id()).isEqualTo("string")
        assertThat(document.category()).isEqualTo(Document.Category.ANTI_MONEY_LAUNDERING_POLICY)
        assertThat(document.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(document.entityId()).contains("string")
        assertThat(document.fileId()).isEqualTo("string")
        assertThat(document.type()).isEqualTo(Document.Type.DOCUMENT)
    }
}
