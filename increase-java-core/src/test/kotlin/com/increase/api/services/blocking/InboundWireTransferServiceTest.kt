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
import com.increase.api.services.blocking.InboundWireTransferService
import com.increase.api.models.InboundWireTransferListPage
import com.increase.api.models.InboundWireTransferListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class InboundWireTransferServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundWireTransferService = client.inboundWireTransfers()
      val inboundWireTransfer = inboundWireTransferService.retrieve(InboundWireTransferRetrieveParams.builder()
          .inboundWireTransferId("inbound_wire_transfer_id")
          .build())
      println(inboundWireTransfer)
      inboundWireTransfer.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundWireTransferService = client.inboundWireTransfers()
      val inboundWireTransferList = inboundWireTransferService.list(InboundWireTransferListParams.builder().build())
      println(inboundWireTransferList)
      inboundWireTransferList.data().forEach {
          it.validate()
      }
    }
}
