// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrafiAccountEnrollmentListPageResponseTest {

    @Test
    fun create() {
        val intrafiAccountEnrollmentListPageResponse =
            IntrafiAccountEnrollmentListPageResponse.builder()
                .addData(
                    IntrafiAccountEnrollment.builder()
                        .id("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .idempotencyKey(null)
                        .intrafiId("01234abcd")
                        .status(IntrafiAccountEnrollment.Status.PENDING_ENROLLING)
                        .type(IntrafiAccountEnrollment.Type.INTRAFI_ACCOUNT_ENROLLMENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(intrafiAccountEnrollmentListPageResponse.data())
            .containsExactly(
                IntrafiAccountEnrollment.builder()
                    .id("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
                    .accountId("account_in71c4amph0vgo2qllky")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .idempotencyKey(null)
                    .intrafiId("01234abcd")
                    .status(IntrafiAccountEnrollment.Status.PENDING_ENROLLING)
                    .type(IntrafiAccountEnrollment.Type.INTRAFI_ACCOUNT_ENROLLMENT)
                    .build()
            )
        assertThat(intrafiAccountEnrollmentListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val intrafiAccountEnrollmentListPageResponse =
            IntrafiAccountEnrollmentListPageResponse.builder()
                .addData(
                    IntrafiAccountEnrollment.builder()
                        .id("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .idempotencyKey(null)
                        .intrafiId("01234abcd")
                        .status(IntrafiAccountEnrollment.Status.PENDING_ENROLLING)
                        .type(IntrafiAccountEnrollment.Type.INTRAFI_ACCOUNT_ENROLLMENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedIntrafiAccountEnrollmentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(intrafiAccountEnrollmentListPageResponse),
                jacksonTypeRef<IntrafiAccountEnrollmentListPageResponse>(),
            )

        assertThat(roundtrippedIntrafiAccountEnrollmentListPageResponse)
            .isEqualTo(intrafiAccountEnrollmentListPageResponse)
    }
}
