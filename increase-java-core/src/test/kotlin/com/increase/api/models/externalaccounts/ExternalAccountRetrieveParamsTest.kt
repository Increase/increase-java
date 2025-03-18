// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountRetrieveParamsTest {

    @Test
    fun create() {
        ExternalAccountRetrieveParams.builder()
            .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalAccountRetrieveParams.builder()
                .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_account_ukk55lr923a3ac0pp7iv")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
