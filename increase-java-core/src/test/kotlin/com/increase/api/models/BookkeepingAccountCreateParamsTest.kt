// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingAccountCreateParamsTest {

    @Test
    fun createBookkeepingAccountCreateParams() {
        BookkeepingAccountCreateParams.builder()
            .name("x")
            .accountId("string")
            .complianceCategory(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
            .entityId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            BookkeepingAccountCreateParams.builder()
                .name("x")
                .accountId("string")
                .complianceCategory(
                    BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH
                )
                .entityId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.complianceCategory())
            .isEqualTo(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
        assertThat(body.entityId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = BookkeepingAccountCreateParams.builder().name("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
    }
}
