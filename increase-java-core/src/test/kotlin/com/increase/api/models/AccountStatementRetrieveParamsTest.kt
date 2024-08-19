// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountStatementRetrieveParamsTest {

    @Test
    fun createAccountStatementRetrieveParams() {
        AccountStatementRetrieveParams.builder().accountStatementId("account_statement_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            AccountStatementRetrieveParams.builder()
                .accountStatementId("account_statement_id")
                .build()
        assertThat(params).isNotNull
        // path param "accountStatementId"
        assertThat(params.getPathParam(0)).isEqualTo("account_statement_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
