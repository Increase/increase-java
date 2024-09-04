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
import com.increase.api.models.CardDisputeRetrieveParams

class CardDisputeRetrieveParamsTest {

    @Test
    fun createCardDisputeRetrieveParams() {
      CardDisputeRetrieveParams.builder()
          .cardDisputeId("card_dispute_id")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = CardDisputeRetrieveParams.builder()
          .cardDisputeId("card_dispute_id")
          .build()
      assertThat(params).isNotNull
      // path param "cardDisputeId"
      assertThat(params.getPathParam(0)).isEqualTo("card_dispute_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
