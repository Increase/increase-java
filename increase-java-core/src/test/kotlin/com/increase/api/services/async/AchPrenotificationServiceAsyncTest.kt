// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationListParams
import java.time.LocalDate
import java.time.OffsetDateTime
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
            achPrenotificationServiceAsync.retrieve("ach_prenotification_ubjf9qqsxl3obbcn1u34")

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

        val achPrenotificationsFuture =
            achPrenotificationServiceAsync.list(
                AchPrenotificationListParams.builder()
                    .createdAt(
                        AchPrenotificationListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .idempotencyKey("x")
                    .limit(1L)
                    .build()
            )

        val achPrenotifications = achPrenotificationsFuture.get()
        achPrenotifications.validate()
    }
}
