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
                .addData(
                    RoutingNumberListResponse.Data.builder()
                        .achTransfers(RoutingNumberListResponse.Data.AchTransfers.SUPPORTED)
                        .fednowTransfers(RoutingNumberListResponse.Data.FednowTransfers.SUPPORTED)
                        .name("First Bank of the United States")
                        .realTimePaymentsTransfers(
                            RoutingNumberListResponse.Data.RealTimePaymentsTransfers.SUPPORTED
                        )
                        .routingNumber("021000021")
                        .type(RoutingNumberListResponse.Data.Type.ROUTING_NUMBER)
                        .wireTransfers(RoutingNumberListResponse.Data.WireTransfers.SUPPORTED)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(routingNumberListResponse.data())
            .containsExactly(
                RoutingNumberListResponse.Data.builder()
                    .achTransfers(RoutingNumberListResponse.Data.AchTransfers.SUPPORTED)
                    .fednowTransfers(RoutingNumberListResponse.Data.FednowTransfers.SUPPORTED)
                    .name("First Bank of the United States")
                    .realTimePaymentsTransfers(
                        RoutingNumberListResponse.Data.RealTimePaymentsTransfers.SUPPORTED
                    )
                    .routingNumber("021000021")
                    .type(RoutingNumberListResponse.Data.Type.ROUTING_NUMBER)
                    .wireTransfers(RoutingNumberListResponse.Data.WireTransfers.SUPPORTED)
                    .build()
            )
        assertThat(routingNumberListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingNumberListResponse =
            RoutingNumberListResponse.builder()
                .addData(
                    RoutingNumberListResponse.Data.builder()
                        .achTransfers(RoutingNumberListResponse.Data.AchTransfers.SUPPORTED)
                        .fednowTransfers(RoutingNumberListResponse.Data.FednowTransfers.SUPPORTED)
                        .name("First Bank of the United States")
                        .realTimePaymentsTransfers(
                            RoutingNumberListResponse.Data.RealTimePaymentsTransfers.SUPPORTED
                        )
                        .routingNumber("021000021")
                        .type(RoutingNumberListResponse.Data.Type.ROUTING_NUMBER)
                        .wireTransfers(RoutingNumberListResponse.Data.WireTransfers.SUPPORTED)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedRoutingNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingNumberListResponse),
                jacksonTypeRef<RoutingNumberListResponse>(),
            )

        assertThat(roundtrippedRoutingNumberListResponse).isEqualTo(routingNumberListResponse)
    }
}
