// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListResponseTest {

    @Test
    fun create() {
        val documentListResponse =
            DocumentListResponse.builder()
                .addData(
                    Document.builder()
                        .id("document_qjtqc6s4c14ve2q89izm")
                        .accountVerificationLetter(
                            Document.AccountVerificationLetter.builder()
                                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                                .build()
                        )
                        .category(Document.Category.ACCOUNT_VERIFICATION_LETTER)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .fundingInstructions(
                            Document.FundingInstructions.builder()
                                .accountNumberId("account_number_id")
                                .build()
                        )
                        .idempotencyKey(null)
                        .type(Document.Type.DOCUMENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(documentListResponse.data())
            .containsExactly(
                Document.builder()
                    .id("document_qjtqc6s4c14ve2q89izm")
                    .accountVerificationLetter(
                        Document.AccountVerificationLetter.builder()
                            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                            .build()
                    )
                    .category(Document.Category.ACCOUNT_VERIFICATION_LETTER)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .fileId("file_makxrc67oh9l6sg7w9yc")
                    .fundingInstructions(
                        Document.FundingInstructions.builder()
                            .accountNumberId("account_number_id")
                            .build()
                    )
                    .idempotencyKey(null)
                    .type(Document.Type.DOCUMENT)
                    .build()
            )
        assertThat(documentListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentListResponse =
            DocumentListResponse.builder()
                .addData(
                    Document.builder()
                        .id("document_qjtqc6s4c14ve2q89izm")
                        .accountVerificationLetter(
                            Document.AccountVerificationLetter.builder()
                                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                                .build()
                        )
                        .category(Document.Category.ACCOUNT_VERIFICATION_LETTER)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .fundingInstructions(
                            Document.FundingInstructions.builder()
                                .accountNumberId("account_number_id")
                                .build()
                        )
                        .idempotencyKey(null)
                        .type(Document.Type.DOCUMENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedDocumentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListResponse),
                jacksonTypeRef<DocumentListResponse>(),
            )

        assertThat(roundtrippedDocumentListResponse).isEqualTo(documentListResponse)
    }
}
