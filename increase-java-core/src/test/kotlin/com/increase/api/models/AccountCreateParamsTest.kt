// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCreateParamsTest {

    @Test
    fun createAccountCreateParams() {
        AccountCreateParams.builder()
            .name("New Account!")
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .informationalEntityId("informational_entity_id")
            .programId("program_i2v2os4mwza1oetokh9i")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountCreateParams.builder()
                .name("New Account!")
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .informationalEntityId("informational_entity_id")
                .programId("program_i2v2os4mwza1oetokh9i")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("New Account!")
        assertThat(body.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(body.informationalEntityId()).isEqualTo("informational_entity_id")
        assertThat(body.programId()).isEqualTo("program_i2v2os4mwza1oetokh9i")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AccountCreateParams.builder().name("New Account!").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("New Account!")
    }
}
