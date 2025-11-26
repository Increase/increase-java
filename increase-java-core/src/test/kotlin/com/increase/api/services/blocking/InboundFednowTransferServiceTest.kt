// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundFednowTransferServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundFednowTransferService = client.inboundFednowTransfers()

        val inboundFednowTransfer =
            inboundFednowTransferService.retrieve("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")

        inboundFednowTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundFednowTransferService = client.inboundFednowTransfers()

        val page = inboundFednowTransferService.list()

        page.response().validate()
    }
}
