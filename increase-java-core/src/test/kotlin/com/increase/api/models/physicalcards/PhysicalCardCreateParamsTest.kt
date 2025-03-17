// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardCreateParamsTest {

    @Test
    fun create() {
        PhysicalCardCreateParams.builder()
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .cardholder(
                PhysicalCardCreateParams.Cardholder.builder()
                    .firstName("Ian")
                    .lastName("Crease")
                    .build()
            )
            .shipment(
                PhysicalCardCreateParams.Shipment.builder()
                    .address(
                        PhysicalCardCreateParams.Shipment.Address.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .name("Ian Crease")
                            .postalCode("10045")
                            .state("NY")
                            .line2("Unit 2")
                            .line3("x")
                            .phoneNumber("x")
                            .build()
                    )
                    .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                    .build()
            )
            .physicalCardProfileId("physical_card_profile_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            PhysicalCardCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .cardholder(
                    PhysicalCardCreateParams.Cardholder.builder()
                        .firstName("Ian")
                        .lastName("Crease")
                        .build()
                )
                .shipment(
                    PhysicalCardCreateParams.Shipment.builder()
                        .address(
                            PhysicalCardCreateParams.Shipment.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .name("Ian Crease")
                                .postalCode("10045")
                                .state("NY")
                                .line2("Unit 2")
                                .line3("x")
                                .phoneNumber("x")
                                .build()
                        )
                        .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                        .build()
                )
                .physicalCardProfileId("physical_card_profile_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.cardholder())
            .isEqualTo(
                PhysicalCardCreateParams.Cardholder.builder()
                    .firstName("Ian")
                    .lastName("Crease")
                    .build()
            )
        assertThat(body.shipment())
            .isEqualTo(
                PhysicalCardCreateParams.Shipment.builder()
                    .address(
                        PhysicalCardCreateParams.Shipment.Address.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .name("Ian Crease")
                            .postalCode("10045")
                            .state("NY")
                            .line2("Unit 2")
                            .line3("x")
                            .phoneNumber("x")
                            .build()
                    )
                    .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                    .build()
            )
        assertThat(body.physicalCardProfileId()).contains("physical_card_profile_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhysicalCardCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .cardholder(
                    PhysicalCardCreateParams.Cardholder.builder()
                        .firstName("Ian")
                        .lastName("Crease")
                        .build()
                )
                .shipment(
                    PhysicalCardCreateParams.Shipment.builder()
                        .address(
                            PhysicalCardCreateParams.Shipment.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .name("Ian Crease")
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.cardholder())
            .isEqualTo(
                PhysicalCardCreateParams.Cardholder.builder()
                    .firstName("Ian")
                    .lastName("Crease")
                    .build()
            )
        assertThat(body.shipment())
            .isEqualTo(
                PhysicalCardCreateParams.Shipment.builder()
                    .address(
                        PhysicalCardCreateParams.Shipment.Address.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .name("Ian Crease")
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                    .build()
            )
    }
}
