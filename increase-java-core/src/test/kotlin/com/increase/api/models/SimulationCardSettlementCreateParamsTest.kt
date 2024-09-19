// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.increase.api.core.ContentTypes
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.models.*
import com.increase.api.models.SimulationCardSettlementCreateParams
import com.increase.api.models.SimulationCardSettlementCreateParams.SimulationCardSettlementCreateBody

class SimulationCardSettlementCreateParamsTest {

    @Test
    fun createSimulationCardSettlementCreateParams() {
      SimulationCardSettlementCreateParams.builder()
          .cardId("card_id")
          .pendingTransactionId("pending_transaction_id")
          .amount(123L)
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationCardSettlementCreateParams.builder()
          .cardId("card_id")
          .pendingTransactionId("pending_transaction_id")
          .amount(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cardId()).isEqualTo("card_id")
      assertThat(body.pendingTransactionId()).isEqualTo("pending_transaction_id")
      assertThat(body.amount()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationCardSettlementCreateParams.builder()
          .cardId("card_id")
          .pendingTransactionId("pending_transaction_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cardId()).isEqualTo("card_id")
      assertThat(body.pendingTransactionId()).isEqualTo("pending_transaction_id")
    }
}
