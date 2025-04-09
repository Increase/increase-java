// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDisputeListPageResponseTest {

    @Test
    fun create() {
        val cardDisputeListPageResponse =
            CardDisputeListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(cardDisputeListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(cardDisputeListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardDisputeListPageResponse =
            CardDisputeListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedCardDisputeListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardDisputeListPageResponse),
                jacksonTypeRef<CardDisputeListPageResponse>(),
            )

        assertThat(roundtrippedCardDisputeListPageResponse).isEqualTo(cardDisputeListPageResponse)
    }
}
