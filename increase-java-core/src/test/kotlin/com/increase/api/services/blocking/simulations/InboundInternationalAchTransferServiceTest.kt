// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundInternationalAchTransferServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundInternationalAchTransferService =
            client.simulations().inboundInternationalAchTransfers()
        val inboundInternationalAchTransfer =
            inboundInternationalAchTransferService.create(
                SimulationInboundInternationalAchTransferCreateParams.builder()
                    .accountNumberId("string")
                    .amount(123L)
                    .foreignPaymentAmount(123L)
                    .originatingCurrencyCode("x")
                    .originatorCompanyEntryDescription("x")
                    .originatorName("x")
                    .receiverIdentificationNumber("x")
                    .receivingCompanyOrIndividualName("x")
                    .build()
            )
        println(inboundInternationalAchTransfer)
        inboundInternationalAchTransfer.validate()
    }
}
