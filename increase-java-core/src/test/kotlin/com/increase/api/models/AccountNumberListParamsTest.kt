// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
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
            .limit(1L)
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
                .limit(1L)
                .status(AccountNumberListParams.Status.ACTIVE)
                .build()
        val expected = QueryParams.builder()
        expected.put("account_id", "account_id")
        expected.put("ach_debit_status", AccountNumberListParams.AchDebitStatus.ALLOWED.toString())
        AccountNumberListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        expected.put("status", AccountNumberListParams.Status.ACTIVE.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountNumberListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
