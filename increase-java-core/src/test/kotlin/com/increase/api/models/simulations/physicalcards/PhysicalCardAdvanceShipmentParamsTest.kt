// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.physicalcards

import kotlin.test.assertNotNull
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
    fun body() {
        val params =
            PhysicalCardAdvanceShipmentParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .shipmentStatus(PhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.shipmentStatus())
            .isEqualTo(PhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhysicalCardAdvanceShipmentParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .shipmentStatus(PhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.shipmentStatus())
            .isEqualTo(PhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
    }

    @Test
    fun getPathParam() {
        val params =
            PhysicalCardAdvanceShipmentParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .shipmentStatus(PhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                .build()
        assertThat(params).isNotNull
        // path param "physicalCardId"
        assertThat(params.getPathParam(0)).isEqualTo("physical_card_ode8duyq5v2ynhjoharl")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
