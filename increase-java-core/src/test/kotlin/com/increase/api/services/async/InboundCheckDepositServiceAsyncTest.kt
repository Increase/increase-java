// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams
import java.time.OffsetDateTime
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
            inboundCheckDepositServiceAsync.retrieve("inbound_check_deposit_zoshvqybq0cjjm31mra")

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

        val inboundCheckDepositsFuture =
            inboundCheckDepositServiceAsync.list(
                InboundCheckDepositListParams.builder()
                    .accountId("account_id")
                    .checkTransferId("check_transfer_id")
                    .createdAt(
                        InboundCheckDepositListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .build()
            )

        val inboundCheckDeposits = inboundCheckDepositsFuture.get()
        inboundCheckDeposits.validate()
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
            inboundCheckDepositServiceAsync.decline("inbound_check_deposit_zoshvqybq0cjjm31mra")

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
