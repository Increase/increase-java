// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.pendingtransactions.PendingTransactionCreateParams
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PendingTransactionServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionService = client.pendingTransactions()

        val pendingTransaction =
            pendingTransactionService.create(
                PendingTransactionCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(-1000L)
                    .description("Hold for pending transaction")
                    .build()
            )

        pendingTransaction.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionService = client.pendingTransactions()

        val pendingTransaction =
            pendingTransactionService.retrieve("pending_transaction_k1sfetcau2qbvjbzgju4")

        pendingTransaction.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionService = client.pendingTransactions()

        val pendingTransactions =
            pendingTransactionService.list(
                PendingTransactionListParams.builder()
                    .accountId("account_id")
                    .category(
                        PendingTransactionListParams.Category.builder()
                            .addIn(
                                PendingTransactionListParams.Category.In
                                    .ACCOUNT_TRANSFER_INSTRUCTION
                            )
                            .build()
                    )
                    .createdAt(
                        PendingTransactionListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .routeId("route_id")
                    .status(
                        PendingTransactionListParams.Status.builder()
                            .addIn(PendingTransactionListParams.Status.In.PENDING)
                            .build()
                    )
                    .build()
            )

        pendingTransactions.validate()
    }

    @Test
    fun release() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionService = client.pendingTransactions()

        val pendingTransaction =
            pendingTransactionService.release("pending_transaction_k1sfetcau2qbvjbzgju4")

        pendingTransaction.validate()
    }
}
