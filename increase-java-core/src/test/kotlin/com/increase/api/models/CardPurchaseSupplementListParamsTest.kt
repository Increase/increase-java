// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardPurchaseSupplementListParamsTest {

    @Test
    fun create() {
        CardPurchaseSupplementListParams.builder()
            .cardPaymentId("card_payment_id")
            .createdAt(
                CardPurchaseSupplementListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CardPurchaseSupplementListParams.builder()
                .cardPaymentId("card_payment_id")
                .createdAt(
                    CardPurchaseSupplementListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("card_payment_id", "card_payment_id")
        CardPurchaseSupplementListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CardPurchaseSupplementListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
