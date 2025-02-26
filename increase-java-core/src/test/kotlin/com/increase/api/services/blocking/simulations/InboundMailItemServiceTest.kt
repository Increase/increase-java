// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.SimulationInboundMailItemCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundMailItemServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemService = client.simulations().inboundMailItems()

        val inboundMailItem =
            inboundMailItemService.create(
                SimulationInboundMailItemCreateParams.builder()
                    .amount(1000L)
                    .lockboxId("lockbox_3xt21ok13q19advds4t5")
                    .contentsFileId("contents_file_id")
                    .build()
            )

        inboundMailItem.validate()
    }
}
