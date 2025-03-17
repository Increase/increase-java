// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.accountstatements.AccountStatementRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountStatementServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountStatementService = client.accountStatements()

        val accountStatement =
            accountStatementService.retrieve(
                AccountStatementRetrieveParams.builder()
                    .accountStatementId("account_statement_lkc03a4skm2k7f38vj15")
                    .build()
            )

        accountStatement.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountStatementService = client.accountStatements()

        val page = accountStatementService.list()

        page.response().validate()
    }
}
