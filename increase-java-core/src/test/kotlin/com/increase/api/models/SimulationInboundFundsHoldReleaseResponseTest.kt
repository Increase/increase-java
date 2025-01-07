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
                .id("inbound_funds_hold_9vuasmywdo7xb3zt4071")
                .amount(100L)
                .automaticallyReleasesAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .currency(SimulationInboundFundsHoldReleaseResponse.Currency.CAD)
                .heldTransactionId("transaction_uyrp7fld2ium70oa7oi")
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .releasedAt(null)
                .status(SimulationInboundFundsHoldReleaseResponse.Status.HELD)
                .type(SimulationInboundFundsHoldReleaseResponse.Type.INBOUND_FUNDS_HOLD)
                .build()
        assertThat(simulationInboundFundsHoldReleaseResponse).isNotNull
        assertThat(simulationInboundFundsHoldReleaseResponse.id())
            .isEqualTo("inbound_funds_hold_9vuasmywdo7xb3zt4071")
        assertThat(simulationInboundFundsHoldReleaseResponse.amount()).isEqualTo(100L)
        assertThat(simulationInboundFundsHoldReleaseResponse.automaticallyReleasesAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(simulationInboundFundsHoldReleaseResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(simulationInboundFundsHoldReleaseResponse.currency())
            .isEqualTo(SimulationInboundFundsHoldReleaseResponse.Currency.CAD)
        assertThat(simulationInboundFundsHoldReleaseResponse.heldTransactionId())
            .contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(simulationInboundFundsHoldReleaseResponse.pendingTransactionId())
            .contains("pending_transaction_k1sfetcau2qbvjbzgju4")
        assertThat(simulationInboundFundsHoldReleaseResponse.releasedAt()).isEmpty
        assertThat(simulationInboundFundsHoldReleaseResponse.status())
            .isEqualTo(SimulationInboundFundsHoldReleaseResponse.Status.HELD)
        assertThat(simulationInboundFundsHoldReleaseResponse.type())
            .isEqualTo(SimulationInboundFundsHoldReleaseResponse.Type.INBOUND_FUNDS_HOLD)
    }
}
