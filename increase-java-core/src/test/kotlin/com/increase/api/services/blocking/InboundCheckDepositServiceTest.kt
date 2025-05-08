// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundCheckDepositServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositService = client.inboundCheckDeposits()

        val inboundCheckDeposit =
            inboundCheckDepositService.retrieve("inbound_check_deposit_zoshvqybq0cjjm31mra")

        inboundCheckDeposit.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositService = client.inboundCheckDeposits()

        val page = inboundCheckDepositService.list()

        page.response().validate()
    }

    @Test
    fun decline() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositService = client.inboundCheckDeposits()

        val inboundCheckDeposit =
            inboundCheckDepositService.decline("inbound_check_deposit_zoshvqybq0cjjm31mra")

        inboundCheckDeposit.validate()
    }

    @Test
    fun return_() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositService = client.inboundCheckDeposits()

        val inboundCheckDeposit =
            inboundCheckDepositService.return_(
                InboundCheckDepositReturnParams.builder()
                    .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                    .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
                    .build()
            )

        inboundCheckDeposit.validate()
    }
}
