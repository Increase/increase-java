// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.InboundCheckDepositListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundCheckDepositServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositService = client.inboundCheckDeposits()
        val inboundCheckDeposit =
            inboundCheckDepositService.retrieve(
                InboundCheckDepositRetrieveParams.builder().inboundCheckDepositId("string").build()
            )
        println(inboundCheckDeposit)
        inboundCheckDeposit.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositService = client.inboundCheckDeposits()
        val inboundCheckDepositList =
            inboundCheckDepositService.list(InboundCheckDepositListParams.builder().build())
        println(inboundCheckDepositList)
        inboundCheckDepositList.data().forEach { it.validate() }
    }
}
