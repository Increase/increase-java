// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AchPrenotificationServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationService = client.achPrenotifications()

        val achPrenotification =
            achPrenotificationService.create(
                AchPrenotificationCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .accountNumber("987654321")
                    .routingNumber("101050001")
                    .addendum("x")
                    .companyDescriptiveDate("x")
                    .companyDiscretionaryData("x")
                    .companyEntryDescription("x")
                    .companyName("x")
                    .creditDebitIndicator(
                        AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT
                    )
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .individualId("x")
                    .individualName("x")
                    .standardEntryClassCode(
                        AchPrenotificationCreateParams.StandardEntryClassCode
                            .CORPORATE_CREDIT_OR_DEBIT
                    )
                    .build()
            )

        achPrenotification.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationService = client.achPrenotifications()

        val achPrenotification =
            achPrenotificationService.retrieve("ach_prenotification_ubjf9qqsxl3obbcn1u34")

        achPrenotification.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationService = client.achPrenotifications()

        val page = achPrenotificationService.list()

        page.response().validate()
    }
}
