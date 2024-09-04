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
import com.increase.api.services.blocking.simulations.InboundWireTransferService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class InboundWireTransferServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundWireTransferService = client.simulations().inboundWireTransfers()
      val inboundWireTransfer = inboundWireTransferService.create(SimulationInboundWireTransferCreateParams.builder()
          .accountNumberId("account_number_id")
          .amount(123L)
          .beneficiaryAddressLine1("x")
          .beneficiaryAddressLine2("x")
          .beneficiaryAddressLine3("x")
          .beneficiaryName("x")
          .beneficiaryReference("x")
          .originatorAddressLine1("x")
          .originatorAddressLine2("x")
          .originatorAddressLine3("x")
          .originatorName("x")
          .originatorRoutingNumber("x")
          .originatorToBeneficiaryInformationLine1("x")
          .originatorToBeneficiaryInformationLine2("x")
          .originatorToBeneficiaryInformationLine3("x")
          .originatorToBeneficiaryInformationLine4("x")
          .senderReference("x")
          .build())
      println(inboundWireTransfer)
      inboundWireTransfer.validate()
    }
}
