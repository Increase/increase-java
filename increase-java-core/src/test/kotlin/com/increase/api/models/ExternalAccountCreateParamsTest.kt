// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountCreateParamsTest {

    @Test
    fun createExternalAccountCreateParams() {
        ExternalAccountCreateParams.builder()
            .accountNumber("987654321")
            .description("Landlord")
            .routingNumber("101050001")
            .accountHolder(ExternalAccountCreateParams.AccountHolder.BUSINESS)
            .funding(ExternalAccountCreateParams.Funding.CHECKING)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalAccountCreateParams.builder()
                .accountNumber("987654321")
                .description("Landlord")
                .routingNumber("101050001")
                .accountHolder(ExternalAccountCreateParams.AccountHolder.BUSINESS)
                .funding(ExternalAccountCreateParams.Funding.CHECKING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumber()).isEqualTo("987654321")
        assertThat(body.description()).isEqualTo("Landlord")
        assertThat(body.routingNumber()).isEqualTo("101050001")
        assertThat(body.accountHolder())
            .contains(ExternalAccountCreateParams.AccountHolder.BUSINESS)
        assertThat(body.funding()).contains(ExternalAccountCreateParams.Funding.CHECKING)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExternalAccountCreateParams.builder()
                .accountNumber("987654321")
                .description("Landlord")
                .routingNumber("101050001")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumber()).isEqualTo("987654321")
        assertThat(body.description()).isEqualTo("Landlord")
        assertThat(body.routingNumber()).isEqualTo("101050001")
    }
}
