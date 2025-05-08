// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WireTransferServiceTest {

    @Test
    fun reverse() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.simulations().wireTransfers()

        val wireTransfer = wireTransferService.reverse("wire_transfer_5akynk7dqsq25qwk9q2u")

        wireTransfer.validate()
    }

    @Test
    fun submit() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.simulations().wireTransfers()

        val wireTransfer = wireTransferService.submit("wire_transfer_5akynk7dqsq25qwk9q2u")

        wireTransfer.validate()
    }
}
