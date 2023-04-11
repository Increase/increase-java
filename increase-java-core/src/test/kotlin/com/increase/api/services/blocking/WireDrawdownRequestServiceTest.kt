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
import com.increase.api.services.blocking.WireDrawdownRequestService
import com.increase.api.models.WireDrawdownRequestListPage
import com.increase.api.models.WireDrawdownRequestListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class WireDrawdownRequestServiceTest {

    @Disabled("Prism tests are broken")
    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val wireDrawdownRequestService = client.wireDrawdownRequests()
      val wireDrawdownRequest = wireDrawdownRequestService.create(WireDrawdownRequestCreateParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .messageToRecipient("x")
          .recipientAccountNumber("x")
          .recipientRoutingNumber("x")
          .recipientName("x")
          .recipientAddressLine1("x")
          .recipientAddressLine2("x")
          .recipientAddressLine3("x")
          .build())
      println(wireDrawdownRequest)
      wireDrawdownRequest.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val wireDrawdownRequestService = client.wireDrawdownRequests()
      val wireDrawdownRequest = wireDrawdownRequestService.retrieve(WireDrawdownRequestRetrieveParams.builder()
          .wireDrawdownRequestId("string")
          .build())
      println(wireDrawdownRequest)
      wireDrawdownRequest.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val wireDrawdownRequestService = client.wireDrawdownRequests()
      val wireDrawdownRequestList = wireDrawdownRequestService.list(WireDrawdownRequestListParams.builder().build())
      println(wireDrawdownRequestList)
      wireDrawdownRequestList.data().forEach {
          it.validate()
      }
    }
}
