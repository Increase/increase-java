// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.supplementaldocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SupplementalDocumentListPageResponseTest {

    @Test
    fun create() {
        val supplementalDocumentListPageResponse =
            SupplementalDocumentListPageResponse.builder()
                .addData(
                    EntitySupplementalDocument.builder()
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .idempotencyKey(null)
                        .type(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(supplementalDocumentListPageResponse.data())
            .containsExactly(
                EntitySupplementalDocument.builder()
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .fileId("file_makxrc67oh9l6sg7w9yc")
                    .idempotencyKey(null)
                    .type(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                    .build()
            )
        assertThat(supplementalDocumentListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val supplementalDocumentListPageResponse =
            SupplementalDocumentListPageResponse.builder()
                .addData(
                    EntitySupplementalDocument.builder()
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .idempotencyKey(null)
                        .type(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedSupplementalDocumentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(supplementalDocumentListPageResponse),
                jacksonTypeRef<SupplementalDocumentListPageResponse>(),
            )

        assertThat(roundtrippedSupplementalDocumentListPageResponse)
            .isEqualTo(supplementalDocumentListPageResponse)
    }
}
