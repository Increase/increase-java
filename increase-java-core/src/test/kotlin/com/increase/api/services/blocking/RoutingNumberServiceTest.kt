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
import com.increase.api.services.blocking.RoutingNumberService
import com.increase.api.models.RoutingNumberListPage
import com.increase.api.models.RoutingNumberListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class RoutingNumberServiceTest {

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val routingNumberService = client.routingNumbers()
      val routingNumberList = routingNumberService.list(RoutingNumberListParams.builder()
          .routingNumber("xxxxxxxxx")
          .build())
      println(routingNumberList)
      routingNumberList.data().forEach {
          it.validate()
      }
    }
}
