// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.externalaccounts.ExternalAccountCreateParams
import com.increase.api.models.externalaccounts.ExternalAccountRetrieveParams
import com.increase.api.models.externalaccounts.ExternalAccountUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalAccountServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountService = client.externalAccounts()

        val externalAccount =
            externalAccountService.create(
                ExternalAccountCreateParams.builder()
                    .accountNumber("987654321")
                    .description("Landlord")
                    .routingNumber("101050001")
                    .accountHolder(ExternalAccountCreateParams.AccountHolder.BUSINESS)
                    .funding(ExternalAccountCreateParams.Funding.CHECKING)
                    .build()
            )

        externalAccount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountService = client.externalAccounts()

        val externalAccount =
            externalAccountService.retrieve(
                ExternalAccountRetrieveParams.builder()
                    .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                    .build()
            )

        externalAccount.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountService = client.externalAccounts()

        val externalAccount =
            externalAccountService.update(
                ExternalAccountUpdateParams.builder()
                    .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                    .accountHolder(ExternalAccountUpdateParams.AccountHolder.BUSINESS)
                    .description("New description")
                    .funding(ExternalAccountUpdateParams.Funding.CHECKING)
                    .status(ExternalAccountUpdateParams.Status.ACTIVE)
                    .build()
            )

        externalAccount.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountService = client.externalAccounts()

        val page = externalAccountService.list()

        page.response().validate()
    }
}
