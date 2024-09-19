// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntitySupplementalDocumentTest {

    @Test
    fun createEntitySupplementalDocument() {
        val entitySupplementalDocument =
            EntitySupplementalDocument.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entityId("entity_id")
                .fileId("file_id")
                .idempotencyKey("idempotency_key")
                .type(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                .build()
        assertThat(entitySupplementalDocument).isNotNull
        assertThat(entitySupplementalDocument.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitySupplementalDocument.entityId()).isEqualTo("entity_id")
        assertThat(entitySupplementalDocument.fileId()).isEqualTo("file_id")
        assertThat(entitySupplementalDocument.idempotencyKey()).contains("idempotency_key")
        assertThat(entitySupplementalDocument.type())
            .isEqualTo(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
    }
}
