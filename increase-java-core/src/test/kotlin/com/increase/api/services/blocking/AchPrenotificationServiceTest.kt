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
import com.increase.api.services.blocking.AchPrenotificationService
import com.increase.api.models.AchPrenotificationListPage
import com.increase.api.models.AchPrenotificationListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class AchPrenotificationServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val achPrenotificationService = client.achPrenotifications()
      val achPrenotification = achPrenotificationService.create(AchPrenotificationCreateParams.builder()
          .accountId("account_id")
          .accountNumber("x")
          .routingNumber("xxxxxxxxx")
          .addendum("x")
          .companyDescriptiveDate("x")
          .companyDiscretionaryData("x")
          .companyEntryDescription("x")
          .companyName("x")
          .creditDebitIndicator(AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT)
          .effectiveDate(LocalDate.parse("2019-12-27"))
          .individualId("x")
          .individualName("x")
          .standardEntryClassCode(AchPrenotificationCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
          .build())
      println(achPrenotification)
      achPrenotification.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val achPrenotificationService = client.achPrenotifications()
      val achPrenotification = achPrenotificationService.retrieve(AchPrenotificationRetrieveParams.builder()
          .achPrenotificationId("ach_prenotification_id")
          .build())
      println(achPrenotification)
      achPrenotification.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val achPrenotificationService = client.achPrenotifications()
      val achPrenotificationList = achPrenotificationService.list(AchPrenotificationListParams.builder().build())
      println(achPrenotificationList)
      achPrenotificationList.data().forEach {
          it.validate()
      }
    }
}
