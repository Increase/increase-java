// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountNumberListParamsTest {

    @Test
    fun createAccountNumberListParams() {
        AccountNumberListParams.builder()
            .accountId("account_id")
            .achDebitStatus(AccountNumberListParams.AchDebitStatus.ALLOWED)
            .createdAt(
                AccountNumberListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(123L)
            .status(AccountNumberListParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountNumberListParams.builder()
                .accountId("account_id")
                .achDebitStatus(AccountNumberListParams.AchDebitStatus.ALLOWED)
                .createdAt(
                    AccountNumberListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(123L)
                .status(AccountNumberListParams.Status.ACTIVE)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("account_id", listOf("account_id"))
        expected.put(
            "ach_debit_status",
            listOf(AccountNumberListParams.AchDebitStatus.ALLOWED.toString())
        )
        AccountNumberListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", listOf("cursor"))
        expected.put("idempotency_key", listOf("x"))
        expected.put("limit", listOf("123"))
        expected.put("status", listOf(AccountNumberListParams.Status.ACTIVE.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountNumberListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
