// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentstransfers

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundRealTimePaymentsTransferListParamsTest {

    @Test
    fun create() {
        InboundRealTimePaymentsTransferListParams.builder()
            .accountId("account_id")
            .accountNumberId("account_number_id")
            .createdAt(
                InboundRealTimePaymentsTransferListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InboundRealTimePaymentsTransferListParams.builder()
                .accountId("account_id")
                .accountNumberId("account_number_id")
                .createdAt(
                    InboundRealTimePaymentsTransferListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("account_id", "account_id")
        expected.put("account_number_id", "account_number_id")
        InboundRealTimePaymentsTransferListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InboundRealTimePaymentsTransferListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
