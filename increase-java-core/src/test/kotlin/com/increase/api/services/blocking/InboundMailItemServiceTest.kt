// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.inboundmailitems.InboundMailItemRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundMailItemServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemService = client.inboundMailItems()

        val inboundMailItem =
            inboundMailItemService.retrieve(
                InboundMailItemRetrieveParams.builder()
                    .inboundMailItemId("inbound_mail_item_q6rrg7mmqpplx80zceev")
                    .build()
            )

        inboundMailItem.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemService = client.inboundMailItems()

        val page = inboundMailItemService.list()

        page.response().validate()
    }
}
