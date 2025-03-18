// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountStatementListParamsTest {

    @Test
    fun create() {
        AccountStatementListParams.builder()
            .accountId("account_id")
            .cursor("cursor")
            .limit(1L)
            .statementPeriodStart(
                AccountStatementListParams.StatementPeriodStart.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountStatementListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .limit(1L)
                .statementPeriodStart(
                    AccountStatementListParams.StatementPeriodStart.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("statement_period_start.after", "2019-12-27T18:11:19.117Z")
                    .put("statement_period_start.before", "2019-12-27T18:11:19.117Z")
                    .put("statement_period_start.on_or_after", "2019-12-27T18:11:19.117Z")
                    .put("statement_period_start.on_or_before", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountStatementListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
