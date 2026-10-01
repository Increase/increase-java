// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcheckbatches

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCheckBatchCreateParamsTest {

    @Test
    fun create() {
        PhysicalCheckBatchCreateParams.builder()
            .mailingAddress(
                PhysicalCheckBatchCreateParams.MailingAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .name("Ian Crease")
                    .postalCode("10045")
                    .state("NY")
                    .line2("line2")
                    .phone("x")
                    .build()
            )
            .returnAddress(
                PhysicalCheckBatchCreateParams.ReturnAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .name("National Phonograph Company")
                    .postalCode("10045")
                    .state("NY")
                    .line2("line2")
                    .phone("x")
                    .build()
            )
            .shippingMethod(PhysicalCheckBatchCreateParams.ShippingMethod.USPS_FIRST_CLASS)
            .build()
    }

    @Test
    fun body() {
        val params =
            PhysicalCheckBatchCreateParams.builder()
                .mailingAddress(
                    PhysicalCheckBatchCreateParams.MailingAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .name("Ian Crease")
                        .postalCode("10045")
                        .state("NY")
                        .line2("line2")
                        .phone("x")
                        .build()
                )
                .returnAddress(
                    PhysicalCheckBatchCreateParams.ReturnAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .name("National Phonograph Company")
                        .postalCode("10045")
                        .state("NY")
                        .line2("line2")
                        .phone("x")
                        .build()
                )
                .shippingMethod(PhysicalCheckBatchCreateParams.ShippingMethod.USPS_FIRST_CLASS)
                .build()

        val body = params._body()

        assertThat(body.mailingAddress())
            .isEqualTo(
                PhysicalCheckBatchCreateParams.MailingAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .name("Ian Crease")
                    .postalCode("10045")
                    .state("NY")
                    .line2("line2")
                    .phone("x")
                    .build()
            )
        assertThat(body.returnAddress())
            .isEqualTo(
                PhysicalCheckBatchCreateParams.ReturnAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .name("National Phonograph Company")
                    .postalCode("10045")
                    .state("NY")
                    .line2("line2")
                    .phone("x")
                    .build()
            )
        assertThat(body.shippingMethod())
            .contains(PhysicalCheckBatchCreateParams.ShippingMethod.USPS_FIRST_CLASS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhysicalCheckBatchCreateParams.builder()
                .mailingAddress(
                    PhysicalCheckBatchCreateParams.MailingAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .name("Ian Crease")
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .returnAddress(
                    PhysicalCheckBatchCreateParams.ReturnAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .name("National Phonograph Company")
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.mailingAddress())
            .isEqualTo(
                PhysicalCheckBatchCreateParams.MailingAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .name("Ian Crease")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(body.returnAddress())
            .isEqualTo(
                PhysicalCheckBatchCreateParams.ReturnAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .name("National Phonograph Company")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
    }
}
