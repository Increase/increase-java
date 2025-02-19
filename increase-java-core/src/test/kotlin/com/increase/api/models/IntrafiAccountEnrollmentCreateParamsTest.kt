// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiAccountEnrollmentCreateParamsTest {

    @Test
    fun create() {
        IntrafiAccountEnrollmentCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .emailAddress("user@example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            IntrafiAccountEnrollmentCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .emailAddress("user@example.com")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.emailAddress()).isEqualTo("user@example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntrafiAccountEnrollmentCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .emailAddress("user@example.com")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.emailAddress()).isEqualTo("user@example.com")
    }
}
