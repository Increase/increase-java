// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiAccountEnrollmentCreateParamsTest {

    @Test
    fun createIntrafiAccountEnrollmentCreateParams() {
        IntrafiAccountEnrollmentCreateParams.builder()
            .accountId("account_id")
            .emailAddress("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            IntrafiAccountEnrollmentCreateParams.builder()
                .accountId("account_id")
                .emailAddress("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.emailAddress()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            IntrafiAccountEnrollmentCreateParams.builder()
                .accountId("account_id")
                .emailAddress("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.emailAddress()).isEqualTo("x")
    }
}
