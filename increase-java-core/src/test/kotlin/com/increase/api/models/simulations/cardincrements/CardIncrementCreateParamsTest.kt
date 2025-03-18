// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardincrements

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardIncrementCreateParamsTest {

    @Test
    fun create() {
        CardIncrementCreateParams.builder()
            .amount(500L)
            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
            .eventSubscriptionId("event_subscription_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            CardIncrementCreateParams.builder()
                .amount(500L)
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .eventSubscriptionId("event_subscription_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(500L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
        assertThat(body.eventSubscriptionId()).contains("event_subscription_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardIncrementCreateParams.builder()
                .amount(500L)
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(500L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
    }
}
