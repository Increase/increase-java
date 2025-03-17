// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundfundsholds

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundFundsHoldReleaseResponseTest {

    @Test
    fun createInboundFundsHoldReleaseResponse() {
        val inboundFundsHoldReleaseResponse =
            InboundFundsHoldReleaseResponse.builder()
                .id("inbound_funds_hold_9vuasmywdo7xb3zt4071")
                .amount(100L)
                .automaticallyReleasesAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .currency(InboundFundsHoldReleaseResponse.Currency.CAD)
                .heldTransactionId("transaction_uyrp7fld2ium70oa7oi")
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .releasedAt(null)
                .status(InboundFundsHoldReleaseResponse.Status.HELD)
                .type(InboundFundsHoldReleaseResponse.Type.INBOUND_FUNDS_HOLD)
                .build()
        assertThat(inboundFundsHoldReleaseResponse).isNotNull
        assertThat(inboundFundsHoldReleaseResponse.id())
            .isEqualTo("inbound_funds_hold_9vuasmywdo7xb3zt4071")
        assertThat(inboundFundsHoldReleaseResponse.amount()).isEqualTo(100L)
        assertThat(inboundFundsHoldReleaseResponse.automaticallyReleasesAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundFundsHoldReleaseResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundFundsHoldReleaseResponse.currency())
            .isEqualTo(InboundFundsHoldReleaseResponse.Currency.CAD)
        assertThat(inboundFundsHoldReleaseResponse.heldTransactionId())
            .contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(inboundFundsHoldReleaseResponse.pendingTransactionId())
            .contains("pending_transaction_k1sfetcau2qbvjbzgju4")
        assertThat(inboundFundsHoldReleaseResponse.releasedAt()).isEmpty
        assertThat(inboundFundsHoldReleaseResponse.status())
            .isEqualTo(InboundFundsHoldReleaseResponse.Status.HELD)
        assertThat(inboundFundsHoldReleaseResponse.type())
            .isEqualTo(InboundFundsHoldReleaseResponse.Type.INBOUND_FUNDS_HOLD)
    }
}
