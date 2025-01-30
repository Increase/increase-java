// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountUpdateParamsTest {

    @Test
    fun createExternalAccountUpdateParams() {
        ExternalAccountUpdateParams.builder()
            .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
            .accountHolder(ExternalAccountUpdateParams.AccountHolder.BUSINESS)
            .description("New description")
            .funding(ExternalAccountUpdateParams.Funding.CHECKING)
            .status(ExternalAccountUpdateParams.Status.ACTIVE)
            .build()
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
        assertThat(body).isNotNull
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
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            ExternalAccountUpdateParams.builder()
                .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                .build()
        assertThat(params).isNotNull
        // path param "externalAccountId"
        assertThat(params.getPathParam(0)).isEqualTo("external_account_ukk55lr923a3ac0pp7iv")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
