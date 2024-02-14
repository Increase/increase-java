// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityListParamsTest {

    @Test
    fun createEntityListParams() {
        EntityListParams.builder()
            .createdAt(
                EntityListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("string")
            .idempotencyKey("x")
            .limit(123L)
            .status(
                EntityListParams.Status.builder()
                    .in_(listOf(EntityListParams.Status.In.ACTIVE))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EntityListParams.builder()
                .createdAt(
                    EntityListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("string")
                .idempotencyKey("x")
                .limit(123L)
                .status(
                    EntityListParams.Status.builder()
                        .in_(listOf(EntityListParams.Status.In.ACTIVE))
                        .build()
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        EntityListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", listOf("string"))
        expected.put("idempotency_key", listOf("x"))
        expected.put("limit", listOf("123"))
        EntityListParams.Status.builder()
            .in_(listOf(EntityListParams.Status.In.ACTIVE))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EntityListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
