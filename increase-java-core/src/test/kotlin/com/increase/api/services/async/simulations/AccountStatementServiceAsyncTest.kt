// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.accountstatements.AccountStatementCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountStatementServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountStatementServiceAsync = client.simulations().accountStatements()

        val accountStatementFuture =
            accountStatementServiceAsync.create(
                AccountStatementCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .build()
            )

        val accountStatement = accountStatementFuture.get()
        accountStatement.validate()
    }
}
