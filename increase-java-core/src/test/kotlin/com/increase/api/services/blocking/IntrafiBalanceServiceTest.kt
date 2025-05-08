// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IntrafiBalanceServiceTest {

    @Test
    fun intrafiBalance() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiBalanceService = client.intrafiBalances()

        val intrafiBalance = intrafiBalanceService.intrafiBalance("account_in71c4amph0vgo2qllky")

        intrafiBalance.validate()
    }
}
