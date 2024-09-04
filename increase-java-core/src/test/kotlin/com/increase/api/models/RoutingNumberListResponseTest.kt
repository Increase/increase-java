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
import com.increase.api.models.RoutingNumberListResponse

class RoutingNumberListResponseTest {

    @Test
    fun createRoutingNumberListResponse() {
      val routingNumberListResponse = RoutingNumberListResponse.builder()
          .achTransfers(RoutingNumberListResponse.AchTransfers.SUPPORTED)
          .name("name")
          .realTimePaymentsTransfers(RoutingNumberListResponse.RealTimePaymentsTransfers.SUPPORTED)
          .routingNumber("routing_number")
          .type(RoutingNumberListResponse.Type.ROUTING_NUMBER)
          .wireTransfers(RoutingNumberListResponse.WireTransfers.SUPPORTED)
          .build()
      assertThat(routingNumberListResponse).isNotNull
      assertThat(routingNumberListResponse.achTransfers()).isEqualTo(RoutingNumberListResponse.AchTransfers.SUPPORTED)
      assertThat(routingNumberListResponse.name()).isEqualTo("name")
      assertThat(routingNumberListResponse.realTimePaymentsTransfers()).isEqualTo(RoutingNumberListResponse.RealTimePaymentsTransfers.SUPPORTED)
      assertThat(routingNumberListResponse.routingNumber()).isEqualTo("routing_number")
      assertThat(routingNumberListResponse.type()).isEqualTo(RoutingNumberListResponse.Type.ROUTING_NUMBER)
      assertThat(routingNumberListResponse.wireTransfers()).isEqualTo(RoutingNumberListResponse.WireTransfers.SUPPORTED)
    }
}
