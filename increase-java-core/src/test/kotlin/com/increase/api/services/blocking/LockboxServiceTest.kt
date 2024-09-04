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
import com.increase.api.services.blocking.LockboxService
import com.increase.api.models.LockboxListPage
import com.increase.api.models.LockboxListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class LockboxServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val lockboxService = client.lockboxes()
      val lockbox = lockboxService.create(LockboxCreateParams.builder()
          .accountId("account_id")
          .description("x")
          .recipientName("x")
          .build())
      println(lockbox)
      lockbox.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val lockboxService = client.lockboxes()
      val lockbox = lockboxService.retrieve(LockboxRetrieveParams.builder()
          .lockboxId("lockbox_id")
          .build())
      println(lockbox)
      lockbox.validate()
    }

    @Test
    fun callUpdate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val lockboxService = client.lockboxes()
      val lockbox = lockboxService.update(LockboxUpdateParams.builder()
          .lockboxId("lockbox_id")
          .description("x")
          .recipientName("x")
          .status(LockboxUpdateParams.Status.ACTIVE)
          .build())
      println(lockbox)
      lockbox.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val lockboxService = client.lockboxes()
      val lockboxList = lockboxService.list(LockboxListParams.builder().build())
      println(lockboxList)
      lockboxList.data().forEach {
          it.validate()
      }
    }
}
