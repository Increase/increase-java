// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.SupplementalDocumentCreateParams
import com.increase.api.models.SupplementalDocumentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SupplementalDocumentServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val supplementalDocumentService = client.supplementalDocuments()
        val entitySupplementalDocument =
            supplementalDocumentService.create(
                SupplementalDocumentCreateParams.builder()
                    .entityId("entity_id")
                    .fileId("file_id")
                    .build()
            )
        println(entitySupplementalDocument)
        entitySupplementalDocument.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val supplementalDocumentService = client.supplementalDocuments()
        val entitySupplementalDocumentList =
            supplementalDocumentService.list(
                SupplementalDocumentListParams.builder().entityId("entity_id").build()
            )
        println(entitySupplementalDocumentList)
        entitySupplementalDocumentList.data().forEach { it.validate() }
    }
}
