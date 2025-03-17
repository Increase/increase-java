// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionListParamsTest {

    @Test
    fun create() {
        EventSubscriptionListParams.builder().cursor("cursor").idempotencyKey("x").limit(1L).build()
    }

    @Test
    fun queryParams() {
        val params =
            EventSubscriptionListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventSubscriptionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
