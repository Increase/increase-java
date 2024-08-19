// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalWalletTokenRetrieveParamsTest {

    @Test
    fun createDigitalWalletTokenRetrieveParams() {
        DigitalWalletTokenRetrieveParams.builder()
            .digitalWalletTokenId("digital_wallet_token_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            DigitalWalletTokenRetrieveParams.builder()
                .digitalWalletTokenId("digital_wallet_token_id")
                .build()
        assertThat(params).isNotNull
        // path param "digitalWalletTokenId"
        assertThat(params.getPathParam(0)).isEqualTo("digital_wallet_token_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
