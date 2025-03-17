// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardrefunds

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardRefundCreateParamsTest {

    @Test
    fun create() {
        CardRefundCreateParams.builder().transactionId("transaction_uyrp7fld2ium70oa7oi").build()
    }

    @Test
    fun body() {
        val params =
            CardRefundCreateParams.builder()
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.transactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardRefundCreateParams.builder()
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.transactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
    }
}
