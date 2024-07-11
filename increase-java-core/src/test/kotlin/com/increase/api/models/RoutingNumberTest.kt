// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingNumberTest {

    @Test
    fun createRoutingNumber() {
        val routingNumber =
            RoutingNumber.builder()
                .achTransfers(RoutingNumber.AchTransfers.SUPPORTED)
                .name("name")
                .realTimePaymentsTransfers(RoutingNumber.RealTimePaymentsTransfers.SUPPORTED)
                .routingNumber("routing_number")
                .type(RoutingNumber.Type.ROUTING_NUMBER)
                .wireTransfers(RoutingNumber.WireTransfers.SUPPORTED)
                .build()
        assertThat(routingNumber).isNotNull
        assertThat(routingNumber.achTransfers()).isEqualTo(RoutingNumber.AchTransfers.SUPPORTED)
        assertThat(routingNumber.name()).isEqualTo("name")
        assertThat(routingNumber.realTimePaymentsTransfers())
            .isEqualTo(RoutingNumber.RealTimePaymentsTransfers.SUPPORTED)
        assertThat(routingNumber.routingNumber()).isEqualTo("routing_number")
        assertThat(routingNumber.type()).isEqualTo(RoutingNumber.Type.ROUTING_NUMBER)
        assertThat(routingNumber.wireTransfers()).isEqualTo(RoutingNumber.WireTransfers.SUPPORTED)
    }
}
