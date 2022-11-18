package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingNumberTest {

    @Test
    fun createRoutingNumber() {
        val routingNumber =
            RoutingNumber.builder()
                .name("string")
                .routingNumber("string")
                .type(RoutingNumber.Type.ROUTING_NUMBER)
                .achTransfers(RoutingNumber.AchTransfers.SUPPORTED)
                .realTimePaymentsTransfers(RoutingNumber.RealTimePaymentsTransfers.SUPPORTED)
                .wireTransfers(RoutingNumber.WireTransfers.SUPPORTED)
                .build()
        assertThat(routingNumber).isNotNull
        assertThat(routingNumber.name()).isEqualTo("string")
        assertThat(routingNumber.routingNumber()).isEqualTo("string")
        assertThat(routingNumber.type()).isEqualTo(RoutingNumber.Type.ROUTING_NUMBER)
        assertThat(routingNumber.achTransfers()).isEqualTo(RoutingNumber.AchTransfers.SUPPORTED)
        assertThat(routingNumber.realTimePaymentsTransfers())
            .isEqualTo(RoutingNumber.RealTimePaymentsTransfers.SUPPORTED)
        assertThat(routingNumber.wireTransfers()).isEqualTo(RoutingNumber.WireTransfers.SUPPORTED)
    }
}
