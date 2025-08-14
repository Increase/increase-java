// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardvalidations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardValidationCreateParamsTest {

    @Test
    fun create() {
        CardValidationCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
            .merchantCategoryCode("1234")
            .merchantCityName("New York")
            .merchantName("Acme Corp")
            .merchantPostalCode("10045")
            .merchantState("NY")
            .cardholderFirstName("Dee")
            .cardholderLastName("Hock")
            .cardholderMiddleName("Ward")
            .cardholderPostalCode("10045")
            .cardholderStreetAddress("33 Liberty Street")
            .build()
    }

    @Test
    fun body() {
        val params =
            CardValidationCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                .merchantCategoryCode("1234")
                .merchantCityName("New York")
                .merchantName("Acme Corp")
                .merchantPostalCode("10045")
                .merchantState("NY")
                .cardholderFirstName("Dee")
                .cardholderLastName("Hock")
                .cardholderMiddleName("Ward")
                .cardholderPostalCode("10045")
                .cardholderStreetAddress("33 Liberty Street")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.cardTokenId()).isEqualTo("outbound_card_token_zlt0ml6youq3q7vcdlg0")
        assertThat(body.merchantCategoryCode()).isEqualTo("1234")
        assertThat(body.merchantCityName()).isEqualTo("New York")
        assertThat(body.merchantName()).isEqualTo("Acme Corp")
        assertThat(body.merchantPostalCode()).isEqualTo("10045")
        assertThat(body.merchantState()).isEqualTo("NY")
        assertThat(body.cardholderFirstName()).contains("Dee")
        assertThat(body.cardholderLastName()).contains("Hock")
        assertThat(body.cardholderMiddleName()).contains("Ward")
        assertThat(body.cardholderPostalCode()).contains("10045")
        assertThat(body.cardholderStreetAddress()).contains("33 Liberty Street")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardValidationCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                .merchantCategoryCode("1234")
                .merchantCityName("New York")
                .merchantName("Acme Corp")
                .merchantPostalCode("10045")
                .merchantState("NY")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.cardTokenId()).isEqualTo("outbound_card_token_zlt0ml6youq3q7vcdlg0")
        assertThat(body.merchantCategoryCode()).isEqualTo("1234")
        assertThat(body.merchantCityName()).isEqualTo("New York")
        assertThat(body.merchantName()).isEqualTo("Acme Corp")
        assertThat(body.merchantPostalCode()).isEqualTo("10045")
        assertThat(body.merchantState()).isEqualTo("NY")
    }
}
