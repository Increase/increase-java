// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.supplementaldocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitySupplementalDocumentTest {

    @Test
    fun create() {
        val entitySupplementalDocument =
            EntitySupplementalDocument.builder()
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .idempotencyKey(null)
                .type(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                .build()

        assertThat(entitySupplementalDocument.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(entitySupplementalDocument.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(entitySupplementalDocument.fileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(entitySupplementalDocument.idempotencyKey()).isEmpty
        assertThat(entitySupplementalDocument.type())
            .isEqualTo(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitySupplementalDocument =
            EntitySupplementalDocument.builder()
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .idempotencyKey(null)
                .type(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                .build()

        val roundtrippedEntitySupplementalDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitySupplementalDocument),
                jacksonTypeRef<EntitySupplementalDocument>(),
            )

        assertThat(roundtrippedEntitySupplementalDocument).isEqualTo(entitySupplementalDocument)
    }
}
