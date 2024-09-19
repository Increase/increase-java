// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundFundsHoldReleaseResponseTest {

    @Test
    fun createSimulationInboundFundsHoldReleaseResponse() {
        val simulationInboundFundsHoldReleaseResponse =
            SimulationInboundFundsHoldReleaseResponse.builder()
                .id("id")
                .amount(123L)
                .automaticallyReleasesAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(SimulationInboundFundsHoldReleaseResponse.Currency.CAD)
                .heldTransactionId("held_transaction_id")
                .pendingTransactionId("pending_transaction_id")
                .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SimulationInboundFundsHoldReleaseResponse.Status.HELD)
                .type(SimulationInboundFundsHoldReleaseResponse.Type.INBOUND_FUNDS_HOLD)
                .build()
        assertThat(simulationInboundFundsHoldReleaseResponse).isNotNull
        assertThat(simulationInboundFundsHoldReleaseResponse.id()).isEqualTo("id")
        assertThat(simulationInboundFundsHoldReleaseResponse.amount()).isEqualTo(123L)
        assertThat(simulationInboundFundsHoldReleaseResponse.automaticallyReleasesAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simulationInboundFundsHoldReleaseResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simulationInboundFundsHoldReleaseResponse.currency())
            .isEqualTo(SimulationInboundFundsHoldReleaseResponse.Currency.CAD)
        assertThat(simulationInboundFundsHoldReleaseResponse.heldTransactionId())
            .contains("held_transaction_id")
        assertThat(simulationInboundFundsHoldReleaseResponse.pendingTransactionId())
            .contains("pending_transaction_id")
        assertThat(simulationInboundFundsHoldReleaseResponse.releasedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simulationInboundFundsHoldReleaseResponse.status())
            .isEqualTo(SimulationInboundFundsHoldReleaseResponse.Status.HELD)
        assertThat(simulationInboundFundsHoldReleaseResponse.type())
            .isEqualTo(SimulationInboundFundsHoldReleaseResponse.Type.INBOUND_FUNDS_HOLD)
    }
}
