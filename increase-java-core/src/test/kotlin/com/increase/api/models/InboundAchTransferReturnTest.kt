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
                .transactionId("string")
                .status(InboundAchTransferReturn.Status.PENDING_SUBMITTING)
                .reason(InboundAchTransferReturn.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER)
                .submission(
                    InboundAchTransferReturn.Submission.builder()
                        .traceNumber("string")
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(InboundAchTransferReturn.Type.INBOUND_ACH_TRANSFER_RETURN)
                .build()
        assertThat(inboundAchTransferReturn).isNotNull
        assertThat(inboundAchTransferReturn.id()).isEqualTo("string")
        assertThat(inboundAchTransferReturn.inboundAchTransferTransactionId()).isEqualTo("string")
        assertThat(inboundAchTransferReturn.transactionId()).contains("string")
        assertThat(inboundAchTransferReturn.status())
            .isEqualTo(InboundAchTransferReturn.Status.PENDING_SUBMITTING)
        assertThat(inboundAchTransferReturn.reason())
            .isEqualTo(InboundAchTransferReturn.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER)
        assertThat(inboundAchTransferReturn.submission())
            .contains(
                InboundAchTransferReturn.Submission.builder()
                    .traceNumber("string")
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(inboundAchTransferReturn.type())
            .isEqualTo(InboundAchTransferReturn.Type.INBOUND_ACH_TRANSFER_RETURN)
    }
}
