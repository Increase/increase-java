// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCreateParamsTest {

    @Test
    fun createAccountCreateParams() {
        AccountCreateParams.builder()
            .name("x")
            .entityId("entity_id")
            .informationalEntityId("informational_entity_id")
            .programId("program_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountCreateParams.builder()
                .name("x")
                .entityId("entity_id")
                .informationalEntityId("informational_entity_id")
                .programId("program_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.entityId()).isEqualTo("entity_id")
        assertThat(body.informationalEntityId()).isEqualTo("informational_entity_id")
        assertThat(body.programId()).isEqualTo("program_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AccountCreateParams.builder().name("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
    }
}
