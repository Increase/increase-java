// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcheckbatches

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCheckBatchTest {

    @Test
    fun create() {
        val physicalCheckBatch =
            PhysicalCheckBatch.builder()
                .id("physical_check_batch_yzdwjhdbw0in6191whce")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .mailingAddress(
                    PhysicalCheckBatch.MailingAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .name("Ian Crease")
                        .phone(null)
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .returnAddress(
                    PhysicalCheckBatch.ReturnAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .name("National Phonograph Company")
                        .phone(null)
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .shippingMethod(PhysicalCheckBatch.ShippingMethod.USPS_FIRST_CLASS)
                .status(PhysicalCheckBatch.Status.PENDING)
                .type(PhysicalCheckBatch.Type.PHYSICAL_CHECK_BATCH)
                .build()

        assertThat(physicalCheckBatch.id()).isEqualTo("physical_check_batch_yzdwjhdbw0in6191whce")
        assertThat(physicalCheckBatch.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(physicalCheckBatch.idempotencyKey()).isEmpty
        assertThat(physicalCheckBatch.mailingAddress())
            .isEqualTo(
                PhysicalCheckBatch.MailingAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .line2(null)
                    .name("Ian Crease")
                    .phone(null)
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(physicalCheckBatch.returnAddress())
            .isEqualTo(
                PhysicalCheckBatch.ReturnAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .line2(null)
                    .name("National Phonograph Company")
                    .phone(null)
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(physicalCheckBatch.shippingMethod())
            .isEqualTo(PhysicalCheckBatch.ShippingMethod.USPS_FIRST_CLASS)
        assertThat(physicalCheckBatch.status()).isEqualTo(PhysicalCheckBatch.Status.PENDING)
        assertThat(physicalCheckBatch.type())
            .isEqualTo(PhysicalCheckBatch.Type.PHYSICAL_CHECK_BATCH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val physicalCheckBatch =
            PhysicalCheckBatch.builder()
                .id("physical_check_batch_yzdwjhdbw0in6191whce")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .mailingAddress(
                    PhysicalCheckBatch.MailingAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .name("Ian Crease")
                        .phone(null)
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .returnAddress(
                    PhysicalCheckBatch.ReturnAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .name("National Phonograph Company")
                        .phone(null)
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .shippingMethod(PhysicalCheckBatch.ShippingMethod.USPS_FIRST_CLASS)
                .status(PhysicalCheckBatch.Status.PENDING)
                .type(PhysicalCheckBatch.Type.PHYSICAL_CHECK_BATCH)
                .build()

        val roundtrippedPhysicalCheckBatch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(physicalCheckBatch),
                jacksonTypeRef<PhysicalCheckBatch>(),
            )

        assertThat(roundtrippedPhysicalCheckBatch).isEqualTo(physicalCheckBatch)
    }
}
