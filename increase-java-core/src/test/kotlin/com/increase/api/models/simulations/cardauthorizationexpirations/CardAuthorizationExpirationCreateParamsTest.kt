// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardauthorizationexpirations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAuthorizationExpirationCreateParamsTest {

    @Test
    fun create() {
        CardAuthorizationExpirationCreateParams.builder()
            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
            .build()
    }

    @Test
    fun body() {
        val params =
            CardAuthorizationExpirationCreateParams.builder()
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()

        val body = params._body()

        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
    }
}
