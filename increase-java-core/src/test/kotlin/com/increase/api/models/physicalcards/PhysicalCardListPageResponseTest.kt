// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardListPageResponseTest {

    @Test
    fun create() {
        val physicalCardListPageResponse =
            PhysicalCardListPageResponse.builder()
                .addData(
                    PhysicalCard.builder()
                        .id("physical_card_ode8duyq5v2ynhjoharl")
                        .cardId("card_oubs0hwk5rn6knuecxg2")
                        .cardholder(
                            PhysicalCard.Cardholder.builder()
                                .firstName("Ian")
                                .lastName("Crease")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .idempotencyKey(null)
                        .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                        .shipment(
                            PhysicalCard.Shipment.builder()
                                .address(
                                    PhysicalCard.Shipment.Address.builder()
                                        .city("New York")
                                        .line1("33 Liberty Street")
                                        .line2("Unit 2")
                                        .line3(null)
                                        .name("Ian Crease")
                                        .postalCode("10045")
                                        .state("NY")
                                        .build()
                                )
                                .method(PhysicalCard.Shipment.Method.USPS)
                                .status(PhysicalCard.Shipment.Status.PENDING)
                                .tracking(
                                    PhysicalCard.Shipment.Tracking.builder()
                                        .number("number")
                                        .returnNumber("return_number")
                                        .returnReason("return_reason")
                                        .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .status(PhysicalCard.Status.ACTIVE)
                        .type(PhysicalCard.Type.PHYSICAL_CARD)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(physicalCardListPageResponse.data())
            .containsExactly(
                PhysicalCard.builder()
                    .id("physical_card_ode8duyq5v2ynhjoharl")
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .cardholder(
                        PhysicalCard.Cardholder.builder()
                            .firstName("Ian")
                            .lastName("Crease")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .idempotencyKey(null)
                    .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                    .shipment(
                        PhysicalCard.Shipment.builder()
                            .address(
                                PhysicalCard.Shipment.Address.builder()
                                    .city("New York")
                                    .line1("33 Liberty Street")
                                    .line2("Unit 2")
                                    .line3(null)
                                    .name("Ian Crease")
                                    .postalCode("10045")
                                    .state("NY")
                                    .build()
                            )
                            .method(PhysicalCard.Shipment.Method.USPS)
                            .status(PhysicalCard.Shipment.Status.PENDING)
                            .tracking(
                                PhysicalCard.Shipment.Tracking.builder()
                                    .number("number")
                                    .returnNumber("return_number")
                                    .returnReason("return_reason")
                                    .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .status(PhysicalCard.Status.ACTIVE)
                    .type(PhysicalCard.Type.PHYSICAL_CARD)
                    .build()
            )
        assertThat(physicalCardListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val physicalCardListPageResponse =
            PhysicalCardListPageResponse.builder()
                .addData(
                    PhysicalCard.builder()
                        .id("physical_card_ode8duyq5v2ynhjoharl")
                        .cardId("card_oubs0hwk5rn6knuecxg2")
                        .cardholder(
                            PhysicalCard.Cardholder.builder()
                                .firstName("Ian")
                                .lastName("Crease")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .idempotencyKey(null)
                        .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                        .shipment(
                            PhysicalCard.Shipment.builder()
                                .address(
                                    PhysicalCard.Shipment.Address.builder()
                                        .city("New York")
                                        .line1("33 Liberty Street")
                                        .line2("Unit 2")
                                        .line3(null)
                                        .name("Ian Crease")
                                        .postalCode("10045")
                                        .state("NY")
                                        .build()
                                )
                                .method(PhysicalCard.Shipment.Method.USPS)
                                .status(PhysicalCard.Shipment.Status.PENDING)
                                .tracking(
                                    PhysicalCard.Shipment.Tracking.builder()
                                        .number("number")
                                        .returnNumber("return_number")
                                        .returnReason("return_reason")
                                        .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .status(PhysicalCard.Status.ACTIVE)
                        .type(PhysicalCard.Type.PHYSICAL_CARD)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedPhysicalCardListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(physicalCardListPageResponse),
                jacksonTypeRef<PhysicalCardListPageResponse>(),
            )

        assertThat(roundtrippedPhysicalCardListPageResponse).isEqualTo(physicalCardListPageResponse)
    }
}
