// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountNumberRetrieveParamsTest {

    @Test
    fun create() {
        AccountNumberRetrieveParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            AccountNumberRetrieveParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()
        assertThat(params).isNotNull
        // path param "accountNumberId"
        assertThat(params.getPathParam(0)).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
