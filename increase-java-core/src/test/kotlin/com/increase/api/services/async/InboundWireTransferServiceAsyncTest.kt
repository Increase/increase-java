// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundwiretransfers.InboundWireTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundWireTransferServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferServiceAsync = client.inboundWireTransfers()

        val inboundWireTransferFuture =
            inboundWireTransferServiceAsync.retrieve(
                InboundWireTransferRetrieveParams.builder()
                    .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                    .build()
            )

        val inboundWireTransfer = inboundWireTransferFuture.get()
        inboundWireTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferServiceAsync = client.inboundWireTransfers()

        val pageFuture = inboundWireTransferServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
