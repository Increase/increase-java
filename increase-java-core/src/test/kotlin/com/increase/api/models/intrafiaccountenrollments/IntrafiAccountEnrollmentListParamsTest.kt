// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrafiAccountEnrollmentListParamsTest {

    @Test
    fun create() {
        IntrafiAccountEnrollmentListParams.builder()
            .accountId("account_id")
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .status(
                IntrafiAccountEnrollmentListParams.Status.builder()
                    .addIn(IntrafiAccountEnrollmentListParams.Status.In.PENDING_ENROLLING)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IntrafiAccountEnrollmentListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .status(
                    IntrafiAccountEnrollmentListParams.Status.builder()
                        .addIn(IntrafiAccountEnrollmentListParams.Status.In.PENDING_ENROLLING)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("cursor", "cursor")
                    .put("idempotency_key", "x")
                    .put("limit", "1")
                    .put("status.in", listOf("pending_enrolling").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IntrafiAccountEnrollmentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
