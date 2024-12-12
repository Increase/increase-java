// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.InboundRealTimePaymentsTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundRealTimePaymentsTransferServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferService = client.inboundRealTimePaymentsTransfers()
        val inboundRealTimePaymentsTransfer =
            inboundRealTimePaymentsTransferService.retrieve(
                InboundRealTimePaymentsTransferRetrieveParams.builder()
                    .inboundRealTimePaymentsTransferId("inbound_real_time_payments_transfer_id")
                    .build()
            )
        println(inboundRealTimePaymentsTransfer)
        inboundRealTimePaymentsTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferService = client.inboundRealTimePaymentsTransfers()
        val inboundRealTimePaymentsTransferList =
            inboundRealTimePaymentsTransferService.list(
                InboundRealTimePaymentsTransferListParams.builder().build()
            )
        println(inboundRealTimePaymentsTransferList)
        inboundRealTimePaymentsTransferList.data().forEach { it.validate() }
    }
}
