// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.physicalcards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardAdvanceShipmentParamsTest {

    @Test
    fun create() {
        PhysicalCardAdvanceShipmentParams.builder()
            .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
            .shipmentStatus(PhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhysicalCardAdvanceShipmentParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .shipmentStatus(PhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("physical_card_ode8duyq5v2ynhjoharl")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhysicalCardAdvanceShipmentParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .shipmentStatus(PhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                .build()

        val body = params._body()

        assertThat(body.shipmentStatus())
            .isEqualTo(PhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
    }
}
