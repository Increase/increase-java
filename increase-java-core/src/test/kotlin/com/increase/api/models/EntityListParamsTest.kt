// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityListParamsTest {

    @Test
    fun create() {
        EntityListParams.builder()
            .createdAt(
                EntityListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .status(
                EntityListParams.Status.builder().addIn(EntityListParams.Status.In.ACTIVE).build()
            )
            .build()
    }

    @Test
    fun queryParams() {
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
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .status(
                    EntityListParams.Status.builder()
                        .addIn(EntityListParams.Status.In.ACTIVE)
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        EntityListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        EntityListParams.Status.builder()
            .addIn(EntityListParams.Status.In.ACTIVE)
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EntityListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
