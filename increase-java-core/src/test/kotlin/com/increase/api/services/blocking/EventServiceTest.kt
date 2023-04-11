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
import com.increase.api.services.blocking.EventService
import com.increase.api.models.EventListPage
import com.increase.api.models.EventListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class EventServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val eventService = client.events()
      val event = eventService.retrieve(EventRetrieveParams.builder()
          .eventId("string")
          .build())
      println(event)
      event.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val eventService = client.events()
      val eventList = eventService.list(EventListParams.builder().build())
      println(eventList)
      eventList.data().forEach {
          it.validate()
      }
    }
}
