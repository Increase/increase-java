// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.SimulationWireTransferReverseParams
import com.increase.api.models.SimulationWireTransferSubmitParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WireTransferServiceAsyncTest {

    @Test
    fun reverse() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferServiceAsync = client.simulations().wireTransfers()

        val wireTransferFuture =
            wireTransferServiceAsync.reverse(
                SimulationWireTransferReverseParams.builder()
                    .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                    .build()
            )

        val wireTransfer = wireTransferFuture.get()
        wireTransfer.validate()
    }

    @Test
    fun submit() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferServiceAsync = client.simulations().wireTransfers()

        val wireTransferFuture =
            wireTransferServiceAsync.submit(
                SimulationWireTransferSubmitParams.builder()
                    .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                    .build()
            )

        val wireTransfer = wireTransferFuture.get()
        wireTransfer.validate()
    }
}
