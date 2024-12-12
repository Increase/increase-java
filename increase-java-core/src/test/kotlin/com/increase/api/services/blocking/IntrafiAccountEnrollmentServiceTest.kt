// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import com.increase.api.models.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.IntrafiAccountEnrollmentUnenrollParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IntrafiAccountEnrollmentServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()
        val intrafiAccountEnrollment =
            intrafiAccountEnrollmentService.create(
                IntrafiAccountEnrollmentCreateParams.builder()
                    .accountId("account_id")
                    .emailAddress("x")
                    .build()
            )
        println(intrafiAccountEnrollment)
        intrafiAccountEnrollment.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()
        val intrafiAccountEnrollment =
            intrafiAccountEnrollmentService.retrieve(
                IntrafiAccountEnrollmentRetrieveParams.builder()
                    .intrafiAccountEnrollmentId("intrafi_account_enrollment_id")
                    .build()
            )
        println(intrafiAccountEnrollment)
        intrafiAccountEnrollment.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()
        val intrafiAccountEnrollmentList =
            intrafiAccountEnrollmentService.list(
                IntrafiAccountEnrollmentListParams.builder().build()
            )
        println(intrafiAccountEnrollmentList)
        intrafiAccountEnrollmentList.data().forEach { it.validate() }
    }

    @Test
    fun callUnenroll() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()
        val intrafiAccountEnrollment =
            intrafiAccountEnrollmentService.unenroll(
                IntrafiAccountEnrollmentUnenrollParams.builder()
                    .intrafiAccountEnrollmentId("intrafi_account_enrollment_id")
                    .build()
            )
        println(intrafiAccountEnrollment)
        intrafiAccountEnrollment.validate()
    }
}
