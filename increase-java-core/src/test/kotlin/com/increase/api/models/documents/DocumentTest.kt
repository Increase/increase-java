// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentTest {

    @Test
    fun create() {
        val document =
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

        assertThat(document.id()).isEqualTo("document_qjtqc6s4c14ve2q89izm")
        assertThat(document.accountVerificationLetter())
            .contains(
                Document.AccountVerificationLetter.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .build()
            )
        assertThat(document.category()).isEqualTo(Document.Category.ACCOUNT_VERIFICATION_LETTER)
        assertThat(document.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(document.entityId()).contains("entity_n8y8tnk2p9339ti393yi")
        assertThat(document.fileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(document.fundingInstructions())
            .contains(
                Document.FundingInstructions.builder().accountNumberId("account_number_id").build()
            )
        assertThat(document.idempotencyKey()).isEmpty
        assertThat(document.type()).isEqualTo(Document.Type.DOCUMENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val document =
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

        val roundtrippedDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(document),
                jacksonTypeRef<Document>(),
            )

        assertThat(roundtrippedDocument).isEqualTo(document)
    }
}
