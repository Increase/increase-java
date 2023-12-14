// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.intrafi

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountEnrollmentServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountEnrollmentService = client.intrafi().accountEnrollments()
        val intrafiAccountEnrollment =
            accountEnrollmentService.create(
                IntrafiAccountEnrollmentCreateParams.builder()
                    .accountId("string")
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
        val accountEnrollmentService = client.intrafi().accountEnrollments()
        val intrafiAccountEnrollment =
            accountEnrollmentService.retrieve(
                IntrafiAccountEnrollmentRetrieveParams.builder()
                    .intrafiAccountEnrollmentId("string")
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
        val accountEnrollmentService = client.intrafi().accountEnrollments()
        val intrafiAccountEnrollmentList =
            accountEnrollmentService.list(IntrafiAccountEnrollmentListParams.builder().build())
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
        val accountEnrollmentService = client.intrafi().accountEnrollments()
        val intrafiAccountEnrollment =
            accountEnrollmentService.unenroll(
                IntrafiAccountEnrollmentUnenrollParams.builder()
                    .intrafiAccountEnrollmentId("string")
                    .build()
            )
        println(intrafiAccountEnrollment)
        intrafiAccountEnrollment.validate()
    }
}
