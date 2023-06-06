package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SupplementalDocumentTest {

    @Test
    fun createSupplementalDocument() {
        val supplementalDocument =
            SupplementalDocument.builder()
                .fileId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                .build()
        assertThat(supplementalDocument).isNotNull
        assertThat(supplementalDocument.fileId()).isEqualTo("string")
        assertThat(supplementalDocument.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(supplementalDocument.type())
            .isEqualTo(SupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
    }
}
