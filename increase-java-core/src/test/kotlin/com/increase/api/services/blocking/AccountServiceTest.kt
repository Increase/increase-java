// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.AccountBalanceParams
import com.increase.api.models.AccountCloseParams
import com.increase.api.models.AccountCreateParams
import com.increase.api.models.AccountRetrieveParams
import com.increase.api.models.AccountUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.accounts()

        val account =
            accountService.create(
                AccountCreateParams.builder()
                    .name("New Account!")
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .informationalEntityId("informational_entity_id")
                    .programId("program_i2v2os4mwza1oetokh9i")
                    .build()
            )

        account.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.accounts()

        val account =
            accountService.retrieve(
                AccountRetrieveParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
            )

        account.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.accounts()

        val account =
            accountService.update(
                AccountUpdateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .name("My renamed account")
                    .build()
            )

        account.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.accounts()

        val page = accountService.list()

        page.response().validate()
    }

    @Test
    fun balance() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.accounts()

        val balanceLookup =
            accountService.balance(
                AccountBalanceParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        balanceLookup.validate()
    }

    @Test
    fun close() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.accounts()

        val account =
            accountService.close(
                AccountCloseParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
            )

        account.validate()
    }
}
