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
import com.increase.api.models.BookkeepingAccountCreateParams
import com.increase.api.models.BookkeepingAccountCreateParams.BookkeepingAccountCreateBody

class BookkeepingAccountCreateParamsTest {

    @Test
    fun createBookkeepingAccountCreateParams() {
      BookkeepingAccountCreateParams.builder()
          .name("x")
          .accountId("account_id")
          .complianceCategory(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
          .entityId("entity_id")
          .build()
    }

    @Test
    fun getBody() {
      val params = BookkeepingAccountCreateParams.builder()
          .name("x")
          .accountId("account_id")
          .complianceCategory(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
          .entityId("entity_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("x")
      assertThat(body.accountId()).isEqualTo("account_id")
      assertThat(body.complianceCategory()).isEqualTo(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
      assertThat(body.entityId()).isEqualTo("entity_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = BookkeepingAccountCreateParams.builder()
          .name("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("x")
    }
}
