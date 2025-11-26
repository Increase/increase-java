// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.declinedtransactions.DeclinedTransactionListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeclinedTransactionServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val declinedTransactionService = client.declinedTransactions()

        val declinedTransaction =
            declinedTransactionService.retrieve("declined_transaction_17jbn0yyhvkt4v4ooym8")

        declinedTransaction.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val declinedTransactionService = client.declinedTransactions()

        val declinedTransactions =
            declinedTransactionService.list(
                DeclinedTransactionListParams.builder()
                    .accountId("account_id")
                    .category(
                        DeclinedTransactionListParams.Category.builder()
                            .addIn(DeclinedTransactionListParams.Category.In.ACH_DECLINE)
                            .build()
                    )
                    .createdAt(
                        DeclinedTransactionListParams.CreatedAt.builder()
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

        declinedTransactions.validate()
    }
}
