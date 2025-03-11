// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.digitalwallettokenrequests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalWalletTokenRequestCreateResponseTest {

    @Test
    fun createDigitalWalletTokenRequestCreateResponse() {
        val digitalWalletTokenRequestCreateResponse =
            DigitalWalletTokenRequestCreateResponse.builder()
                .declineReason(
                    DigitalWalletTokenRequestCreateResponse.DeclineReason.CARD_NOT_ACTIVE
                )
                .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                .type(
                    DigitalWalletTokenRequestCreateResponse.Type
                        .INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
                )
                .build()
        assertThat(digitalWalletTokenRequestCreateResponse).isNotNull
        assertThat(digitalWalletTokenRequestCreateResponse.declineReason())
            .contains(DigitalWalletTokenRequestCreateResponse.DeclineReason.CARD_NOT_ACTIVE)
        assertThat(digitalWalletTokenRequestCreateResponse.digitalWalletTokenId())
            .contains("digital_wallet_token_izi62go3h51p369jrie0")
        assertThat(digitalWalletTokenRequestCreateResponse.type())
            .isEqualTo(
                DigitalWalletTokenRequestCreateResponse.Type
                    .INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
            )
    }
}
