// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbookchecks

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckbookCheckListParamsTest {

    @Test
    fun create() {
        CheckbookCheckListParams.builder()
            .accountNumberId("account_number_id")
            .checkNumber(0L)
            .checkbookId("checkbook_id")
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CheckbookCheckListParams.builder()
                .accountNumberId("account_number_id")
                .checkNumber(0L)
                .checkbookId("checkbook_id")
                .cursor("cursor")
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_number_id", "account_number_id")
                    .put("check_number", "0")
                    .put("checkbook_id", "checkbook_id")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CheckbookCheckListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
