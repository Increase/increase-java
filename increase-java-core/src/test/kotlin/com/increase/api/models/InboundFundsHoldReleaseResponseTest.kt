package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundFundsHoldReleaseResponseTest {

    @Test
    fun createInboundFundsHoldReleaseResponse() {
        val inboundFundsHoldReleaseResponse =
            InboundFundsHoldReleaseResponse.builder()
                .amount(123L)
                .automaticallyReleasesAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(InboundFundsHoldReleaseResponse.Currency.CAD)
                .heldTransactionId("string")
                .pendingTransactionId("string")
                .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(InboundFundsHoldReleaseResponse.Status.HELD)
                .type(InboundFundsHoldReleaseResponse.Type.INBOUND_FUNDS_HOLD)
                .build()
        assertThat(inboundFundsHoldReleaseResponse).isNotNull
        assertThat(inboundFundsHoldReleaseResponse.amount()).isEqualTo(123L)
        assertThat(inboundFundsHoldReleaseResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundFundsHoldReleaseResponse.currency())
            .isEqualTo(InboundFundsHoldReleaseResponse.Currency.CAD)
        assertThat(inboundFundsHoldReleaseResponse.automaticallyReleasesAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundFundsHoldReleaseResponse.releasedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundFundsHoldReleaseResponse.status())
            .isEqualTo(InboundFundsHoldReleaseResponse.Status.HELD)
        assertThat(inboundFundsHoldReleaseResponse.heldTransactionId()).contains("string")
        assertThat(inboundFundsHoldReleaseResponse.pendingTransactionId()).contains("string")
        assertThat(inboundFundsHoldReleaseResponse.type())
            .isEqualTo(InboundFundsHoldReleaseResponse.Type.INBOUND_FUNDS_HOLD)
    }
}
