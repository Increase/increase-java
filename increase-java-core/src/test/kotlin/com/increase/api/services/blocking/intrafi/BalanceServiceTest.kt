// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.intrafi

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BalanceServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val balanceService = client.intrafi().balances()
        val intrafiBalance =
            balanceService.retrieve(
                IntrafiBalanceRetrieveParams.builder().accountId("string").build()
            )
        println(intrafiBalance)
        intrafiBalance.validate()
    }
}
