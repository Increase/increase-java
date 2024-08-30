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
import com.increase.api.services.blocking.IntrafiExclusionService
import com.increase.api.models.IntrafiExclusionListPage
import com.increase.api.models.IntrafiExclusionListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class IntrafiExclusionServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val intrafiExclusionService = client.intrafiExclusions()
      val intrafiExclusion = intrafiExclusionService.create(IntrafiExclusionCreateParams.builder()
          .bankName("x")
          .entityId("entity_id")
          .build())
      println(intrafiExclusion)
      intrafiExclusion.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val intrafiExclusionService = client.intrafiExclusions()
      val intrafiExclusion = intrafiExclusionService.retrieve(IntrafiExclusionRetrieveParams.builder()
          .intrafiExclusionId("intrafi_exclusion_id")
          .build())
      println(intrafiExclusion)
      intrafiExclusion.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val intrafiExclusionService = client.intrafiExclusions()
      val intrafiExclusionList = intrafiExclusionService.list(IntrafiExclusionListParams.builder().build())
      println(intrafiExclusionList)
      intrafiExclusionList.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callArchive() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val intrafiExclusionService = client.intrafiExclusions()
      val intrafiExclusion = intrafiExclusionService.archive(IntrafiExclusionArchiveParams.builder()
          .intrafiExclusionId("intrafi_exclusion_id")
          .build())
      println(intrafiExclusion)
      intrafiExclusion.validate()
    }
}
