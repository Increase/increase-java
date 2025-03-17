// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundRealTimePaymentsTransferServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferServiceAsync = client.inboundRealTimePaymentsTransfers()

        val inboundRealTimePaymentsTransferFuture =
            inboundRealTimePaymentsTransferServiceAsync.retrieve(
                InboundRealTimePaymentsTransferRetrieveParams.builder()
                    .inboundRealTimePaymentsTransferId(
                        "inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr"
                    )
                    .build()
            )

        val inboundRealTimePaymentsTransfer = inboundRealTimePaymentsTransferFuture.get()
        inboundRealTimePaymentsTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferServiceAsync = client.inboundRealTimePaymentsTransfers()

        val pageFuture = inboundRealTimePaymentsTransferServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
