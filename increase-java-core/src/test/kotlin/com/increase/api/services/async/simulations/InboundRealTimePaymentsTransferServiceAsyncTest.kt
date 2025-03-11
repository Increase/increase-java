// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundRealTimePaymentsTransferServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferServiceAsync =
            client.simulations().inboundRealTimePaymentsTransfers()

        val inboundRealTimePaymentsTransferFuture =
            inboundRealTimePaymentsTransferServiceAsync.create(
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

        val inboundRealTimePaymentsTransfer = inboundRealTimePaymentsTransferFuture.get()
        inboundRealTimePaymentsTransfer.validate()
    }
}
