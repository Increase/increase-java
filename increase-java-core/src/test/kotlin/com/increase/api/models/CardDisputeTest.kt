// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDisputeTest {

    @Test
    fun createCardDispute() {
        val cardDispute =
            CardDispute.builder()
                .id("id")
                .acceptance(
                    CardDispute.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cardDisputeId("card_dispute_id")
                        .transactionId("transaction_id")
                        .build()
                )
                .amount(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .disputedTransactionId("disputed_transaction_id")
                .explanation("explanation")
                .idempotencyKey("idempotency_key")
                .loss(
                    CardDispute.Loss.builder()
                        .cardDisputeId("card_dispute_id")
                        .explanation("explanation")
                        .lostAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .rejection(
                    CardDispute.Rejection.builder()
                        .cardDisputeId("card_dispute_id")
                        .explanation("explanation")
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .status(CardDispute.Status.PENDING_REVIEWING)
                .type(CardDispute.Type.CARD_DISPUTE)
                .win(
                    CardDispute.Win.builder()
                        .cardDisputeId("card_dispute_id")
                        .wonAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        assertThat(cardDispute).isNotNull
        assertThat(cardDispute.id()).isEqualTo("id")
        assertThat(cardDispute.acceptance())
            .contains(
                CardDispute.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cardDisputeId("card_dispute_id")
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(cardDispute.amount()).contains(0L)
        assertThat(cardDispute.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cardDispute.disputedTransactionId()).isEqualTo("disputed_transaction_id")
        assertThat(cardDispute.explanation()).isEqualTo("explanation")
        assertThat(cardDispute.idempotencyKey()).contains("idempotency_key")
        assertThat(cardDispute.loss())
            .contains(
                CardDispute.Loss.builder()
                    .cardDisputeId("card_dispute_id")
                    .explanation("explanation")
                    .lostAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(cardDispute.rejection())
            .contains(
                CardDispute.Rejection.builder()
                    .cardDisputeId("card_dispute_id")
                    .explanation("explanation")
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(cardDispute.status()).isEqualTo(CardDispute.Status.PENDING_REVIEWING)
        assertThat(cardDispute.type()).isEqualTo(CardDispute.Type.CARD_DISPUTE)
        assertThat(cardDispute.win())
            .contains(
                CardDispute.Win.builder()
                    .cardDisputeId("card_dispute_id")
                    .wonAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
