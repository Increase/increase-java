package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountCreateParamsTest {

    @Test
    fun createExternalAccountCreateParams() {
        ExternalAccountCreateParams.builder()
            .routingNumber("xxxxxxxxx")
            .accountNumber("x")
            .funding(ExternalAccountCreateParams.Funding.CHECKING)
            .description("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalAccountCreateParams.builder()
                .routingNumber("xxxxxxxxx")
                .accountNumber("x")
                .funding(ExternalAccountCreateParams.Funding.CHECKING)
                .description("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.funding()).isEqualTo(ExternalAccountCreateParams.Funding.CHECKING)
        assertThat(body.description()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExternalAccountCreateParams.builder()
                .routingNumber("xxxxxxxxx")
                .accountNumber("x")
                .description("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
    }
}
