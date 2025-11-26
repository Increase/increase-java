// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.documents.DocumentCreateParams
import com.increase.api.models.documents.DocumentListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.documents()

        val document =
            documentService.create(
                DocumentCreateParams.builder()
                    .category(DocumentCreateParams.Category.ACCOUNT_VERIFICATION_LETTER)
                    .accountVerificationLetter(
                        DocumentCreateParams.AccountVerificationLetter.builder()
                            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                            .balanceDate(LocalDate.parse("2024-12-31"))
                            .build()
                    )
                    .fundingInstructions(
                        DocumentCreateParams.FundingInstructions.builder()
                            .accountNumberId("account_number_id")
                            .build()
                    )
                    .build()
            )

        document.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.documents()

        val document = documentService.retrieve("document_qjtqc6s4c14ve2q89izm")

        document.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentService = client.documents()

        val documents =
            documentService.list(
                DocumentListParams.builder()
                    .category(
                        DocumentListParams.Category.builder()
                            .addIn(DocumentListParams.Category.In.FORM_1099_INT)
                            .build()
                    )
                    .createdAt(
                        DocumentListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .entityId("entity_id")
                    .idempotencyKey("x")
                    .limit(1L)
                    .build()
            )

        documents.validate()
    }
}
