// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationPhysicalCardAdvanceShipmentParamsTest {

    @Test
    fun createSimulationPhysicalCardAdvanceShipmentParams() {
        SimulationPhysicalCardAdvanceShipmentParams.builder()
            .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
            .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationPhysicalCardAdvanceShipmentParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.shipmentStatus())
            .isEqualTo(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationPhysicalCardAdvanceShipmentParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.shipmentStatus())
            .isEqualTo(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationPhysicalCardAdvanceShipmentParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                .build()
        assertThat(params).isNotNull
        // path param "physicalCardId"
        assertThat(params.getPathParam(0)).isEqualTo("physical_card_ode8duyq5v2ynhjoharl")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
