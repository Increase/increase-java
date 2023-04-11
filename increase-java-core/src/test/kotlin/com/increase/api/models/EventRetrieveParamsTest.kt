package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*

class EventRetrieveParamsTest {

    @Test
    fun createEventRetrieveParams() {
      EventRetrieveParams.builder()
          .eventId("string")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = EventRetrieveParams.builder()
          .eventId("string")
          .build()
      assertThat(params).isNotNull
      // path param "eventId"
      assertThat(params.getPathParam(0)).isEqualTo("string")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
