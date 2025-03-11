// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionRetrieveParamsTest {

    @Test
    fun create() {
      EventSubscriptionRetrieveParams.builder()
          .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = EventSubscriptionRetrieveParams.builder()
          .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
          .build()
      assertThat(params).isNotNull
      // path param "eventSubscriptionId"
      assertThat(params.getPathParam(0)).isEqualTo("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
