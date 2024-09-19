// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundRealTimePaymentsTransferServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferService =
            client.simulations().inboundRealTimePaymentsTransfers()
        val inboundRealTimePaymentsTransfer =
            inboundRealTimePaymentsTransferService.create(
                SimulationInboundRealTimePaymentsTransferCreateParams.builder()
                    .accountNumberId("account_number_id")
                    .amount(123L)
                    .debtorAccountNumber("x")
                    .debtorName("x")
                    .debtorRoutingNumber("xxxxxxxxx")
                    .remittanceInformation("x")
                    .requestForPaymentId("request_for_payment_id")
                    .build()
            )
        println(inboundRealTimePaymentsTransfer)
        inboundRealTimePaymentsTransfer.validate()
    }
}
