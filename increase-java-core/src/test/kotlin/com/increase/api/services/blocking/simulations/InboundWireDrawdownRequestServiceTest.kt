package com.increase.api.services.blocking.simulations

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
import com.increase.api.services.blocking.simulations.InboundWireDrawdownRequestService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class InboundWireDrawdownRequestServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val inboundWireDrawdownRequestService = client.simulations().inboundWireDrawdownRequests()
      val inboundWireDrawdownRequest = inboundWireDrawdownRequestService.create(SimulationsInboundWireDrawdownRequestCreateParams.builder()
          .recipientAccountNumberId("string")
          .originatorAccountNumber("x")
          .originatorRoutingNumber("x")
          .beneficiaryAccountNumber("x")
          .beneficiaryRoutingNumber("x")
          .amount(123L)
          .currency("x")
          .messageToRecipient("x")
          .originatorToBeneficiaryInformationLine1("x")
          .originatorToBeneficiaryInformationLine2("x")
          .originatorToBeneficiaryInformationLine3("x")
          .originatorToBeneficiaryInformationLine4("x")
          .originatorName("x")
          .originatorAddressLine1("x")
          .originatorAddressLine2("x")
          .originatorAddressLine3("x")
          .beneficiaryName("x")
          .beneficiaryAddressLine1("x")
          .beneficiaryAddressLine2("x")
          .beneficiaryAddressLine3("x")
          .build())
      println(inboundWireDrawdownRequest)
      inboundWireDrawdownRequest.validate()
    }
}
