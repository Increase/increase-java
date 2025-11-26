// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingNumberListPageResponseTest {

    @Test
    fun create() {
        val routingNumberListPageResponse =
            RoutingNumberListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(routingNumberListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(routingNumberListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingNumberListPageResponse =
            RoutingNumberListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedRoutingNumberListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingNumberListPageResponse),
                jacksonTypeRef<RoutingNumberListPageResponse>(),
            )

        assertThat(roundtrippedRoutingNumberListPageResponse)
            .isEqualTo(routingNumberListPageResponse)
    }
}
