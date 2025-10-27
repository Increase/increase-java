// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.cardrefunds.CardRefundCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardRefundServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardRefundService = client.simulations().cardRefunds()

        val transaction =
            cardRefundService.create(
                CardRefundCreateParams.builder()
                    .amount(1L)
                    .pendingTransactionId("pending_transaction_id")
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .build()
            )

        transaction.validate()
    }
}
