// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountStatementServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountStatementServiceAsync = client.accountStatements()

        val accountStatementFuture =
            accountStatementServiceAsync.retrieve("account_statement_lkc03a4skm2k7f38vj15")

        val accountStatement = accountStatementFuture.get()
        accountStatement.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountStatementServiceAsync = client.accountStatements()

        val pageFuture = accountStatementServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
