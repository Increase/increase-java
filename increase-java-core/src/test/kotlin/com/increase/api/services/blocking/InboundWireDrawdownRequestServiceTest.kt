// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.InboundWireDrawdownRequestRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundWireDrawdownRequestServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireDrawdownRequestService = client.inboundWireDrawdownRequests()
        val inboundWireDrawdownRequest =
            inboundWireDrawdownRequestService.retrieve(
                InboundWireDrawdownRequestRetrieveParams.builder()
                    .inboundWireDrawdownRequestId(
                        "inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e"
                    )
                    .build()
            )
        println(inboundWireDrawdownRequest)
        inboundWireDrawdownRequest.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireDrawdownRequestService = client.inboundWireDrawdownRequests()
        val inboundWireDrawdownRequestList = inboundWireDrawdownRequestService.list()
        println(inboundWireDrawdownRequestList)
        inboundWireDrawdownRequestList.data().forEach { it.validate() }
    }
}
