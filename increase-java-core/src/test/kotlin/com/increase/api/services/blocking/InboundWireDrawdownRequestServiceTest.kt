// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundWireDrawdownRequestServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireDrawdownRequestService = client.inboundWireDrawdownRequests()

        val inboundWireDrawdownRequest =
            inboundWireDrawdownRequestService.retrieve(
                "inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e"
            )

        inboundWireDrawdownRequest.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireDrawdownRequestService = client.inboundWireDrawdownRequests()

        val inboundWireDrawdownRequests =
            inboundWireDrawdownRequestService.list(
                InboundWireDrawdownRequestListParams.builder().cursor("cursor").limit(1L).build()
            )

        inboundWireDrawdownRequests.validate()
    }
}
