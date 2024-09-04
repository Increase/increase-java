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
import com.increase.api.models.EventSubscriptionCreateParams
import com.increase.api.models.EventSubscriptionCreateParams.EventSubscriptionCreateBody

class EventSubscriptionCreateParamsTest {

    @Test
    fun createEventSubscriptionCreateParams() {
      EventSubscriptionCreateParams.builder()
          .url("url")
          .oauthConnectionId("oauth_connection_id")
          .selectedEventCategory(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
          .sharedSecret("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = EventSubscriptionCreateParams.builder()
          .url("url")
          .oauthConnectionId("oauth_connection_id")
          .selectedEventCategory(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
          .sharedSecret("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.url()).isEqualTo("url")
      assertThat(body.oauthConnectionId()).isEqualTo("oauth_connection_id")
      assertThat(body.selectedEventCategory()).isEqualTo(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
      assertThat(body.sharedSecret()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = EventSubscriptionCreateParams.builder()
          .url("url")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.url()).isEqualTo("url")
    }
}
