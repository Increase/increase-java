// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationPhysicalCardShipmentAdvanceParamsTest {

    @Test
    fun createSimulationPhysicalCardShipmentAdvanceParams() {
        SimulationPhysicalCardShipmentAdvanceParams.builder()
            .physicalCardId("string")
            .shipmentStatus(SimulationPhysicalCardShipmentAdvanceParams.ShipmentStatus.PENDING)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationPhysicalCardShipmentAdvanceParams.builder()
                .physicalCardId("string")
                .shipmentStatus(SimulationPhysicalCardShipmentAdvanceParams.ShipmentStatus.PENDING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.shipmentStatus())
            .isEqualTo(SimulationPhysicalCardShipmentAdvanceParams.ShipmentStatus.PENDING)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationPhysicalCardShipmentAdvanceParams.builder()
                .physicalCardId("string")
                .shipmentStatus(SimulationPhysicalCardShipmentAdvanceParams.ShipmentStatus.PENDING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.shipmentStatus())
            .isEqualTo(SimulationPhysicalCardShipmentAdvanceParams.ShipmentStatus.PENDING)
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationPhysicalCardShipmentAdvanceParams.builder()
                .physicalCardId("string")
                .shipmentStatus(SimulationPhysicalCardShipmentAdvanceParams.ShipmentStatus.PENDING)
                .build()
        assertThat(params).isNotNull
        // path param "physicalCardId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
