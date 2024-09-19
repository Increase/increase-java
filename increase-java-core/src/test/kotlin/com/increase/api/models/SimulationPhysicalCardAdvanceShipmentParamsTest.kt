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
import com.increase.api.models.SimulationPhysicalCardAdvanceShipmentParams
import com.increase.api.models.SimulationPhysicalCardAdvanceShipmentParams.SimulationPhysicalCardAdvanceShipmentBody

class SimulationPhysicalCardAdvanceShipmentParamsTest {

    @Test
    fun createSimulationPhysicalCardAdvanceShipmentParams() {
      SimulationPhysicalCardAdvanceShipmentParams.builder()
          .physicalCardId("physical_card_id")
          .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationPhysicalCardAdvanceShipmentParams.builder()
          .physicalCardId("physical_card_id")
          .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.shipmentStatus()).isEqualTo(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationPhysicalCardAdvanceShipmentParams.builder()
          .physicalCardId("physical_card_id")
          .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.shipmentStatus()).isEqualTo(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
    }

    @Test
    fun getPathParam() {
      val params = SimulationPhysicalCardAdvanceShipmentParams.builder()
          .physicalCardId("physical_card_id")
          .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
          .build()
      assertThat(params).isNotNull
      // path param "physicalCardId"
      assertThat(params.getPathParam(0)).isEqualTo("physical_card_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
