// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiAccountEnrollmentListParamsTest {

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
        val expected = QueryParams.builder()
        expected.put("account_id", "account_id")
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        IntrafiAccountEnrollmentListParams.Status.builder()
            .addIn(IntrafiAccountEnrollmentListParams.Status.In.PENDING_ENROLLING)
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IntrafiAccountEnrollmentListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
