package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferReturnTest {

    @Test
    fun createInboundAchTransferReturn() {
        val inboundAchTransferReturn =
            InboundAchTransferReturn.builder()
                .id("string")
                .inboundAchTransferTransactionId("string")
                .reason(InboundAchTransferReturn.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER)
                .status(InboundAchTransferReturn.Status.PENDING_SUBMITTING)
                .submission(
                    InboundAchTransferReturn.Submission.builder()
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceNumber("string")
                        .build()
                )
                .transactionId("string")
                .type(InboundAchTransferReturn.Type.INBOUND_ACH_TRANSFER_RETURN)
                .build()
        assertThat(inboundAchTransferReturn).isNotNull
        assertThat(inboundAchTransferReturn.id()).isEqualTo("string")
        assertThat(inboundAchTransferReturn.inboundAchTransferTransactionId()).isEqualTo("string")
        assertThat(inboundAchTransferReturn.reason())
            .isEqualTo(InboundAchTransferReturn.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER)
        assertThat(inboundAchTransferReturn.status())
            .isEqualTo(InboundAchTransferReturn.Status.PENDING_SUBMITTING)
        assertThat(inboundAchTransferReturn.submission())
            .contains(
                InboundAchTransferReturn.Submission.builder()
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .traceNumber("string")
                    .build()
            )
        assertThat(inboundAchTransferReturn.transactionId()).contains("string")
        assertThat(inboundAchTransferReturn.type())
            .isEqualTo(InboundAchTransferReturn.Type.INBOUND_ACH_TRANSFER_RETURN)
    }
}
