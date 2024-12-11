// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoutingNumberListResponseTest {

    @Test
    fun createRoutingNumberListResponse() {
        val routingNumberListResponse =
            RoutingNumberListResponse.builder()
                .achTransfers(RoutingNumberListResponse.AchTransfers.SUPPORTED)
                .name("Chase")
                .realTimePaymentsTransfers(
                    RoutingNumberListResponse.RealTimePaymentsTransfers.SUPPORTED
                )
                .routingNumber("021000021")
                .type(RoutingNumberListResponse.Type.ROUTING_NUMBER)
                .wireTransfers(RoutingNumberListResponse.WireTransfers.SUPPORTED)
                .build()
        assertThat(routingNumberListResponse).isNotNull
        assertThat(routingNumberListResponse.achTransfers())
            .isEqualTo(RoutingNumberListResponse.AchTransfers.SUPPORTED)
        assertThat(routingNumberListResponse.name()).isEqualTo("Chase")
        assertThat(routingNumberListResponse.realTimePaymentsTransfers())
            .isEqualTo(RoutingNumberListResponse.RealTimePaymentsTransfers.SUPPORTED)
        assertThat(routingNumberListResponse.routingNumber()).isEqualTo("021000021")
        assertThat(routingNumberListResponse.type())
            .isEqualTo(RoutingNumberListResponse.Type.ROUTING_NUMBER)
        assertThat(routingNumberListResponse.wireTransfers())
            .isEqualTo(RoutingNumberListResponse.WireTransfers.SUPPORTED)
    }
}
