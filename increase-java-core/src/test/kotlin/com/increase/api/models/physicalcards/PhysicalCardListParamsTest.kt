// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardListParamsTest {

    @Test
    fun create() {
        PhysicalCardListParams.builder()
            .cardId("card_id")
            .createdAt(
                PhysicalCardListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PhysicalCardListParams.builder()
                .cardId("card_id")
                .createdAt(
                    PhysicalCardListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("card_id", "card_id")
                    .put("created_at.after", "2019-12-27T18:11:19.117Z")
                    .put("created_at.before", "2019-12-27T18:11:19.117Z")
                    .put("created_at.on_or_after", "2019-12-27T18:11:19.117Z")
                    .put("created_at.on_or_before", "2019-12-27T18:11:19.117Z")
                    .put("cursor", "cursor")
                    .put("idempotency_key", "x")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhysicalCardListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
