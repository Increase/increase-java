// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.transactions.TransactionListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransactionServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val transactionFuture = transactionServiceAsync.retrieve("transaction_uyrp7fld2ium70oa7oi")

        val transaction = transactionFuture.get()
        transaction.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val transactionsFuture =
            transactionServiceAsync.list(
                TransactionListParams.builder()
                    .accountId("account_id")
                    .category(
                        TransactionListParams.Category.builder()
                            .addIn(TransactionListParams.Category.In.ACCOUNT_TRANSFER_INTENTION)
                            .build()
                    )
                    .createdAt(
                        TransactionListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .routeId("route_id")
                    .build()
            )

        val transactions = transactionsFuture.get()
        transactions.validate()
    }
}
