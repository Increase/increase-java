package com.increase.api.services.blocking

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
import com.increase.api.services.blocking.FileService
import com.increase.api.models.FileListPage
import com.increase.api.models.FileListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class FileServiceTest {

    @Disabled("skipped: prism mock server is broken for file uploads")
    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val fileService = client.files()
      val file = fileService.create(FileCreateParams.builder()
          .file("file.txt")
          .description("x")
          .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
          .build())
      println(file)
      file.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val fileService = client.files()
      val file = fileService.retrieve(FileRetrieveParams.builder()
          .fileId("string")
          .build())
      println(file)
      file.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val fileService = client.files()
      val fileList = fileService.list(FileListParams.builder().build())
      println(fileList)
      fileList.data().forEach {
          it.validate()
      }
    }
}
