// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.accounts.AccountBalanceParams
import com.increase.api.models.accounts.AccountCloseParams
import com.increase.api.models.accounts.AccountCreateParams
import com.increase.api.models.accounts.AccountRetrieveParams
import com.increase.api.models.accounts.AccountUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.create(
                AccountCreateParams.builder()
                    .name("New Account!")
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .informationalEntityId("informational_entity_id")
                    .programId("program_i2v2os4mwza1oetokh9i")
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.retrieve(
                AccountRetrieveParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.update(
                AccountUpdateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .name("My renamed account")
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val pageFuture = accountServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun balance() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val balanceLookupFuture =
            accountServiceAsync.balance(
                AccountBalanceParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val balanceLookup = balanceLookupFuture.get()
        balanceLookup.validate()
    }

    @Test
    fun close() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.close(
                AccountCloseParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
            )

        val account = accountFuture.get()
        account.validate()
    }
}
