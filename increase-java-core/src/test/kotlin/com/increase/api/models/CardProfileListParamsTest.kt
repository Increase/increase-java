package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardProfileListParamsTest {

    @Test
    fun createCardProfileListParams() {
        CardProfileListParams.builder()
            .cursor("string")
            .limit(123L)
            .status(
                CardProfileListParams.Status.builder()
                    .in_(listOf(CardProfileListParams.Status.In.PENDING))
                    .build()
            )
            .physicalCardsStatus(
                CardProfileListParams.PhysicalCardsStatus.builder()
                    .in_(listOf(CardProfileListParams.PhysicalCardsStatus.In.NOT_ELIGIBLE))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CardProfileListParams.builder()
                .cursor("string")
                .limit(123L)
                .status(
                    CardProfileListParams.Status.builder()
                        .in_(listOf(CardProfileListParams.Status.In.PENDING))
                        .build()
                )
                .physicalCardsStatus(
                    CardProfileListParams.PhysicalCardsStatus.builder()
                        .in_(listOf(CardProfileListParams.PhysicalCardsStatus.In.NOT_ELIGIBLE))
                        .build()
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        CardProfileListParams.Status.builder()
            .in_(listOf(CardProfileListParams.Status.In.PENDING))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        CardProfileListParams.PhysicalCardsStatus.builder()
            .in_(listOf(CardProfileListParams.PhysicalCardsStatus.In.NOT_ELIGIBLE))
            .build()
            .forEachQueryParam { key, values -> expected.put("physical_cards_status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CardProfileListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
