// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.exports.ExportCreateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExportServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exportService = client.exports()

        val export =
            exportService.create(
                ExportCreateParams.builder()
                    .category(ExportCreateParams.Category.TRANSACTION_CSV)
                    .accountStatementBai2(
                        ExportCreateParams.AccountStatementBai2.builder()
                            .accountId("account_id")
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .programId("program_id")
                            .build()
                    )
                    .accountStatementOfx(
                        ExportCreateParams.AccountStatementOfx.builder()
                            .accountId("account_id")
                            .createdAt(
                                ExportCreateParams.AccountStatementOfx.CreatedAt.builder()
                                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .accountVerificationLetter(
                        ExportCreateParams.AccountVerificationLetter.builder()
                            .accountNumberId("account_number_id")
                            .balanceDate(LocalDate.parse("2019-12-27"))
                            .build()
                    )
                    .balanceCsv(
                        ExportCreateParams.BalanceCsv.builder()
                            .accountId("account_id")
                            .createdAt(
                                ExportCreateParams.BalanceCsv.CreatedAt.builder()
                                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .bookkeepingAccountBalanceCsv(
                        ExportCreateParams.BookkeepingAccountBalanceCsv.builder()
                            .bookkeepingAccountId("bookkeeping_account_id")
                            .createdAt(
                                ExportCreateParams.BookkeepingAccountBalanceCsv.CreatedAt.builder()
                                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .entityCsv(ExportCreateParams.EntityCsv.builder().build())
                    .fundingInstructions(
                        ExportCreateParams.FundingInstructions.builder()
                            .accountNumberId("account_number_id")
                            .build()
                    )
                    .transactionCsv(
                        ExportCreateParams.TransactionCsv.builder()
                            .accountId("account_in71c4amph0vgo2qllky")
                            .createdAt(
                                ExportCreateParams.TransactionCsv.CreatedAt.builder()
                                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .vendorCsv(ExportCreateParams.VendorCsv.builder().build())
                    .voidedCheck(
                        ExportCreateParams.VoidedCheck.builder()
                            .accountNumberId("account_number_id")
                            .addPayer(
                                ExportCreateParams.VoidedCheck.Payer.builder().line("x").build()
                            )
                            .build()
                    )
                    .build()
            )

        export.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exportService = client.exports()

        val export = exportService.retrieve("export_8s4m48qz3bclzje0zwh9")

        export.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exportService = client.exports()

        val page = exportService.list()

        page.response().validate()
    }
}
