package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.AchPrenotificationCreateParams.AchPrenotificationCreateBody

class AchPrenotificationCreateParamsTest {

    @Test
    fun createAchPrenotificationCreateParams() {
      AchPrenotificationCreateParams.builder()
          .accountNumber("x")
          .addendum("x")
          .companyDescriptiveDate("x")
          .companyDiscretionaryData("x")
          .companyEntryDescription("x")
          .companyName("x")
          .creditDebitIndicator(AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT)
          .effectiveDate(LocalDate.parse("2019-12-27"))
          .individualId("x")
          .individualName("x")
          .routingNumber("xxxxxxxxx")
          .standardEntryClassCode(AchPrenotificationCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
          .build()
    }

    @Test
    fun getBody() {
      val params = AchPrenotificationCreateParams.builder()
          .accountNumber("x")
          .addendum("x")
          .companyDescriptiveDate("x")
          .companyDiscretionaryData("x")
          .companyEntryDescription("x")
          .companyName("x")
          .creditDebitIndicator(AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT)
          .effectiveDate(LocalDate.parse("2019-12-27"))
          .individualId("x")
          .individualName("x")
          .routingNumber("xxxxxxxxx")
          .standardEntryClassCode(AchPrenotificationCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumber()).isEqualTo("x")
      assertThat(body.addendum()).isEqualTo("x")
      assertThat(body.companyDescriptiveDate()).isEqualTo("x")
      assertThat(body.companyDiscretionaryData()).isEqualTo("x")
      assertThat(body.companyEntryDescription()).isEqualTo("x")
      assertThat(body.companyName()).isEqualTo("x")
      assertThat(body.creditDebitIndicator()).isEqualTo(AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT)
      assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
      assertThat(body.individualId()).isEqualTo("x")
      assertThat(body.individualName()).isEqualTo("x")
      assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
      assertThat(body.standardEntryClassCode()).isEqualTo(AchPrenotificationCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AchPrenotificationCreateParams.builder()
          .accountNumber("x")
          .routingNumber("xxxxxxxxx")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumber()).isEqualTo("x")
      assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
    }
}
