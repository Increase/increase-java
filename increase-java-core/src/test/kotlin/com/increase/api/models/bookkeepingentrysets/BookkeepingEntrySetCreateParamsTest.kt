// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntrySetCreateParamsTest {

    @Test
    fun create() {
      BookkeepingEntrySetCreateParams.builder()
          .addEntry(BookkeepingEntrySetCreateParams.Entry.builder()
              .accountId("bookkeeping_account_9husfpw68pzmve9dvvc7")
              .amount(100L)
              .build())
          .addEntry(BookkeepingEntrySetCreateParams.Entry.builder()
              .accountId("bookkeeping_account_t2obldz1rcu15zr54umg")
              .amount(-100L)
              .build())
          .date(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
          .transactionId("transaction_uyrp7fld2ium70oa7oi")
          .build()
    }

    @Test
    fun body() {
      val params = BookkeepingEntrySetCreateParams.builder()
          .addEntry(BookkeepingEntrySetCreateParams.Entry.builder()
              .accountId("bookkeeping_account_9husfpw68pzmve9dvvc7")
              .amount(100L)
              .build())
          .addEntry(BookkeepingEntrySetCreateParams.Entry.builder()
              .accountId("bookkeeping_account_t2obldz1rcu15zr54umg")
              .amount(-100L)
              .build())
          .date(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
          .transactionId("transaction_uyrp7fld2ium70oa7oi")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.entries()).isEqualTo(listOf(
        BookkeepingEntrySetCreateParams.Entry.builder()
            .accountId("bookkeeping_account_9husfpw68pzmve9dvvc7")
            .amount(100L)
            .build(), BookkeepingEntrySetCreateParams.Entry.builder()
            .accountId("bookkeeping_account_t2obldz1rcu15zr54umg")
            .amount(-100L)
            .build()
      ))
      assertThat(body.date()).contains(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
      assertThat(body.transactionId()).contains("transaction_uyrp7fld2ium70oa7oi")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = BookkeepingEntrySetCreateParams.builder()
          .addEntry(BookkeepingEntrySetCreateParams.Entry.builder()
              .accountId("bookkeeping_account_9husfpw68pzmve9dvvc7")
              .amount(100L)
              .build())
          .addEntry(BookkeepingEntrySetCreateParams.Entry.builder()
              .accountId("bookkeeping_account_t2obldz1rcu15zr54umg")
              .amount(-100L)
              .build())
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.entries()).isEqualTo(listOf(
        BookkeepingEntrySetCreateParams.Entry.builder()
            .accountId("bookkeeping_account_9husfpw68pzmve9dvvc7")
            .amount(100L)
            .build(), BookkeepingEntrySetCreateParams.Entry.builder()
            .accountId("bookkeeping_account_t2obldz1rcu15zr54umg")
            .amount(-100L)
            .build()
      ))
    }
}
