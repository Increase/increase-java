// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.InboundRealTimePaymentsTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundRealTimePaymentsTransferServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferService = client.inboundRealTimePaymentsTransfers()

        val inboundRealTimePaymentsTransfer =
            inboundRealTimePaymentsTransferService.retrieve(
                InboundRealTimePaymentsTransferRetrieveParams.builder()
                    .inboundRealTimePaymentsTransferId(
                        "inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr"
                    )
                    .build()
            )

        inboundRealTimePaymentsTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferService = client.inboundRealTimePaymentsTransfers()

        val page = inboundRealTimePaymentsTransferService.list()

        page.response().validate()
    }
}
