// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntrySetCreateParamsTest {

    @Test
    fun createBookkeepingEntrySetCreateParams() {
        BookkeepingEntrySetCreateParams.builder()
            .entries(
                listOf(
                    BookkeepingEntrySetCreateParams.Entry.builder()
                        .accountId("account_id")
                        .amount(0L)
                        .build()
                )
            )
            .date(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .transactionId("transaction_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            BookkeepingEntrySetCreateParams.builder()
                .entries(
                    listOf(
                        BookkeepingEntrySetCreateParams.Entry.builder()
                            .accountId("account_id")
                            .amount(0L)
                            .build()
                    )
                )
                .date(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .transactionId("transaction_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entries())
            .isEqualTo(
                listOf(
                    BookkeepingEntrySetCreateParams.Entry.builder()
                        .accountId("account_id")
                        .amount(0L)
                        .build()
                )
            )
        assertThat(body.date()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.transactionId()).isEqualTo("transaction_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            BookkeepingEntrySetCreateParams.builder()
                .entries(
                    listOf(
                        BookkeepingEntrySetCreateParams.Entry.builder()
                            .accountId("account_id")
                            .amount(0L)
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entries())
            .isEqualTo(
                listOf(
                    BookkeepingEntrySetCreateParams.Entry.builder()
                        .accountId("account_id")
                        .amount(0L)
                        .build()
                )
            )
    }
}
