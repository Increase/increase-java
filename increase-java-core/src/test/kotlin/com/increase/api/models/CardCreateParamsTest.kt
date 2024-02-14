// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardCreateParamsTest {

    @Test
    fun createCardCreateParams() {
        CardCreateParams.builder()
            .accountId("string")
            .billingAddress(
                CardCreateParams.BillingAddress.builder()
                    .city("x")
                    .line1("x")
                    .postalCode("x")
                    .state("x")
                    .line2("x")
                    .build()
            )
            .description("x")
            .digitalWallet(
                CardCreateParams.DigitalWallet.builder()
                    .digitalCardProfileId("string")
                    .email("x")
                    .phone("x")
                    .build()
            )
            .entityId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardCreateParams.builder()
                .accountId("string")
                .billingAddress(
                    CardCreateParams.BillingAddress.builder()
                        .city("x")
                        .line1("x")
                        .postalCode("x")
                        .state("x")
                        .line2("x")
                        .build()
                )
                .description("x")
                .digitalWallet(
                    CardCreateParams.DigitalWallet.builder()
                        .digitalCardProfileId("string")
                        .email("x")
                        .phone("x")
                        .build()
                )
                .entityId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
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
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.digitalWallet())
            .isEqualTo(
                CardCreateParams.DigitalWallet.builder()
                    .digitalCardProfileId("string")
                    .email("x")
                    .phone("x")
                    .build()
            )
        assertThat(body.entityId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CardCreateParams.builder().accountId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
    }
}
