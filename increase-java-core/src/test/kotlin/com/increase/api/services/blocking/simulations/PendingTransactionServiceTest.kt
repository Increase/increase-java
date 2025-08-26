// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PendingTransactionServiceTest {

    @Test
    fun releaseInboundFundsHold() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionService = client.simulations().pendingTransactions()

        val pendingTransaction =
            pendingTransactionService.releaseInboundFundsHold(
                "pending_transaction_k1sfetcau2qbvjbzgju4"
            )

        pendingTransaction.validate()
    }
}
