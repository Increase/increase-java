// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.http.BinaryResponseContent
import com.increase.api.services.blocking.SupplementalDocumentService
import com.increase.api.models.SupplementalDocumentListPage
import com.increase.api.models.SupplementalDocumentListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class SupplementalDocumentServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val supplementalDocumentService = client.supplementalDocuments()
      val entitySupplementalDocument = supplementalDocumentService.create(SupplementalDocumentCreateParams.builder()
          .entityId("entity_id")
          .fileId("file_id")
          .build())
      println(entitySupplementalDocument)
      entitySupplementalDocument.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val supplementalDocumentService = client.supplementalDocuments()
      val entitySupplementalDocumentList = supplementalDocumentService.list(SupplementalDocumentListParams.builder()
          .entityId("entity_id")
          .build())
      println(entitySupplementalDocumentList)
      entitySupplementalDocumentList.data().forEach {
          it.validate()
      }
    }
}
