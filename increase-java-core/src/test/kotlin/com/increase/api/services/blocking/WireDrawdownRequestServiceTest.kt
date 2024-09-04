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
import com.increase.api.services.blocking.WireDrawdownRequestService
import com.increase.api.models.WireDrawdownRequestListPage
import com.increase.api.models.WireDrawdownRequestListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class WireDrawdownRequestServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val wireDrawdownRequestService = client.wireDrawdownRequests()
      val wireDrawdownRequest = wireDrawdownRequestService.create(WireDrawdownRequestCreateParams.builder()
          .accountNumberId("account_number_id")
          .amount(123L)
          .messageToRecipient("x")
          .recipientAccountNumber("x")
          .recipientName("x")
          .recipientRoutingNumber("xxxxxxxxx")
          .originatorAddressLine1("x")
          .originatorAddressLine2("x")
          .originatorAddressLine3("x")
          .originatorName("x")
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
          .apiKey("My API Key")
          .build()
      val wireDrawdownRequestService = client.wireDrawdownRequests()
      val wireDrawdownRequest = wireDrawdownRequestService.retrieve(WireDrawdownRequestRetrieveParams.builder()
          .wireDrawdownRequestId("wire_drawdown_request_id")
          .build())
      println(wireDrawdownRequest)
      wireDrawdownRequest.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val wireDrawdownRequestService = client.wireDrawdownRequests()
      val wireDrawdownRequestList = wireDrawdownRequestService.list(WireDrawdownRequestListParams.builder().build())
      println(wireDrawdownRequestList)
      wireDrawdownRequestList.data().forEach {
          it.validate()
      }
    }
}
