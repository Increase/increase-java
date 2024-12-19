// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingAccountCreateParamsTest {

    @Test
    fun createBookkeepingAccountCreateParams() {
        BookkeepingAccountCreateParams.builder()
            .name("New Account!")
            .accountId("account_id")
            .complianceCategory(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
            .entityId("entity_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            BookkeepingAccountCreateParams.builder()
                .name("New Account!")
                .accountId("account_id")
                .complianceCategory(
                    BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH
                )
                .entityId("entity_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("New Account!")
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.complianceCategory())
            .isEqualTo(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
        assertThat(body.entityId()).isEqualTo("entity_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = BookkeepingAccountCreateParams.builder().name("New Account!").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("New Account!")
    }
}
