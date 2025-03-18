// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrafiAccountEnrollmentRetrieveParamsTest {

    @Test
    fun create() {
        IntrafiAccountEnrollmentRetrieveParams.builder()
            .intrafiAccountEnrollmentId("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntrafiAccountEnrollmentRetrieveParams.builder()
                .intrafiAccountEnrollmentId("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
