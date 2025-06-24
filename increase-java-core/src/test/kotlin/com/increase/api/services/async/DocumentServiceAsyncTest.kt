// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.documents.DocumentCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val documentFuture =
            documentServiceAsync.create(
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

        val document = documentFuture.get()
        document.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val documentFuture = documentServiceAsync.retrieve("document_qjtqc6s4c14ve2q89izm")

        val document = documentFuture.get()
        document.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.documents()

        val pageFuture = documentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
