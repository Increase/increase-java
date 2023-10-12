// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardPurchaseSupplementListParamsTest {

    @Test
    fun createCardPurchaseSupplementListParams() {
        CardPurchaseSupplementListParams.builder()
            .cardPaymentId("string")
            .createdAt(
                CardPurchaseSupplementListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("string")
            .limit(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CardPurchaseSupplementListParams.builder()
                .cardPaymentId("string")
                .createdAt(
                    CardPurchaseSupplementListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("string")
                .limit(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("card_payment_id", listOf("string"))
        CardPurchaseSupplementListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CardPurchaseSupplementListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
