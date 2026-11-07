// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountNumberUpdateParamsTest {

    @Test
    fun create() {
        AccountNumberUpdateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .inboundAchDebits(AccountNumberUpdateParams.InboundAchDebits.BLOCKED)
            .name("x")
            .status(AccountNumberUpdateParams.Status.DISABLED)
            .unregisteredInboundChecks(AccountNumberUpdateParams.UnregisteredInboundChecks.ALLOWED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountNumberUpdateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountNumberUpdateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .inboundAchDebits(AccountNumberUpdateParams.InboundAchDebits.BLOCKED)
                .name("x")
                .status(AccountNumberUpdateParams.Status.DISABLED)
                .unregisteredInboundChecks(
                    AccountNumberUpdateParams.UnregisteredInboundChecks.ALLOWED
                )
                .build()

        val body = params._body()

        assertThat(body.inboundAchDebits())
            .contains(AccountNumberUpdateParams.InboundAchDebits.BLOCKED)
        assertThat(body.name()).contains("x")
        assertThat(body.status()).contains(AccountNumberUpdateParams.Status.DISABLED)
        assertThat(body.unregisteredInboundChecks())
            .contains(AccountNumberUpdateParams.UnregisteredInboundChecks.ALLOWED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountNumberUpdateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()

        val body = params._body()
    }
}
