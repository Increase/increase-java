// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.supplementaldocuments.SupplementalDocumentCreateParams
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SupplementalDocumentServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val supplementalDocumentService = client.supplementalDocuments()

        val entitySupplementalDocument =
            supplementalDocumentService.create(
                SupplementalDocumentCreateParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .fileId("file_makxrc67oh9l6sg7w9yc")
                    .build()
            )

        entitySupplementalDocument.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val supplementalDocumentService = client.supplementalDocuments()

        val page =
            supplementalDocumentService.list(
                SupplementalDocumentListParams.builder().entityId("entity_id").build()
            )

        page.response().validate()
    }
}
