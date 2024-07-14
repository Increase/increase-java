// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RealTimePaymentsTransferServiceTest {

    @Test
    fun callComplete() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferService = client.simulations().realTimePaymentsTransfers()
        val realTimePaymentsTransfer =
            realTimePaymentsTransferService.complete(
                SimulationRealTimePaymentsTransferCompleteParams.builder()
                    .realTimePaymentsTransferId("real_time_payments_transfer_id")
                    .rejection(
                        SimulationRealTimePaymentsTransferCompleteParams.Rejection.builder()
                            .rejectReasonCode(
                                SimulationRealTimePaymentsTransferCompleteParams.Rejection
                                    .RejectReasonCode
                                    .ACCOUNT_CLOSED
                            )
                            .build()
                    )
                    .build()
            )
        println(realTimePaymentsTransfer)
        realTimePaymentsTransfer.validate()
    }

    @Test
    fun callCreateInbound() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferService = client.simulations().realTimePaymentsTransfers()
        val inboundRealTimePaymentsTransferSimulationResult =
            realTimePaymentsTransferService.createInbound(
                SimulationRealTimePaymentsTransferCreateInboundParams.builder()
                    .accountNumberId("account_number_id")
                    .amount(123L)
                    .debtorAccountNumber("x")
                    .debtorName("x")
                    .debtorRoutingNumber("xxxxxxxxx")
                    .remittanceInformation("x")
                    .requestForPaymentId("request_for_payment_id")
                    .build()
            )
        println(inboundRealTimePaymentsTransferSimulationResult)
        inboundRealTimePaymentsTransferSimulationResult.validate()
    }
}
