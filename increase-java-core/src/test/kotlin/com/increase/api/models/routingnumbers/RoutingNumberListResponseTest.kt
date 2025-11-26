// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingNumberListResponseTest {

    @Test
    fun create() {
        val routingNumberListResponse =
            RoutingNumberListResponse.builder()
                .achTransfers(RoutingNumberListResponse.AchTransfers.SUPPORTED)
                .fednowTransfers(RoutingNumberListResponse.FednowTransfers.SUPPORTED)
                .name("First Bank of the United States")
                .realTimePaymentsTransfers(
                    RoutingNumberListResponse.RealTimePaymentsTransfers.SUPPORTED
                )
                .routingNumber("021000021")
                .type(RoutingNumberListResponse.Type.ROUTING_NUMBER)
                .wireTransfers(RoutingNumberListResponse.WireTransfers.SUPPORTED)
                .build()

        assertThat(routingNumberListResponse.achTransfers())
            .isEqualTo(RoutingNumberListResponse.AchTransfers.SUPPORTED)
        assertThat(routingNumberListResponse.fednowTransfers())
            .isEqualTo(RoutingNumberListResponse.FednowTransfers.SUPPORTED)
        assertThat(routingNumberListResponse.name()).isEqualTo("First Bank of the United States")
        assertThat(routingNumberListResponse.realTimePaymentsTransfers())
            .isEqualTo(RoutingNumberListResponse.RealTimePaymentsTransfers.SUPPORTED)
        assertThat(routingNumberListResponse.routingNumber()).isEqualTo("021000021")
        assertThat(routingNumberListResponse.type())
            .isEqualTo(RoutingNumberListResponse.Type.ROUTING_NUMBER)
        assertThat(routingNumberListResponse.wireTransfers())
            .isEqualTo(RoutingNumberListResponse.WireTransfers.SUPPORTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingNumberListResponse =
            RoutingNumberListResponse.builder()
                .achTransfers(RoutingNumberListResponse.AchTransfers.SUPPORTED)
                .fednowTransfers(RoutingNumberListResponse.FednowTransfers.SUPPORTED)
                .name("First Bank of the United States")
                .realTimePaymentsTransfers(
                    RoutingNumberListResponse.RealTimePaymentsTransfers.SUPPORTED
                )
                .routingNumber("021000021")
                .type(RoutingNumberListResponse.Type.ROUTING_NUMBER)
                .wireTransfers(RoutingNumberListResponse.WireTransfers.SUPPORTED)
                .build()

        val roundtrippedRoutingNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingNumberListResponse),
                jacksonTypeRef<RoutingNumberListResponse>(),
            )

        assertThat(roundtrippedRoutingNumberListResponse).isEqualTo(routingNumberListResponse)
    }
}
