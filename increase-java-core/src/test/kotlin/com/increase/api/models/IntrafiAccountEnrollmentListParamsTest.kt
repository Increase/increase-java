// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiAccountEnrollmentListParamsTest {

    @Test
    fun createIntrafiAccountEnrollmentListParams() {
        IntrafiAccountEnrollmentListParams.builder()
            .accountId("account_id")
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(123L)
            .status(
                IntrafiAccountEnrollmentListParams.Status.builder()
                    .in_(listOf(IntrafiAccountEnrollmentListParams.Status.In.PENDING_ENROLLING))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            IntrafiAccountEnrollmentListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(123L)
                .status(
                    IntrafiAccountEnrollmentListParams.Status.builder()
                        .in_(listOf(IntrafiAccountEnrollmentListParams.Status.In.PENDING_ENROLLING))
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("account_id", "account_id")
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "123")
        IntrafiAccountEnrollmentListParams.Status.builder()
            .in_(listOf(IntrafiAccountEnrollmentListParams.Status.In.PENDING_ENROLLING))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = IntrafiAccountEnrollmentListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
