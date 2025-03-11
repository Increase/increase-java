// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListParams
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundWireDrawdownRequestServiceAsyncTest {

    @Test
    fun retrieve() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundWireDrawdownRequestServiceAsync = client.inboundWireDrawdownRequests()

      val inboundWireDrawdownRequestFuture = inboundWireDrawdownRequestServiceAsync.retrieve(InboundWireDrawdownRequestRetrieveParams.builder()
          .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
          .build())

      val inboundWireDrawdownRequest = inboundWireDrawdownRequestFuture.get()
      inboundWireDrawdownRequest.validate()
    }

    @Test
    fun list() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundWireDrawdownRequestServiceAsync = client.inboundWireDrawdownRequests()

      val pageFuture = inboundWireDrawdownRequestServiceAsync.list()

      val page = pageFuture.get()
      page.response().validate()
    }
}
