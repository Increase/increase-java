// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardCreateParamsTest {

    @Test
    fun createPhysicalCardCreateParams() {
        PhysicalCardCreateParams.builder()
            .cardId("string")
            .cardProfileId("string")
            .cardholder(
                PhysicalCardCreateParams.Cardholder.builder().firstName("x").lastName("x").build()
            )
            .shipment(
                PhysicalCardCreateParams.Shipment.builder()
                    .address(
                        PhysicalCardCreateParams.Shipment.Address.builder()
                            .city("x")
                            .line1("x")
                            .name("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .line3("x")
                            .phoneNumber("x")
                            .build()
                    )
                    .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PhysicalCardCreateParams.builder()
                .cardId("string")
                .cardProfileId("string")
                .cardholder(
                    PhysicalCardCreateParams.Cardholder.builder()
                        .firstName("x")
                        .lastName("x")
                        .build()
                )
                .shipment(
                    PhysicalCardCreateParams.Shipment.builder()
                        .address(
                            PhysicalCardCreateParams.Shipment.Address.builder()
                                .city("x")
                                .line1("x")
                                .name("x")
                                .postalCode("x")
                                .state("x")
                                .line2("x")
                                .line3("x")
                                .phoneNumber("x")
                                .build()
                        )
                        .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("string")
        assertThat(body.cardProfileId()).isEqualTo("string")
        assertThat(body.cardholder())
            .isEqualTo(
                PhysicalCardCreateParams.Cardholder.builder().firstName("x").lastName("x").build()
            )
        assertThat(body.shipment())
            .isEqualTo(
                PhysicalCardCreateParams.Shipment.builder()
                    .address(
                        PhysicalCardCreateParams.Shipment.Address.builder()
                            .city("x")
                            .line1("x")
                            .name("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .line3("x")
                            .phoneNumber("x")
                            .build()
                    )
                    .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PhysicalCardCreateParams.builder()
                .cardId("string")
                .cardProfileId("string")
                .cardholder(
                    PhysicalCardCreateParams.Cardholder.builder()
                        .firstName("x")
                        .lastName("x")
                        .build()
                )
                .shipment(
                    PhysicalCardCreateParams.Shipment.builder()
                        .address(
                            PhysicalCardCreateParams.Shipment.Address.builder()
                                .city("x")
                                .line1("x")
                                .name("x")
                                .postalCode("x")
                                .state("x")
                                .build()
                        )
                        .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("string")
        assertThat(body.cardProfileId()).isEqualTo("string")
        assertThat(body.cardholder())
            .isEqualTo(
                PhysicalCardCreateParams.Cardholder.builder().firstName("x").lastName("x").build()
            )
        assertThat(body.shipment())
            .isEqualTo(
                PhysicalCardCreateParams.Shipment.builder()
                    .address(
                        PhysicalCardCreateParams.Shipment.Address.builder()
                            .city("x")
                            .line1("x")
                            .name("x")
                            .postalCode("x")
                            .state("x")
                            .build()
                    )
                    .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                    .build()
            )
    }
}
