// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardRetrieveParamsTest {

    @Test
    fun create() {
        PhysicalCardRetrieveParams.builder()
            .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            PhysicalCardRetrieveParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .build()
        assertThat(params).isNotNull
        // path param "physicalCardId"
        assertThat(params.getPathParam(0)).isEqualTo("physical_card_ode8duyq5v2ynhjoharl")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
