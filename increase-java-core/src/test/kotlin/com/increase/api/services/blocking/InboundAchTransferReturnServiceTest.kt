package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.InboundAchTransferReturnListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundAchTransferReturnServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val inboundAchTransferReturnService = client.inboundAchTransferReturns()
        val inboundAchTransferReturn =
            inboundAchTransferReturnService.retrieve(
                InboundAchTransferReturnRetrieveParams.builder()
                    .inboundAchTransferReturnId("string")
                    .build()
            )
        println(inboundAchTransferReturn)
        inboundAchTransferReturn.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val inboundAchTransferReturnService = client.inboundAchTransferReturns()
        val inboundAchTransferReturnList =
            inboundAchTransferReturnService.list(
                InboundAchTransferReturnListParams.builder().build()
            )
        println(inboundAchTransferReturnList)
        inboundAchTransferReturnList.data().forEach { it.validate() }
    }
}
