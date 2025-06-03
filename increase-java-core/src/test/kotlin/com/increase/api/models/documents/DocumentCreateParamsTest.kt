// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentCreateParamsTest {

    @Test
    fun create() {
        DocumentCreateParams.builder()
            .category(DocumentCreateParams.Category.ACCOUNT_VERIFICATION_LETTER)
            .accountVerificationLetter(
                DocumentCreateParams.AccountVerificationLetter.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .balanceDate(LocalDate.parse("2024-12-31"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DocumentCreateParams.builder()
                .category(DocumentCreateParams.Category.ACCOUNT_VERIFICATION_LETTER)
                .accountVerificationLetter(
                    DocumentCreateParams.AccountVerificationLetter.builder()
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .balanceDate(LocalDate.parse("2024-12-31"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.category())
            .isEqualTo(DocumentCreateParams.Category.ACCOUNT_VERIFICATION_LETTER)
        assertThat(body.accountVerificationLetter())
            .contains(
                DocumentCreateParams.AccountVerificationLetter.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .balanceDate(LocalDate.parse("2024-12-31"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentCreateParams.builder()
                .category(DocumentCreateParams.Category.ACCOUNT_VERIFICATION_LETTER)
                .build()

        val body = params._body()

        assertThat(body.category())
            .isEqualTo(DocumentCreateParams.Category.ACCOUNT_VERIFICATION_LETTER)
    }
}
