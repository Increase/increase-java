package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDisputeTest {

    @Test
    fun createCardDispute() {
        val cardDispute =
            CardDispute.builder()
                .id("string")
                .acceptance(
                    CardDispute.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cardDisputeId("string")
                        .transactionId("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .disputedTransactionId("string")
                .explanation("string")
                .rejection(
                    CardDispute.Rejection.builder()
                        .cardDisputeId("string")
                        .explanation("string")
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .status(CardDispute.Status.PENDING_REVIEWING)
                .type(CardDispute.Type.CARD_DISPUTE)
                .build()
        assertThat(cardDispute).isNotNull
        assertThat(cardDispute.id()).isEqualTo("string")
        assertThat(cardDispute.acceptance())
            .contains(
                CardDispute.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cardDisputeId("string")
                    .transactionId("string")
                    .build()
            )
        assertThat(cardDispute.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cardDispute.disputedTransactionId()).isEqualTo("string")
        assertThat(cardDispute.explanation()).isEqualTo("string")
        assertThat(cardDispute.rejection())
            .contains(
                CardDispute.Rejection.builder()
                    .cardDisputeId("string")
                    .explanation("string")
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(cardDispute.status()).isEqualTo(CardDispute.Status.PENDING_REVIEWING)
        assertThat(cardDispute.type()).isEqualTo(CardDispute.Type.CARD_DISPUTE)
    }
}
