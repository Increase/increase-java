package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardUpdateParamsTest {

    @Test
    fun createCardUpdateParams() {
        CardUpdateParams.builder()
            .cardId("string")
            .description("x")
            .status(CardUpdateParams.Status.ACTIVE)
            .billingAddress(
                CardUpdateParams.BillingAddress.builder()
                    .city("x")
                    .line1("x")
                    .postalCode("x")
                    .state("x")
                    .line2("x")
                    .build()
            )
            .digitalWallet(
                CardUpdateParams.DigitalWallet.builder()
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
            CardUpdateParams.builder()
                .cardId("string")
                .description("x")
                .status(CardUpdateParams.Status.ACTIVE)
                .billingAddress(
                    CardUpdateParams.BillingAddress.builder()
                        .city("x")
                        .line1("x")
                        .postalCode("x")
                        .state("x")
                        .line2("x")
                        .build()
                )
                .digitalWallet(
                    CardUpdateParams.DigitalWallet.builder()
                        .cardProfileId("string")
                        .email("x")
                        .phone("x")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.status()).isEqualTo(CardUpdateParams.Status.ACTIVE)
        assertThat(body.billingAddress())
            .isEqualTo(
                CardUpdateParams.BillingAddress.builder()
                    .city("x")
                    .line1("x")
                    .postalCode("x")
                    .state("x")
                    .line2("x")
                    .build()
            )
        assertThat(body.digitalWallet())
            .isEqualTo(
                CardUpdateParams.DigitalWallet.builder()
                    .cardProfileId("string")
                    .email("x")
                    .phone("x")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CardUpdateParams.builder().cardId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = CardUpdateParams.builder().cardId("string").build()
        assertThat(params).isNotNull
        // path param "cardId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
