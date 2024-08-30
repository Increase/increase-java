// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateResponse

class SimulationDigitalWalletTokenRequestCreateResponseTest {

    @Test
    fun createSimulationDigitalWalletTokenRequestCreateResponse() {
      val simulationDigitalWalletTokenRequestCreateResponse = SimulationDigitalWalletTokenRequestCreateResponse.builder()
          .declineReason(SimulationDigitalWalletTokenRequestCreateResponse.DeclineReason.CARD_NOT_ACTIVE)
          .digitalWalletTokenId("digital_wallet_token_id")
          .type(SimulationDigitalWalletTokenRequestCreateResponse.Type.INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT)
          .build()
      assertThat(simulationDigitalWalletTokenRequestCreateResponse).isNotNull
      assertThat(simulationDigitalWalletTokenRequestCreateResponse.declineReason()).contains(SimulationDigitalWalletTokenRequestCreateResponse.DeclineReason.CARD_NOT_ACTIVE)
      assertThat(simulationDigitalWalletTokenRequestCreateResponse.digitalWalletTokenId()).contains("digital_wallet_token_id")
      assertThat(simulationDigitalWalletTokenRequestCreateResponse.type()).isEqualTo(SimulationDigitalWalletTokenRequestCreateResponse.Type.INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT)
    }
}
