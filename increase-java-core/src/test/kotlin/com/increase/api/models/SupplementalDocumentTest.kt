// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SupplementalDocumentTest {

    @Test
    fun createSupplementalDocument() {
        val supplementalDocument =
            SupplementalDocument.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileId("file_id")
                .idempotencyKey("idempotency_key")
                .type(SupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                .build()
        assertThat(supplementalDocument).isNotNull
        assertThat(supplementalDocument.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(supplementalDocument.fileId()).isEqualTo("file_id")
        assertThat(supplementalDocument.idempotencyKey()).contains("idempotency_key")
        assertThat(supplementalDocument.type())
            .isEqualTo(SupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
    }
}
