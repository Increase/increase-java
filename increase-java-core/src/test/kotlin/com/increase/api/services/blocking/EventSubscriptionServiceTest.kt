// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.eventsubscriptions.EventSubscriptionCreateParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionListParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionRetrieveParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EventSubscriptionServiceTest {

    @Test
    fun create() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val eventSubscriptionService = client.eventSubscriptions()

      val eventSubscription = eventSubscriptionService.create(EventSubscriptionCreateParams.builder()
          .url("https://website.com/webhooks")
          .oauthConnectionId("x")
          .selectedEventCategory(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
          .sharedSecret("x")
          .build())

      eventSubscription.validate()
    }

    @Test
    fun retrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val eventSubscriptionService = client.eventSubscriptions()

      val eventSubscription = eventSubscriptionService.retrieve(EventSubscriptionRetrieveParams.builder()
          .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
          .build())

      eventSubscription.validate()
    }

    @Test
    fun update() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val eventSubscriptionService = client.eventSubscriptions()

      val eventSubscription = eventSubscriptionService.update(EventSubscriptionUpdateParams.builder()
          .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
          .status(EventSubscriptionUpdateParams.Status.ACTIVE)
          .build())

      eventSubscription.validate()
    }

    @Test
    fun list() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val eventSubscriptionService = client.eventSubscriptions()

      val page = eventSubscriptionService.list()

      page.response().validate()
    }
}
