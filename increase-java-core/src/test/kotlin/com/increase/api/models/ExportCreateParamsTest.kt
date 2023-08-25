package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExportCreateParamsTest {

    @Test
    fun createExportCreateParams() {
        ExportCreateParams.builder()
            .category(ExportCreateParams.Category.TRANSACTION_CSV)
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
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExportCreateParams.builder()
                .category(ExportCreateParams.Category.TRANSACTION_CSV)
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
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.category()).isEqualTo(ExportCreateParams.Category.TRANSACTION_CSV)
        assertThat(body.balanceCsv())
            .isEqualTo(
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
        assertThat(body.transactionCsv())
            .isEqualTo(
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExportCreateParams.builder()
                .category(ExportCreateParams.Category.TRANSACTION_CSV)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.category()).isEqualTo(ExportCreateParams.Category.TRANSACTION_CSV)
    }
}
