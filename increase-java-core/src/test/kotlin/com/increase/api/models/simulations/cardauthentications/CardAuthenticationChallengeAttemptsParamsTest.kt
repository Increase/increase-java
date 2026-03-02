// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardauthentications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAuthenticationChallengeAttemptsParamsTest {

    @Test
    fun create() {
        CardAuthenticationChallengeAttemptsParams.builder()
            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
            .oneTimeCode("123456")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardAuthenticationChallengeAttemptsParams.builder()
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .oneTimeCode("123456")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardAuthenticationChallengeAttemptsParams.builder()
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .oneTimeCode("123456")
                .build()

        val body = params._body()

        assertThat(body.oneTimeCode()).isEqualTo("123456")
    }
}
