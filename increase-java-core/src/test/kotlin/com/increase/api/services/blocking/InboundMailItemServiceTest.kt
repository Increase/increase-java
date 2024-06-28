// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.InboundMailItemListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundMailItemServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemService = client.inboundMailItems()
        val inboundMailItem =
            inboundMailItemService.retrieve(
                InboundMailItemRetrieveParams.builder().inboundMailItemId("string").build()
            )
        println(inboundMailItem)
        inboundMailItem.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemService = client.inboundMailItems()
        val inboundMailItemList =
            inboundMailItemService.list(InboundMailItemListParams.builder().build())
        println(inboundMailItemList)
        inboundMailItemList.data().forEach { it.validate() }
    }
}
