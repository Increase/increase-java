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
import com.increase.api.models.IntrafiExclusion

class IntrafiExclusionTest {

    @Test
    fun createIntrafiExclusion() {
      val intrafiExclusion = IntrafiExclusion.builder()
          .id("id")
          .bankName("bank_name")
          .entityId("entity_id")
          .excludedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .fdicCertificateNumber("fdic_certificate_number")
          .idempotencyKey("idempotency_key")
          .status(IntrafiExclusion.Status.PENDING)
          .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .type(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
          .build()
      assertThat(intrafiExclusion).isNotNull
      assertThat(intrafiExclusion.id()).isEqualTo("id")
      assertThat(intrafiExclusion.bankName()).isEqualTo("bank_name")
      assertThat(intrafiExclusion.entityId()).isEqualTo("entity_id")
      assertThat(intrafiExclusion.excludedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(intrafiExclusion.fdicCertificateNumber()).contains("fdic_certificate_number")
      assertThat(intrafiExclusion.idempotencyKey()).contains("idempotency_key")
      assertThat(intrafiExclusion.status()).isEqualTo(IntrafiExclusion.Status.PENDING)
      assertThat(intrafiExclusion.submittedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(intrafiExclusion.type()).isEqualTo(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
    }
}
