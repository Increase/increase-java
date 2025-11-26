// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountBalanceParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountCreateParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BookkeepingAccountServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountServiceAsync = client.bookkeepingAccounts()

        val bookkeepingAccountFuture =
            bookkeepingAccountServiceAsync.create(
                BookkeepingAccountCreateParams.builder()
                    .name("New Account!")
                    .accountId("account_id")
                    .complianceCategory(
                        BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH
                    )
                    .entityId("entity_id")
                    .build()
            )

        val bookkeepingAccount = bookkeepingAccountFuture.get()
        bookkeepingAccount.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountServiceAsync = client.bookkeepingAccounts()

        val bookkeepingAccountFuture =
            bookkeepingAccountServiceAsync.update(
                BookkeepingAccountUpdateParams.builder()
                    .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                    .name("Deprecated Account")
                    .build()
            )

        val bookkeepingAccount = bookkeepingAccountFuture.get()
        bookkeepingAccount.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountServiceAsync = client.bookkeepingAccounts()

        val pageFuture = bookkeepingAccountServiceAsync.list()

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
        val bookkeepingAccountServiceAsync = client.bookkeepingAccounts()

        val bookkeepingBalanceLookupFuture =
            bookkeepingAccountServiceAsync.balance(
                BookkeepingAccountBalanceParams.builder()
                    .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                    .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val bookkeepingBalanceLookup = bookkeepingBalanceLookupFuture.get()
        bookkeepingBalanceLookup.validate()
    }
}
