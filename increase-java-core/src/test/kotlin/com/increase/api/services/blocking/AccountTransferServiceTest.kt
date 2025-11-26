// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.accounttransfers.AccountTransferCreateParams
import com.increase.api.models.accounttransfers.AccountTransferListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountTransferServiceTest {

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
            accountTransferService.retrieve("account_transfer_7k9qe1ysdgqztnt63l7n")

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

        val accountTransfers =
            accountTransferService.list(
                AccountTransferListParams.builder()
                    .accountId("account_id")
                    .createdAt(
                        AccountTransferListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .idempotencyKey("x")
                    .limit(1L)
                    .build()
            )

        accountTransfers.validate()
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
            accountTransferService.approve("account_transfer_7k9qe1ysdgqztnt63l7n")

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

        val accountTransfer = accountTransferService.cancel("account_transfer_7k9qe1ysdgqztnt63l7n")

        accountTransfer.validate()
    }
}
