// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiAccountEnrollmentListParamsTest {

    @Test
    fun createIntrafiAccountEnrollmentListParams() {
        IntrafiAccountEnrollmentListParams.builder()
            .accountId("string")
            .cursor("string")
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
                .accountId("string")
                .cursor("string")
                .limit(123L)
                .status(
                    IntrafiAccountEnrollmentListParams.Status.builder()
                        .in_(listOf(IntrafiAccountEnrollmentListParams.Status.In.PENDING_ENROLLING))
                        .build()
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_id", listOf("string"))
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        IntrafiAccountEnrollmentListParams.Status.builder()
            .in_(listOf(IntrafiAccountEnrollmentListParams.Status.In.PENDING_ENROLLING))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = IntrafiAccountEnrollmentListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
