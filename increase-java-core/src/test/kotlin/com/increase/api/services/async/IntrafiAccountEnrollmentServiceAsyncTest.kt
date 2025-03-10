// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentUnenrollParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IntrafiAccountEnrollmentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentServiceAsync = client.intrafiAccountEnrollments()

        val intrafiAccountEnrollmentFuture =
            intrafiAccountEnrollmentServiceAsync.create(
                IntrafiAccountEnrollmentCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .emailAddress("user@example.com")
                    .build()
            )

        val intrafiAccountEnrollment = intrafiAccountEnrollmentFuture.get()
        intrafiAccountEnrollment.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentServiceAsync = client.intrafiAccountEnrollments()

        val intrafiAccountEnrollmentFuture =
            intrafiAccountEnrollmentServiceAsync.retrieve(
                IntrafiAccountEnrollmentRetrieveParams.builder()
                    .intrafiAccountEnrollmentId("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
                    .build()
            )

        val intrafiAccountEnrollment = intrafiAccountEnrollmentFuture.get()
        intrafiAccountEnrollment.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentServiceAsync = client.intrafiAccountEnrollments()

        val pageFuture = intrafiAccountEnrollmentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun unenroll() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentServiceAsync = client.intrafiAccountEnrollments()

        val intrafiAccountEnrollmentFuture =
            intrafiAccountEnrollmentServiceAsync.unenroll(
                IntrafiAccountEnrollmentUnenrollParams.builder()
                    .intrafiAccountEnrollmentId("intrafi_account_enrollment_w8l97znzreopkwf2tg75")
                    .build()
            )

        val intrafiAccountEnrollment = intrafiAccountEnrollmentFuture.get()
        intrafiAccountEnrollment.validate()
    }
}
