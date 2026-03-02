// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardauthentications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAuthenticationChallengesParamsTest {

    @Test
    fun create() {
        CardAuthenticationChallengesParams.builder()
            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardAuthenticationChallengesParams.builder()
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
