package com.increase.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.services.blocking.EventSubscriptionService
import com.increase.api.models.EventSubscriptionListPage
import com.increase.api.models.EventSubscriptionListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class EventSubscriptionServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val eventSubscriptionService = client.eventSubscriptions()
      val eventSubscription = eventSubscriptionService.create(EventSubscriptionCreateParams.builder()
          .url("string")
          .sharedSecret("x")
          .selectedEventCategory(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
          .build())
      println(eventSubscription)
      eventSubscription.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val eventSubscriptionService = client.eventSubscriptions()
      val eventSubscription = eventSubscriptionService.retrieve(EventSubscriptionRetrieveParams.builder()
          .eventSubscriptionId("string")
          .build())
      println(eventSubscription)
      eventSubscription.validate()
    }

    @Test
    fun callUpdate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val eventSubscriptionService = client.eventSubscriptions()
      val eventSubscription = eventSubscriptionService.update(EventSubscriptionUpdateParams.builder()
          .eventSubscriptionId("string")
          .status(EventSubscriptionUpdateParams.Status.ACTIVE)
          .build())
      println(eventSubscription)
      eventSubscription.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val eventSubscriptionService = client.eventSubscriptions()
      val eventSubscriptionList = eventSubscriptionService.list(EventSubscriptionListParams.builder().build())
      println(eventSubscriptionList)
      eventSubscriptionList.data().forEach {
          it.validate()
      }
    }
}
