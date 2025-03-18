// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.accounttransfers.AccountTransferCompleteParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountTransferServiceAsyncTest {

    @Test
    fun complete() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferServiceAsync = client.simulations().accountTransfers()

        val accountTransferFuture =
            accountTransferServiceAsync.complete(
                AccountTransferCompleteParams.builder()
                    .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                    .build()
            )

        val accountTransfer = accountTransferFuture.get()
        accountTransfer.validate()
    }
}
