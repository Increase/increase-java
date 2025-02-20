// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardAuthorizationExpirationCreateParamsTest {

    @Test
    fun create() {
        SimulationCardAuthorizationExpirationCreateParams.builder()
            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
            .build()
    }

    @Test
    fun body() {
        val params =
            SimulationCardAuthorizationExpirationCreateParams.builder()
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationCardAuthorizationExpirationCreateParams.builder()
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
    }
}
