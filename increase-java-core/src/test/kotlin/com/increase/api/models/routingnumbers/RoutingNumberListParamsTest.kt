// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingNumberListParamsTest {

    @Test
    fun create() {
        RoutingNumberListParams.builder()
            .routingNumber("xxxxxxxxx")
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RoutingNumberListParams.builder()
                .routingNumber("xxxxxxxxx")
                .cursor("cursor")
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("routing_number", "xxxxxxxxx")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RoutingNumberListParams.builder().routingNumber("xxxxxxxxx").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("routing_number", "xxxxxxxxx").build())
    }
}
