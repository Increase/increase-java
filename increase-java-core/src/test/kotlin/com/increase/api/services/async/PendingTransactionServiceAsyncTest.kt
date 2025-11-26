// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.pendingtransactions.PendingTransactionCreateParams
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PendingTransactionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pendingTransactionFuture =
            pendingTransactionServiceAsync.create(
                PendingTransactionCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(-1000L)
                    .description("Hold for pending transaction")
                    .build()
            )

        val pendingTransaction = pendingTransactionFuture.get()
        pendingTransaction.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pendingTransactionFuture =
            pendingTransactionServiceAsync.retrieve("pending_transaction_k1sfetcau2qbvjbzgju4")

        val pendingTransaction = pendingTransactionFuture.get()
        pendingTransaction.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pendingTransactionsFuture =
            pendingTransactionServiceAsync.list(
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

        val pendingTransactions = pendingTransactionsFuture.get()
        pendingTransactions.validate()
    }

    @Test
    fun release() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pendingTransactionFuture =
            pendingTransactionServiceAsync.release("pending_transaction_k1sfetcau2qbvjbzgju4")

        val pendingTransaction = pendingTransactionFuture.get()
        pendingTransaction.validate()
    }
}
