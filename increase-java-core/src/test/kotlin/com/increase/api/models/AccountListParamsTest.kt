// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountListParamsTest {

    @Test
    fun create() {
        AccountListParams.builder()
            .createdAt(
                AccountListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .entityId("entity_id")
            .idempotencyKey("x")
            .informationalEntityId("informational_entity_id")
            .limit(1L)
            .programId("program_id")
            .status(AccountListParams.Status.CLOSED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountListParams.builder()
                .createdAt(
                    AccountListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .entityId("entity_id")
                .idempotencyKey("x")
                .informationalEntityId("informational_entity_id")
                .limit(1L)
                .programId("program_id")
                .status(AccountListParams.Status.CLOSED)
                .build()
        val expected = QueryParams.builder()
        AccountListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("entity_id", "entity_id")
        expected.put("idempotency_key", "x")
        expected.put("informational_entity_id", "informational_entity_id")
        expected.put("limit", "1")
        expected.put("program_id", "program_id")
        expected.put("status", AccountListParams.Status.CLOSED.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
