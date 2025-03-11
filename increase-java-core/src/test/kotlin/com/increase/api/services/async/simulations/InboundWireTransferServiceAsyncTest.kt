// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.inboundwiretransfers.InboundWireTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundWireTransferServiceAsyncTest {

    @Test
    fun create() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundWireTransferServiceAsync = client.simulations().inboundWireTransfers()

      val inboundWireTransferFuture = inboundWireTransferServiceAsync.create(InboundWireTransferCreateParams.builder()
          .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
          .amount(1000L)
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

      val inboundWireTransfer = inboundWireTransferFuture.get()
      inboundWireTransfer.validate()
    }
}
