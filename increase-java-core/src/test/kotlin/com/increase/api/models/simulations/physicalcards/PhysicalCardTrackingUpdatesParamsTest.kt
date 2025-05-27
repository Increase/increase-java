// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.physicalcards

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardTrackingUpdatesParamsTest {

    @Test
    fun create() {
        PhysicalCardTrackingUpdatesParams.builder()
            .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
            .category(PhysicalCardTrackingUpdatesParams.Category.DELIVERED)
            .carrierEstimatedDeliveryAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .city("New York")
            .postalCode("10045")
            .state("NY")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhysicalCardTrackingUpdatesParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .category(PhysicalCardTrackingUpdatesParams.Category.DELIVERED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("physical_card_ode8duyq5v2ynhjoharl")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhysicalCardTrackingUpdatesParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .category(PhysicalCardTrackingUpdatesParams.Category.DELIVERED)
                .carrierEstimatedDeliveryAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .city("New York")
                .postalCode("10045")
                .state("NY")
                .build()

        val body = params._body()

        assertThat(body.category()).isEqualTo(PhysicalCardTrackingUpdatesParams.Category.DELIVERED)
        assertThat(body.carrierEstimatedDeliveryAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.city()).contains("New York")
        assertThat(body.postalCode()).contains("10045")
        assertThat(body.state()).contains("NY")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhysicalCardTrackingUpdatesParams.builder()
                .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                .category(PhysicalCardTrackingUpdatesParams.Category.DELIVERED)
                .build()

        val body = params._body()

        assertThat(body.category()).isEqualTo(PhysicalCardTrackingUpdatesParams.Category.DELIVERED)
    }
}
