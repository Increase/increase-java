package com.increase.api.services.blocking.simulations

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
import com.increase.api.services.blocking.simulations.DocumentService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class DocumentServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val documentService = client.simulations().documents()
      val document = documentService.create(SimulationsDocumentCreateParams.builder()
          .accountId("string")
          .build())
      println(document)
      document.validate()
    }
}
