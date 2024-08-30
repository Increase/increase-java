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
import com.increase.api.models.IntrafiAccountEnrollment

class IntrafiAccountEnrollmentTest {

    @Test
    fun createIntrafiAccountEnrollment() {
      val intrafiAccountEnrollment = IntrafiAccountEnrollment.builder()
          .id("id")
          .accountId("account_id")
          .idempotencyKey("idempotency_key")
          .intrafiId("intrafi_id")
          .status(IntrafiAccountEnrollment.Status.PENDING_ENROLLING)
          .type(IntrafiAccountEnrollment.Type.INTRAFI_ACCOUNT_ENROLLMENT)
          .build()
      assertThat(intrafiAccountEnrollment).isNotNull
      assertThat(intrafiAccountEnrollment.id()).isEqualTo("id")
      assertThat(intrafiAccountEnrollment.accountId()).isEqualTo("account_id")
      assertThat(intrafiAccountEnrollment.idempotencyKey()).contains("idempotency_key")
      assertThat(intrafiAccountEnrollment.intrafiId()).isEqualTo("intrafi_id")
      assertThat(intrafiAccountEnrollment.status()).isEqualTo(IntrafiAccountEnrollment.Status.PENDING_ENROLLING)
      assertThat(intrafiAccountEnrollment.type()).isEqualTo(IntrafiAccountEnrollment.Type.INTRAFI_ACCOUNT_ENROLLMENT)
    }
}
