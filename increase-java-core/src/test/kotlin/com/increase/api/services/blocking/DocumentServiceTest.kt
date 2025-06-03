// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.documents.DocumentCreateParams
import java.time.LocalDate
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

        val page = documentService.list()

        page.response().validate()
    }
}
