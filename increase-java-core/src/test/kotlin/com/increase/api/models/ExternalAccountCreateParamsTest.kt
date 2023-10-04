// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountCreateParamsTest {

    @Test
    fun createExternalAccountCreateParams() {
        ExternalAccountCreateParams.builder()
            .accountNumber("x")
            .description("x")
            .routingNumber("xxxxxxxxx")
            .funding(ExternalAccountCreateParams.Funding.CHECKING)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalAccountCreateParams.builder()
                .accountNumber("x")
                .description("x")
                .routingNumber("xxxxxxxxx")
                .funding(ExternalAccountCreateParams.Funding.CHECKING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.funding()).isEqualTo(ExternalAccountCreateParams.Funding.CHECKING)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExternalAccountCreateParams.builder()
                .accountNumber("x")
                .description("x")
                .routingNumber("xxxxxxxxx")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
    }
}
