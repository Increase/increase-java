// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.AccountTransferApproveParams
import com.increase.api.models.AccountTransferCancelParams
import com.increase.api.models.AccountTransferCreateParams
import com.increase.api.models.AccountTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountTransferServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.accountTransfers()

        val accountTransfer =
            accountTransferService.create(
                AccountTransferCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(100L)
                    .description("Creating liquidity")
                    .destinationAccountId("account_uf16sut2ct5bevmq3eh")
                    .requireApproval(true)
                    .build()
            )

        accountTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.accountTransfers()

        val accountTransfer =
            accountTransferService.retrieve(
                AccountTransferRetrieveParams.builder()
                    .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                    .build()
            )

        accountTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.accountTransfers()

        val page = accountTransferService.list()

        page.response().validate()
    }

    @Test
    fun approve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.accountTransfers()

        val accountTransfer =
            accountTransferService.approve(
                AccountTransferApproveParams.builder()
                    .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                    .build()
            )

        accountTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.accountTransfers()

        val accountTransfer =
            accountTransferService.cancel(
                AccountTransferCancelParams.builder()
                    .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                    .build()
            )

        accountTransfer.validate()
    }
}
