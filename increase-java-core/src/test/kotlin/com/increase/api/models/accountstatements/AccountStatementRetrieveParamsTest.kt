// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountStatementRetrieveParamsTest {

    @Test
    fun create() {
        AccountStatementRetrieveParams.builder()
            .accountStatementId("account_statement_lkc03a4skm2k7f38vj15")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            AccountStatementRetrieveParams.builder()
                .accountStatementId("account_statement_lkc03a4skm2k7f38vj15")
                .build()
        assertThat(params).isNotNull
        // path param "accountStatementId"
        assertThat(params.getPathParam(0)).isEqualTo("account_statement_lkc03a4skm2k7f38vj15")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
