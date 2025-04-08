// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.digitalwallettokenrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenRequestCreateResponseTest {

    @Test
    fun create() {
        val digitalWalletTokenRequestCreateResponse =
            DigitalWalletTokenRequestCreateResponse.builder()
                .declineReason(null)
                .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                .type(
                    DigitalWalletTokenRequestCreateResponse.Type
                        .INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
                )
                .build()

        assertThat(digitalWalletTokenRequestCreateResponse.declineReason()).isEmpty
        assertThat(digitalWalletTokenRequestCreateResponse.digitalWalletTokenId())
            .contains("digital_wallet_token_izi62go3h51p369jrie0")
        assertThat(digitalWalletTokenRequestCreateResponse.type())
            .isEqualTo(
                DigitalWalletTokenRequestCreateResponse.Type
                    .INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalWalletTokenRequestCreateResponse =
            DigitalWalletTokenRequestCreateResponse.builder()
                .declineReason(null)
                .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                .type(
                    DigitalWalletTokenRequestCreateResponse.Type
                        .INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
                )
                .build()

        val roundtrippedDigitalWalletTokenRequestCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalWalletTokenRequestCreateResponse),
                jacksonTypeRef<DigitalWalletTokenRequestCreateResponse>(),
            )

        assertThat(roundtrippedDigitalWalletTokenRequestCreateResponse)
            .isEqualTo(digitalWalletTokenRequestCreateResponse)
    }
}
