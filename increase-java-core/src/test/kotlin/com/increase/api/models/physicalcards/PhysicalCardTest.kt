// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardTest {

    @Test
    fun create() {
        val physicalCard =
            PhysicalCard.builder()
                .id("physical_card_ode8duyq5v2ynhjoharl")
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .cardholder(
                    PhysicalCard.Cardholder.builder().firstName("Ian").lastName("Crease").build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .shipment(
                    PhysicalCard.Shipment.builder()
                        .address(
                            PhysicalCard.Shipment.Address.builder()
                                .city("New York")
                                .country("US")
                                .line1("33 Liberty Street")
                                .line2("Unit 2")
                                .line3(null)
                                .name("Ian Crease")
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .method(PhysicalCard.Shipment.Method.USPS)
                        .schedule(PhysicalCard.Shipment.Schedule.NEXT_DAY)
                        .status(PhysicalCard.Shipment.Status.SHIPPED)
                        .tracking(
                            PhysicalCard.Shipment.Tracking.builder()
                                .number("9400110200881234567890")
                                .returnNumber(null)
                                .returnReason(null)
                                .shippedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .addUpdate(
                                    PhysicalCard.Shipment.Tracking.Update.builder()
                                        .carrierEstimatedDeliveryAt(null)
                                        .category(
                                            PhysicalCard.Shipment.Tracking.Update.Category.DELIVERED
                                        )
                                        .city(null)
                                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                        .postalCode("10001")
                                        .state(null)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .status(PhysicalCard.Status.ACTIVE)
                .type(PhysicalCard.Type.PHYSICAL_CARD)
                .build()

        assertThat(physicalCard.id()).isEqualTo("physical_card_ode8duyq5v2ynhjoharl")
        assertThat(physicalCard.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(physicalCard.cardholder())
            .isEqualTo(
                PhysicalCard.Cardholder.builder().firstName("Ian").lastName("Crease").build()
            )
        assertThat(physicalCard.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(physicalCard.idempotencyKey()).isEmpty
        assertThat(physicalCard.physicalCardProfileId())
            .contains("physical_card_profile_m534d5rn9qyy9ufqxoec")
        assertThat(physicalCard.shipment())
            .isEqualTo(
                PhysicalCard.Shipment.builder()
                    .address(
                        PhysicalCard.Shipment.Address.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2("Unit 2")
                            .line3(null)
                            .name("Ian Crease")
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .method(PhysicalCard.Shipment.Method.USPS)
                    .schedule(PhysicalCard.Shipment.Schedule.NEXT_DAY)
                    .status(PhysicalCard.Shipment.Status.SHIPPED)
                    .tracking(
                        PhysicalCard.Shipment.Tracking.builder()
                            .number("9400110200881234567890")
                            .returnNumber(null)
                            .returnReason(null)
                            .shippedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .addUpdate(
                                PhysicalCard.Shipment.Tracking.Update.builder()
                                    .carrierEstimatedDeliveryAt(null)
                                    .category(
                                        PhysicalCard.Shipment.Tracking.Update.Category.DELIVERED
                                    )
                                    .city(null)
                                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                    .postalCode("10001")
                                    .state(null)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(physicalCard.status()).isEqualTo(PhysicalCard.Status.ACTIVE)
        assertThat(physicalCard.type()).isEqualTo(PhysicalCard.Type.PHYSICAL_CARD)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val physicalCard =
            PhysicalCard.builder()
                .id("physical_card_ode8duyq5v2ynhjoharl")
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .cardholder(
                    PhysicalCard.Cardholder.builder().firstName("Ian").lastName("Crease").build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .shipment(
                    PhysicalCard.Shipment.builder()
                        .address(
                            PhysicalCard.Shipment.Address.builder()
                                .city("New York")
                                .country("US")
                                .line1("33 Liberty Street")
                                .line2("Unit 2")
                                .line3(null)
                                .name("Ian Crease")
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .method(PhysicalCard.Shipment.Method.USPS)
                        .schedule(PhysicalCard.Shipment.Schedule.NEXT_DAY)
                        .status(PhysicalCard.Shipment.Status.SHIPPED)
                        .tracking(
                            PhysicalCard.Shipment.Tracking.builder()
                                .number("9400110200881234567890")
                                .returnNumber(null)
                                .returnReason(null)
                                .shippedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .addUpdate(
                                    PhysicalCard.Shipment.Tracking.Update.builder()
                                        .carrierEstimatedDeliveryAt(null)
                                        .category(
                                            PhysicalCard.Shipment.Tracking.Update.Category.DELIVERED
                                        )
                                        .city(null)
                                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                        .postalCode("10001")
                                        .state(null)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .status(PhysicalCard.Status.ACTIVE)
                .type(PhysicalCard.Type.PHYSICAL_CARD)
                .build()

        val roundtrippedPhysicalCard =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(physicalCard),
                jacksonTypeRef<PhysicalCard>(),
            )

        assertThat(roundtrippedPhysicalCard).isEqualTo(physicalCard)
    }
}
