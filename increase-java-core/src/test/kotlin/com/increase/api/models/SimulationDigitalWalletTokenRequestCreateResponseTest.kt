// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationDigitalWalletTokenRequestCreateResponseTest {

    @Test
    fun createSimulationDigitalWalletTokenRequestCreateResponse() {
        val simulationDigitalWalletTokenRequestCreateResponse =
            SimulationDigitalWalletTokenRequestCreateResponse.builder()
                .declineReason(
                    SimulationDigitalWalletTokenRequestCreateResponse.DeclineReason.CARD_NOT_ACTIVE
                )
                .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                .type(
                    SimulationDigitalWalletTokenRequestCreateResponse.Type
                        .INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
                )
                .build()
        assertThat(simulationDigitalWalletTokenRequestCreateResponse).isNotNull
        assertThat(simulationDigitalWalletTokenRequestCreateResponse.declineReason())
            .contains(
                SimulationDigitalWalletTokenRequestCreateResponse.DeclineReason.CARD_NOT_ACTIVE
            )
        assertThat(simulationDigitalWalletTokenRequestCreateResponse.digitalWalletTokenId())
            .contains("digital_wallet_token_izi62go3h51p369jrie0")
        assertThat(simulationDigitalWalletTokenRequestCreateResponse.type())
            .isEqualTo(
                SimulationDigitalWalletTokenRequestCreateResponse.Type
                    .INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
            )
    }
}
