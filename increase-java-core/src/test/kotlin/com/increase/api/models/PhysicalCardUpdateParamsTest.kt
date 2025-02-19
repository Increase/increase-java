// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardUpdateParamsTest {

    @Test
    fun create() {
        PhysicalCardUpdateParams.builder()
            .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
            .status(PhysicalCardUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun body() {
        val params =
            PhysicalCardUpdateParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .status(PhysicalCardUpdateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(PhysicalCardUpdateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhysicalCardUpdateParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .status(PhysicalCardUpdateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(PhysicalCardUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getPathParam() {
        val params =
            PhysicalCardUpdateParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .status(PhysicalCardUpdateParams.Status.ACTIVE)
                .build()
        assertThat(params).isNotNull
        // path param "physicalCardId"
        assertThat(params.getPathParam(0)).isEqualTo("physical_card_ode8duyq5v2ynhjoharl")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
