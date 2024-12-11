// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiAccountEnrollmentTest {

    @Test
    fun createIntrafiAccountEnrollment() {
        val intrafiAccountEnrollment =
            IntrafiAccountEnrollment.builder()
                .id("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
                .accountId("account_in71c4amph0vgo2qllky")
                .intrafiId("01234abcd")
                .status(IntrafiAccountEnrollment.Status.PENDING_ENROLLING)
                .type(IntrafiAccountEnrollment.Type.INTRAFI_ACCOUNT_ENROLLMENT)
                .build()
        assertThat(intrafiAccountEnrollment).isNotNull
        assertThat(intrafiAccountEnrollment.id())
            .isEqualTo("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
        assertThat(intrafiAccountEnrollment.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(intrafiAccountEnrollment.intrafiId()).isEqualTo("01234abcd")
        assertThat(intrafiAccountEnrollment.status())
            .isEqualTo(IntrafiAccountEnrollment.Status.PENDING_ENROLLING)
        assertThat(intrafiAccountEnrollment.type())
            .isEqualTo(IntrafiAccountEnrollment.Type.INTRAFI_ACCOUNT_ENROLLMENT)
    }
}
