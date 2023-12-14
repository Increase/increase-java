// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiAccountEnrollmentTest {

    @Test
    fun createIntrafiAccountEnrollment() {
        val intrafiAccountEnrollment =
            IntrafiAccountEnrollment.builder()
                .id("string")
                .accountId("string")
                .intrafiId("string")
                .status(IntrafiAccountEnrollment.Status.PENDING_ENROLLING)
                .type(IntrafiAccountEnrollment.Type.INTRAFI_ACCOUNT_ENROLLMENT)
                .build()
        assertThat(intrafiAccountEnrollment).isNotNull
        assertThat(intrafiAccountEnrollment.id()).isEqualTo("string")
        assertThat(intrafiAccountEnrollment.accountId()).isEqualTo("string")
        assertThat(intrafiAccountEnrollment.intrafiId()).isEqualTo("string")
        assertThat(intrafiAccountEnrollment.status())
            .isEqualTo(IntrafiAccountEnrollment.Status.PENDING_ENROLLING)
        assertThat(intrafiAccountEnrollment.type())
            .isEqualTo(IntrafiAccountEnrollment.Type.INTRAFI_ACCOUNT_ENROLLMENT)
    }
}
