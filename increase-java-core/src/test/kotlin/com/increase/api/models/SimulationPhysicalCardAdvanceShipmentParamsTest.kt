// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationPhysicalCardAdvanceShipmentParamsTest {

    @Test
    fun create() {
        SimulationPhysicalCardAdvanceShipmentParams.builder()
            .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
            .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
            .build()
    }

    @Test
    fun body() {
        val params =
            SimulationPhysicalCardAdvanceShipmentParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.shipmentStatus())
            .isEqualTo(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationPhysicalCardAdvanceShipmentParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                .build()
        val body = params._body()
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
