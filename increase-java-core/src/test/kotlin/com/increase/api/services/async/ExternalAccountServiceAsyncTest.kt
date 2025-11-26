// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.externalaccounts.ExternalAccountCreateParams
import com.increase.api.models.externalaccounts.ExternalAccountListParams
import com.increase.api.models.externalaccounts.ExternalAccountUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalAccountServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccountFuture =
            externalAccountServiceAsync.create(
                ExternalAccountCreateParams.builder()
                    .accountNumber("987654321")
                    .description("Landlord")
                    .routingNumber("101050001")
                    .accountHolder(ExternalAccountCreateParams.AccountHolder.BUSINESS)
                    .funding(ExternalAccountCreateParams.Funding.CHECKING)
                    .build()
            )

        val externalAccount = externalAccountFuture.get()
        externalAccount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccountFuture =
            externalAccountServiceAsync.retrieve("external_account_ukk55lr923a3ac0pp7iv")

        val externalAccount = externalAccountFuture.get()
        externalAccount.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccountFuture =
            externalAccountServiceAsync.update(
                ExternalAccountUpdateParams.builder()
                    .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                    .accountHolder(ExternalAccountUpdateParams.AccountHolder.BUSINESS)
                    .description("New description")
                    .funding(ExternalAccountUpdateParams.Funding.CHECKING)
                    .status(ExternalAccountUpdateParams.Status.ACTIVE)
                    .build()
            )

        val externalAccount = externalAccountFuture.get()
        externalAccount.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountServiceAsync = client.externalAccounts()

        val externalAccountsFuture =
            externalAccountServiceAsync.list(
                ExternalAccountListParams.builder()
                    .cursor("cursor")
                    .idempotencyKey("x")
                    .limit(1L)
                    .routingNumber("xxxxxxxxx")
                    .status(
                        ExternalAccountListParams.Status.builder()
                            .addIn(ExternalAccountListParams.Status.In.ACTIVE)
                            .build()
                    )
                    .build()
            )

        val externalAccounts = externalAccountsFuture.get()
        externalAccounts.validate()
    }
}
