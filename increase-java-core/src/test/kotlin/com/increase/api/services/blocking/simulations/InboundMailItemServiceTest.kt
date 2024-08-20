// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundMailItemServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemService = client.simulations().inboundMailItems()
        val inboundMailItem =
            inboundMailItemService.create(
                SimulationInboundMailItemCreateParams.builder()
                    .amount(123L)
                    .lockboxId("lockbox_id")
                    .build()
            )
        println(inboundMailItem)
        inboundMailItem.validate()
    }
}
