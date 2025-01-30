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
    fun body() {
        val params =
            AccountCreateParams.builder()
                .name("New Account!")
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .informationalEntityId("informational_entity_id")
                .programId("program_i2v2os4mwza1oetokh9i")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("New Account!")
        assertThat(body.entityId()).contains("entity_n8y8tnk2p9339ti393yi")
        assertThat(body.informationalEntityId()).contains("informational_entity_id")
        assertThat(body.programId()).contains("program_i2v2os4mwza1oetokh9i")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountCreateParams.builder().name("New Account!").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("New Account!")
    }
}
