// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.cardrefunds.CardRefundCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardRefundServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardRefundServiceAsync = client.simulations().cardRefunds()

        val transactionFuture =
            cardRefundServiceAsync.create(
                CardRefundCreateParams.builder()
                    .amount(1L)
                    .pendingTransactionId("pending_transaction_id")
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .build()
            )

        val transaction = transactionFuture.get()
        transaction.validate()
    }
}
