// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokenrequests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenRequestRetrieveParamsTest {

    @Test
    fun create() {
        DigitalWalletTokenRequestRetrieveParams.builder()
            .digitalWalletTokenRequestId("digital_wallet_token_request_dlsq0yabf7ev4xvke6ek")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DigitalWalletTokenRequestRetrieveParams.builder()
                .digitalWalletTokenRequestId("digital_wallet_token_request_dlsq0yabf7ev4xvke6ek")
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("digital_wallet_token_request_dlsq0yabf7ev4xvke6ek")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
