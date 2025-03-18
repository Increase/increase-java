// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountUpdateParamsTest {

    @Test
    fun create() {
        ExternalAccountUpdateParams.builder()
            .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
            .accountHolder(ExternalAccountUpdateParams.AccountHolder.BUSINESS)
            .description("New description")
            .funding(ExternalAccountUpdateParams.Funding.CHECKING)
            .status(ExternalAccountUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalAccountUpdateParams.builder()
                .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_account_ukk55lr923a3ac0pp7iv")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalAccountUpdateParams.builder()
                .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                .accountHolder(ExternalAccountUpdateParams.AccountHolder.BUSINESS)
                .description("New description")
                .funding(ExternalAccountUpdateParams.Funding.CHECKING)
                .status(ExternalAccountUpdateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountHolder())
            .contains(ExternalAccountUpdateParams.AccountHolder.BUSINESS)
        assertThat(body.description()).contains("New description")
        assertThat(body.funding()).contains(ExternalAccountUpdateParams.Funding.CHECKING)
        assertThat(body.status()).contains(ExternalAccountUpdateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalAccountUpdateParams.builder()
                .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                .build()

        val body = params._body()

        assertNotNull(body)
    }
}
