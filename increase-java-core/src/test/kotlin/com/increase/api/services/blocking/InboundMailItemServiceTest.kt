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
import com.increase.api.services.blocking.InboundMailItemService
import com.increase.api.models.InboundMailItemListPage
import com.increase.api.models.InboundMailItemListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class InboundMailItemServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundMailItemService = client.inboundMailItems()
      val inboundMailItem = inboundMailItemService.retrieve(InboundMailItemRetrieveParams.builder()
          .inboundMailItemId("inbound_mail_item_id")
          .build())
      println(inboundMailItem)
      inboundMailItem.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundMailItemService = client.inboundMailItems()
      val inboundMailItemList = inboundMailItemService.list(InboundMailItemListParams.builder().build())
      println(inboundMailItemList)
      inboundMailItemList.data().forEach {
          it.validate()
      }
    }
}
