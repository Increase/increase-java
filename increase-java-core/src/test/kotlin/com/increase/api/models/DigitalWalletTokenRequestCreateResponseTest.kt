package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.DigitalWalletTokenRequestCreateResponse

class DigitalWalletTokenRequestCreateResponseTest {

    @Test
    fun createDigitalWalletTokenRequestCreateResponse() {
      val digitalWalletTokenRequestCreateResponse = DigitalWalletTokenRequestCreateResponse.builder()
          .declineReason(DigitalWalletTokenRequestCreateResponse.DeclineReason.CARD_NOT_ACTIVE)
          .digitalWalletTokenId("string")
          .type(DigitalWalletTokenRequestCreateResponse.Type.INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT)
          .build()
      assertThat(digitalWalletTokenRequestCreateResponse).isNotNull
      assertThat(digitalWalletTokenRequestCreateResponse.declineReason()).contains(DigitalWalletTokenRequestCreateResponse.DeclineReason.CARD_NOT_ACTIVE)
      assertThat(digitalWalletTokenRequestCreateResponse.digitalWalletTokenId()).contains("string")
      assertThat(digitalWalletTokenRequestCreateResponse.type()).isEqualTo(DigitalWalletTokenRequestCreateResponse.Type.INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT)
    }
}
