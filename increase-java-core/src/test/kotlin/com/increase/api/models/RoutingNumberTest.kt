package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingNumberTest {

    @Test
    fun createRoutingNumber() {
        val routingNumber =
            RoutingNumber.builder()
                .achTransfers(RoutingNumber.AchTransfers.SUPPORTED)
                .name("string")
                .realTimePaymentsTransfers(RoutingNumber.RealTimePaymentsTransfers.SUPPORTED)
                .routingNumber("string")
                .type(RoutingNumber.Type.ROUTING_NUMBER)
                .wireTransfers(RoutingNumber.WireTransfers.SUPPORTED)
                .build()
        assertThat(routingNumber).isNotNull
        assertThat(routingNumber.achTransfers()).isEqualTo(RoutingNumber.AchTransfers.SUPPORTED)
        assertThat(routingNumber.name()).isEqualTo("string")
        assertThat(routingNumber.realTimePaymentsTransfers())
            .isEqualTo(RoutingNumber.RealTimePaymentsTransfers.SUPPORTED)
        assertThat(routingNumber.routingNumber()).isEqualTo("string")
        assertThat(routingNumber.type()).isEqualTo(RoutingNumber.Type.ROUTING_NUMBER)
        assertThat(routingNumber.wireTransfers()).isEqualTo(RoutingNumber.WireTransfers.SUPPORTED)
    }
}
