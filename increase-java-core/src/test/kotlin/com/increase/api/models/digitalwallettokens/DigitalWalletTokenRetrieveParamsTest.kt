// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenRetrieveParamsTest {

    @Test
    fun create() {
        DigitalWalletTokenRetrieveParams.builder()
            .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DigitalWalletTokenRetrieveParams.builder()
                .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("digital_wallet_token_izi62go3h51p369jrie0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
