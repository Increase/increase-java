package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingAccountCreateParamsTest {

    @Test
    fun createBookkeepingAccountCreateParams() {
        BookkeepingAccountCreateParams.builder()
            .complianceCategory(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
            .entityId("string")
            .accountId("string")
            .name("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            BookkeepingAccountCreateParams.builder()
                .complianceCategory(
                    BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH
                )
                .entityId("string")
                .accountId("string")
                .name("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.complianceCategory())
            .isEqualTo(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
        assertThat(body.entityId()).isEqualTo("string")
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = BookkeepingAccountCreateParams.builder().name("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
    }
}
