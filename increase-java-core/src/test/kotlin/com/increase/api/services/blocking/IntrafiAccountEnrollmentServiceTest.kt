// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.http.BinaryResponseContent
import com.increase.api.services.blocking.IntrafiAccountEnrollmentService
import com.increase.api.models.IntrafiAccountEnrollmentListPage
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class IntrafiAccountEnrollmentServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()
      val intrafiAccountEnrollment = intrafiAccountEnrollmentService.create(IntrafiAccountEnrollmentCreateParams.builder()
          .accountId("account_id")
          .emailAddress("x")
          .build())
      println(intrafiAccountEnrollment)
      intrafiAccountEnrollment.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()
      val intrafiAccountEnrollment = intrafiAccountEnrollmentService.retrieve(IntrafiAccountEnrollmentRetrieveParams.builder()
          .intrafiAccountEnrollmentId("intrafi_account_enrollment_id")
          .build())
      println(intrafiAccountEnrollment)
      intrafiAccountEnrollment.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()
      val intrafiAccountEnrollmentList = intrafiAccountEnrollmentService.list(IntrafiAccountEnrollmentListParams.builder().build())
      println(intrafiAccountEnrollmentList)
      intrafiAccountEnrollmentList.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callUnenroll() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val intrafiAccountEnrollmentService = client.intrafiAccountEnrollments()
      val intrafiAccountEnrollment = intrafiAccountEnrollmentService.unenroll(IntrafiAccountEnrollmentUnenrollParams.builder()
          .intrafiAccountEnrollmentId("intrafi_account_enrollment_id")
          .build())
      println(intrafiAccountEnrollment)
      intrafiAccountEnrollment.validate()
    }
}
