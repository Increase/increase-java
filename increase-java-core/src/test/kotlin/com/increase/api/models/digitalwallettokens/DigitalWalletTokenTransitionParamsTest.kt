// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenTransitionParamsTest {

    @Test
    fun create() {
        DigitalWalletTokenTransitionParams.builder()
            .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
            .status(DigitalWalletTokenTransitionParams.Status.SUSPENDED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DigitalWalletTokenTransitionParams.builder()
                .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                .status(DigitalWalletTokenTransitionParams.Status.SUSPENDED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("digital_wallet_token_izi62go3h51p369jrie0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DigitalWalletTokenTransitionParams.builder()
                .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                .status(DigitalWalletTokenTransitionParams.Status.SUSPENDED)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(DigitalWalletTokenTransitionParams.Status.SUSPENDED)
    }
}
