// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

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
import com.increase.api.services.blocking.simulations.InboundRealTimePaymentsTransferService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class InboundRealTimePaymentsTransferServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundRealTimePaymentsTransferService = client.simulations().inboundRealTimePaymentsTransfers()
      val inboundRealTimePaymentsTransfer = inboundRealTimePaymentsTransferService.create(SimulationInboundRealTimePaymentsTransferCreateParams.builder()
          .accountNumberId("account_number_id")
          .amount(123L)
          .debtorAccountNumber("x")
          .debtorName("x")
          .debtorRoutingNumber("xxxxxxxxx")
          .remittanceInformation("x")
          .requestForPaymentId("request_for_payment_id")
          .build())
      println(inboundRealTimePaymentsTransfer)
      inboundRealTimePaymentsTransfer.validate()
    }
}
