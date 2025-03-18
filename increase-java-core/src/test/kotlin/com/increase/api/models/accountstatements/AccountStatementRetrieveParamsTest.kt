// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountStatementRetrieveParamsTest {

    @Test
    fun create() {
        AccountStatementRetrieveParams.builder()
            .accountStatementId("account_statement_lkc03a4skm2k7f38vj15")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountStatementRetrieveParams.builder()
                .accountStatementId("account_statement_lkc03a4skm2k7f38vj15")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_statement_lkc03a4skm2k7f38vj15")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
