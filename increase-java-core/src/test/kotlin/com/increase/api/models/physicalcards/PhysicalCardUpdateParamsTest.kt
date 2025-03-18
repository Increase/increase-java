// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardUpdateParamsTest {

    @Test
    fun create() {
        PhysicalCardUpdateParams.builder()
            .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
            .status(PhysicalCardUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhysicalCardUpdateParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .status(PhysicalCardUpdateParams.Status.ACTIVE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("physical_card_ode8duyq5v2ynhjoharl")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhysicalCardUpdateParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .status(PhysicalCardUpdateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.status()).isEqualTo(PhysicalCardUpdateParams.Status.ACTIVE)
    }
}
