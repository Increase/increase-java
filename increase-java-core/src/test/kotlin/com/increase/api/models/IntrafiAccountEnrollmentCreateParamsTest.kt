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
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams.IntrafiAccountEnrollmentCreateBody

class IntrafiAccountEnrollmentCreateParamsTest {

    @Test
    fun createIntrafiAccountEnrollmentCreateParams() {
      IntrafiAccountEnrollmentCreateParams.builder()
          .accountId("account_id")
          .emailAddress("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = IntrafiAccountEnrollmentCreateParams.builder()
          .accountId("account_id")
          .emailAddress("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("account_id")
      assertThat(body.emailAddress()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = IntrafiAccountEnrollmentCreateParams.builder()
          .accountId("account_id")
          .emailAddress("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("account_id")
      assertThat(body.emailAddress()).isEqualTo("x")
    }
}
