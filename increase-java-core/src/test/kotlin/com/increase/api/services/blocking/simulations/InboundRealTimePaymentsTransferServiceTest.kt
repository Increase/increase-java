// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundRealTimePaymentsTransferServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferService =
            client.simulations().inboundRealTimePaymentsTransfers()

        val inboundRealTimePaymentsTransfer =
            inboundRealTimePaymentsTransferService.create(
                InboundRealTimePaymentsTransferCreateParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(1000L)
                    .debtorAccountNumber("x")
                    .debtorName("x")
                    .debtorRoutingNumber("xxxxxxxxx")
                    .remittanceInformation("x")
                    .requestForPaymentId(
                        "real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7"
                    )
                    .build()
            )

        inboundRealTimePaymentsTransfer.validate()
    }
}
