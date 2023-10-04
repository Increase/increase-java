// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardTest {

    @Test
    fun createPhysicalCard() {
        val physicalCard =
            PhysicalCard.builder()
                .id("string")
                .cardId("string")
                .cardProfileId("string")
                .cardholder(
                    PhysicalCard.Cardholder.builder().firstName("string").lastName("string").build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .shipment(
                    PhysicalCard.Shipment.builder()
                        .address(
                            PhysicalCard.Shipment.Address.builder()
                                .city("string")
                                .line1("string")
                                .line2("string")
                                .line3("string")
                                .name("string")
                                .postalCode("string")
                                .state("string")
                                .build()
                        )
                        .method(PhysicalCard.Shipment.Method.USPS)
                        .status(PhysicalCard.Shipment.Status.PENDING)
                        .tracking(
                            PhysicalCard.Shipment.Tracking.builder()
                                .number("string")
                                .returnReason("string")
                                .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .status(PhysicalCard.Status.ACTIVE)
                .type(PhysicalCard.Type.PHYSICAL_CARD)
                .build()
        assertThat(physicalCard).isNotNull
        assertThat(physicalCard.id()).isEqualTo("string")
        assertThat(physicalCard.cardId()).isEqualTo("string")
        assertThat(physicalCard.cardProfileId()).contains("string")
        assertThat(physicalCard.cardholder())
            .contains(
                PhysicalCard.Cardholder.builder().firstName("string").lastName("string").build()
            )
        assertThat(physicalCard.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(physicalCard.shipment())
            .isEqualTo(
                PhysicalCard.Shipment.builder()
                    .address(
                        PhysicalCard.Shipment.Address.builder()
                            .city("string")
                            .line1("string")
                            .line2("string")
                            .line3("string")
                            .name("string")
                            .postalCode("string")
                            .state("string")
                            .build()
                    )
                    .method(PhysicalCard.Shipment.Method.USPS)
                    .status(PhysicalCard.Shipment.Status.PENDING)
                    .tracking(
                        PhysicalCard.Shipment.Tracking.builder()
                            .number("string")
                            .returnReason("string")
                            .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(physicalCard.status()).isEqualTo(PhysicalCard.Status.ACTIVE)
        assertThat(physicalCard.type()).isEqualTo(PhysicalCard.Type.PHYSICAL_CARD)
    }
}
