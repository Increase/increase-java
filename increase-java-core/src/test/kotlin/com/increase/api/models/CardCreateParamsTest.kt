package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardCreateParamsTest {

    @Test
    fun createCardCreateParams() {
        CardCreateParams.builder()
            .accountId("string")
            .description("x")
            .billingAddress(
                CardCreateParams.BillingAddress.builder()
                    .city("x")
                    .line1("x")
                    .postalCode("x")
                    .state("x")
                    .line2("x")
                    .build()
            )
            .digitalWallet(
                CardCreateParams.DigitalWallet.builder()
                    .cardProfileId("string")
                    .email("x")
                    .phone("x")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardCreateParams.builder()
                .accountId("string")
                .description("x")
                .billingAddress(
                    CardCreateParams.BillingAddress.builder()
                        .city("x")
                        .line1("x")
                        .postalCode("x")
                        .state("x")
                        .line2("x")
                        .build()
                )
                .digitalWallet(
                    CardCreateParams.DigitalWallet.builder()
                        .cardProfileId("string")
                        .email("x")
                        .phone("x")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.billingAddress())
            .isEqualTo(
                CardCreateParams.BillingAddress.builder()
                    .city("x")
                    .line1("x")
                    .postalCode("x")
                    .state("x")
                    .line2("x")
                    .build()
            )
        assertThat(body.digitalWallet())
            .isEqualTo(
                CardCreateParams.DigitalWallet.builder()
                    .cardProfileId("string")
                    .email("x")
                    .phone("x")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CardCreateParams.builder().accountId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
    }
}
