// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AchPrenotificationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationServiceAsync = client.achPrenotifications()

        val achPrenotificationFuture =
            achPrenotificationServiceAsync.create(
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

        val achPrenotification = achPrenotificationFuture.get()
        achPrenotification.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationServiceAsync = client.achPrenotifications()

        val achPrenotificationFuture =
            achPrenotificationServiceAsync.retrieve(
                AchPrenotificationRetrieveParams.builder()
                    .achPrenotificationId("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                    .build()
            )

        val achPrenotification = achPrenotificationFuture.get()
        achPrenotification.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationServiceAsync = client.achPrenotifications()

        val pageFuture = achPrenotificationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
