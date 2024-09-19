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
import com.increase.api.services.blocking.FileService
import com.increase.api.models.FileListPage
import com.increase.api.models.FileListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class FileServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val fileService = client.files()
      val file = fileService.create(FileCreateParams.builder()
          .file("some content".toByteArray())
          .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
          .description("x")
          .build())
      println(file)
      file.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val fileService = client.files()
      val file = fileService.retrieve(FileRetrieveParams.builder()
          .fileId("file_id")
          .build())
      println(file)
      file.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val fileService = client.files()
      val fileList = fileService.list(FileListParams.builder().build())
      println(fileList)
      fileList.data().forEach {
          it.validate()
      }
    }
}
