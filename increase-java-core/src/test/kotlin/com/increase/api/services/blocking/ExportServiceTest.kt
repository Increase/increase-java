package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.ExportListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExportServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val exportService = client.exports()
        val export =
            exportService.create(
                ExportCreateParams.builder()
                    .category(ExportCreateParams.Category.TRANSACTION_CSV)
                    .transactionCsv(
                        ExportCreateParams.TransactionCsv.builder()
                            .accountId("string")
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
                    .balanceCsv(
                        ExportCreateParams.BalanceCsv.builder()
                            .accountId("string")
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
                    .build()
            )
        println(export)
        export.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val exportService = client.exports()
        val export =
            exportService.retrieve(ExportRetrieveParams.builder().exportId("string").build())
        println(export)
        export.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val exportService = client.exports()
        val exportList = exportService.list(ExportListParams.builder().build())
        println(exportList)
        exportList.data().forEach { it.validate() }
    }
}
