// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.core.JsonValue
import com.increase.api.models.exports.ExportCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExportServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exportServiceAsync = client.exports()

        val exportFuture =
            exportServiceAsync.create(
                ExportCreateParams.builder()
                    .category(ExportCreateParams.Category.TRANSACTION_CSV)
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
                            .programId("program_id")
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
                    .entityCsv(
                        ExportCreateParams.EntityCsv.builder()
                            .status(
                                ExportCreateParams.EntityCsv.Status.builder()
                                    .addIn(ExportCreateParams.EntityCsv.Status.In.ACTIVE)
                                    .build()
                            )
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
                            .programId("program_id")
                            .build()
                    )
                    .vendorCsv(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val export = exportFuture.get()
        export.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exportServiceAsync = client.exports()

        val exportFuture = exportServiceAsync.retrieve("export_8s4m48qz3bclzje0zwh9")

        val export = exportFuture.get()
        export.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exportServiceAsync = client.exports()

        val pageFuture = exportServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
