// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositDeclineParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositRetrieveParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundCheckDepositServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositServiceAsync = client.inboundCheckDeposits()

        val inboundCheckDepositFuture =
            inboundCheckDepositServiceAsync.retrieve(
                InboundCheckDepositRetrieveParams.builder()
                    .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                    .build()
            )

        val inboundCheckDeposit = inboundCheckDepositFuture.get()
        inboundCheckDeposit.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositServiceAsync = client.inboundCheckDeposits()

        val pageFuture = inboundCheckDepositServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun decline() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositServiceAsync = client.inboundCheckDeposits()

        val inboundCheckDepositFuture =
            inboundCheckDepositServiceAsync.decline(
                InboundCheckDepositDeclineParams.builder()
                    .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                    .build()
            )

        val inboundCheckDeposit = inboundCheckDepositFuture.get()
        inboundCheckDeposit.validate()
    }

    @Test
    fun return_() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositServiceAsync = client.inboundCheckDeposits()

        val inboundCheckDepositFuture =
            inboundCheckDepositServiceAsync.return_(
                InboundCheckDepositReturnParams.builder()
                    .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                    .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
                    .build()
            )

        val inboundCheckDeposit = inboundCheckDepositFuture.get()
        inboundCheckDeposit.validate()
    }
}
