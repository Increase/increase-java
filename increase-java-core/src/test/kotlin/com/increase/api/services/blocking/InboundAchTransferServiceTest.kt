package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.InboundAchTransferListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundAchTransferServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransfer =
            inboundAchTransferService.retrieve(
                InboundAchTransferRetrieveParams.builder().inboundAchTransferId("string").build()
            )
        println(inboundAchTransfer)
        inboundAchTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransferList =
            inboundAchTransferService.list(InboundAchTransferListParams.builder().build())
        println(inboundAchTransferList)
        inboundAchTransferList.data().forEach { it.validate() }
    }
}
