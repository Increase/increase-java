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
import com.increase.api.services.blocking.InboundWireDrawdownRequestService
import com.increase.api.models.InboundWireDrawdownRequestListPage
import com.increase.api.models.InboundWireDrawdownRequestListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class InboundWireDrawdownRequestServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val inboundWireDrawdownRequestService = client.inboundWireDrawdownRequests()
      val inboundWireDrawdownRequest = inboundWireDrawdownRequestService.retrieve(InboundWireDrawdownRequestRetrieveParams.builder()
          .inboundWireDrawdownRequestId("string")
          .build())
      println(inboundWireDrawdownRequest)
      inboundWireDrawdownRequest.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val inboundWireDrawdownRequestService = client.inboundWireDrawdownRequests()
      val inboundWireDrawdownRequestList = inboundWireDrawdownRequestService.list(InboundWireDrawdownRequestListParams.builder().build())
      println(inboundWireDrawdownRequestList)
      inboundWireDrawdownRequestList.data().forEach {
          it.validate()
      }
    }
}
