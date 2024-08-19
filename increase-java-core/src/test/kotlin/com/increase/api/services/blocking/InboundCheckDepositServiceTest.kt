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
                InboundCheckDepositRetrieveParams.builder()
                    .inboundCheckDepositId("inbound_check_deposit_id")
                    .build()
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

    @Test
    fun callDecline() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositService = client.inboundCheckDeposits()
        val inboundCheckDeposit =
            inboundCheckDepositService.decline(
                InboundCheckDepositDeclineParams.builder()
                    .inboundCheckDepositId("inbound_check_deposit_id")
                    .build()
            )
        println(inboundCheckDeposit)
        inboundCheckDeposit.validate()
    }

    @Test
    fun callReturn() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositService = client.inboundCheckDeposits()
        val inboundCheckDeposit =
            inboundCheckDepositService.return_(
                InboundCheckDepositReturnParams.builder()
                    .inboundCheckDepositId("inbound_check_deposit_id")
                    .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
                    .build()
            )
        println(inboundCheckDeposit)
        inboundCheckDeposit.validate()
    }
}
