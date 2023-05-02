package com.increase.api.services.blocking.entities

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SupplementalDocumentServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val supplementalDocumentService = client.entities().supplementalDocuments()
        val entity =
            supplementalDocumentService.create(
                EntitySupplementalDocumentCreateParams.builder()
                    .entityId("string")
                    .fileId("string")
                    .build()
            )
        println(entity)
        entity.validate()
    }
}
