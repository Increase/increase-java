// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiAccountEnrollmentUnenrollParamsTest {

    @Test
    fun createIntrafiAccountEnrollmentUnenrollParams() {
        IntrafiAccountEnrollmentUnenrollParams.builder()
            .intrafiAccountEnrollmentId("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            IntrafiAccountEnrollmentUnenrollParams.builder()
                .intrafiAccountEnrollmentId("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
                .build()
        assertThat(params).isNotNull
        // path param "intrafiAccountEnrollmentId"
        assertThat(params.getPathParam(0))
            .isEqualTo("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
