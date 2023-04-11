package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*

class AchPrenotificationRetrieveParamsTest {

    @Test
    fun createAchPrenotificationRetrieveParams() {
      AchPrenotificationRetrieveParams.builder()
          .achPrenotificationId("string")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = AchPrenotificationRetrieveParams.builder()
          .achPrenotificationId("string")
          .build()
      assertThat(params).isNotNull
      // path param "achPrenotificationId"
      assertThat(params.getPathParam(0)).isEqualTo("string")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
