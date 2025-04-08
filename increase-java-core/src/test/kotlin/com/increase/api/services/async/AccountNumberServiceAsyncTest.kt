// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.accountnumbers.AccountNumberCreateParams
import com.increase.api.models.accountnumbers.AccountNumberRetrieveParams
import com.increase.api.models.accountnumbers.AccountNumberUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountNumberServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberServiceAsync = client.accountNumbers()

        val accountNumberFuture =
            accountNumberServiceAsync.create(
                AccountNumberCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .name("Rent payments")
                    .inboundAch(
                        AccountNumberCreateParams.InboundAch.builder()
                            .debitStatus(AccountNumberCreateParams.InboundAch.DebitStatus.ALLOWED)
                            .build()
                    )
                    .inboundChecks(
                        AccountNumberCreateParams.InboundChecks.builder()
                            .status(AccountNumberCreateParams.InboundChecks.Status.ALLOWED)
                            .build()
                    )
                    .build()
            )

        val accountNumber = accountNumberFuture.get()
        accountNumber.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberServiceAsync = client.accountNumbers()

        val accountNumberFuture =
            accountNumberServiceAsync.retrieve(
                AccountNumberRetrieveParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .build()
            )

        val accountNumber = accountNumberFuture.get()
        accountNumber.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberServiceAsync = client.accountNumbers()

        val accountNumberFuture =
            accountNumberServiceAsync.update(
                AccountNumberUpdateParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .inboundAch(
                        AccountNumberUpdateParams.InboundAch.builder()
                            .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.BLOCKED)
                            .build()
                    )
                    .inboundChecks(
                        AccountNumberUpdateParams.InboundChecks.builder()
                            .status(AccountNumberUpdateParams.InboundChecks.Status.ALLOWED)
                            .build()
                    )
                    .name("x")
                    .status(AccountNumberUpdateParams.Status.DISABLED)
                    .build()
            )

        val accountNumber = accountNumberFuture.get()
        accountNumber.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberServiceAsync = client.accountNumbers()

        val pageFuture = accountNumberServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
