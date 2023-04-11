package com.increase.api.services.blocking.entities

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.services.blocking.entities.SupplementalDocumentService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class SupplementalDocumentServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val supplementalDocumentService = client.entities().supplementalDocuments()
      val entity = supplementalDocumentService.create(EntitiesSupplementalDocumentCreateParams.builder()
          .entityId("string")
          .fileId("string")
          .build())
      println(entity)
      entity.validate()
    }
}
