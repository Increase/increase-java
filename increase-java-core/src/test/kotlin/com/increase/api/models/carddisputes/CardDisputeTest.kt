// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDisputeTest {

    @Test
    fun createCardDispute() {
        val cardDispute =
            CardDispute.builder()
                .id("card_dispute_h9sc95nbl1cgltpp7men")
                .acceptance(
                    CardDispute.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cardDisputeId("card_dispute_id")
                        .transactionId("transaction_id")
                        .build()
                )
                .amount(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
                .explanation("Unauthorized recurring purchase")
                .idempotencyKey(null)
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
        assertThat(cardDispute.id()).isEqualTo("card_dispute_h9sc95nbl1cgltpp7men")
        assertThat(cardDispute.acceptance())
            .contains(
                CardDispute.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cardDisputeId("card_dispute_id")
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(cardDispute.amount()).isEmpty
        assertThat(cardDispute.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(cardDispute.disputedTransactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        assertThat(cardDispute.explanation()).isEqualTo("Unauthorized recurring purchase")
        assertThat(cardDispute.idempotencyKey()).isEmpty
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
