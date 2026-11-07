// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckbookTest {

    @Test
    fun create() {
        val checkbook =
            Checkbook.builder()
                .id("checkbook_7iudxhxum6vlkcjxmi8y")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .mailingAddress(
                    Checkbook.MailingAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .name("Ian Crease")
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .payer(
                    listOf(
                        Checkbook.Payer.builder().contents("National Phonograph Company").build(),
                        Checkbook.Payer.builder().contents("33 Liberty Street").build(),
                        Checkbook.Payer.builder().contents("New York, NY 10045").build(),
                    )
                )
                .returnAddress(
                    Checkbook.ReturnAddress.builder()
                        .city("San Francisco")
                        .line1("244 Kearny St")
                        .line2("Floor 8")
                        .name("Undeliverable Mail")
                        .postalCode("94108")
                        .state("CA")
                        .build()
                )
                .status(Checkbook.Status.MAILED)
                .style(Checkbook.Style.THREE_RING_BINDER)
                .addTrackingUpdate(
                    Checkbook.TrackingUpdate.builder()
                        .category(Checkbook.TrackingUpdate.Category.IN_TRANSIT)
                        .country("US")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .postalCode("10045")
                        .build()
                )
                .addTrackingUpdate(
                    Checkbook.TrackingUpdate.builder()
                        .category(Checkbook.TrackingUpdate.Category.DELIVERED)
                        .country("US")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .postalCode("10045")
                        .build()
                )
                .type(Checkbook.Type.CHECKBOOK)
                .build()

        assertThat(checkbook.id()).isEqualTo("checkbook_7iudxhxum6vlkcjxmi8y")
        assertThat(checkbook.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(checkbook.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(checkbook.idempotencyKey()).isEmpty
        assertThat(checkbook.mailingAddress())
            .isEqualTo(
                Checkbook.MailingAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .line2(null)
                    .name("Ian Crease")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(checkbook.payer())
            .containsExactly(
                Checkbook.Payer.builder().contents("National Phonograph Company").build(),
                Checkbook.Payer.builder().contents("33 Liberty Street").build(),
                Checkbook.Payer.builder().contents("New York, NY 10045").build(),
            )
        assertThat(checkbook.returnAddress())
            .isEqualTo(
                Checkbook.ReturnAddress.builder()
                    .city("San Francisco")
                    .line1("244 Kearny St")
                    .line2("Floor 8")
                    .name("Undeliverable Mail")
                    .postalCode("94108")
                    .state("CA")
                    .build()
            )
        assertThat(checkbook.status()).isEqualTo(Checkbook.Status.MAILED)
        assertThat(checkbook.style()).isEqualTo(Checkbook.Style.THREE_RING_BINDER)
        assertThat(checkbook.trackingUpdates())
            .containsExactly(
                Checkbook.TrackingUpdate.builder()
                    .category(Checkbook.TrackingUpdate.Category.IN_TRANSIT)
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .postalCode("10045")
                    .build(),
                Checkbook.TrackingUpdate.builder()
                    .category(Checkbook.TrackingUpdate.Category.DELIVERED)
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .postalCode("10045")
                    .build(),
            )
        assertThat(checkbook.type()).isEqualTo(Checkbook.Type.CHECKBOOK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkbook =
            Checkbook.builder()
                .id("checkbook_7iudxhxum6vlkcjxmi8y")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .mailingAddress(
                    Checkbook.MailingAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .name("Ian Crease")
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .payer(
                    listOf(
                        Checkbook.Payer.builder().contents("National Phonograph Company").build(),
                        Checkbook.Payer.builder().contents("33 Liberty Street").build(),
                        Checkbook.Payer.builder().contents("New York, NY 10045").build(),
                    )
                )
                .returnAddress(
                    Checkbook.ReturnAddress.builder()
                        .city("San Francisco")
                        .line1("244 Kearny St")
                        .line2("Floor 8")
                        .name("Undeliverable Mail")
                        .postalCode("94108")
                        .state("CA")
                        .build()
                )
                .status(Checkbook.Status.MAILED)
                .style(Checkbook.Style.THREE_RING_BINDER)
                .addTrackingUpdate(
                    Checkbook.TrackingUpdate.builder()
                        .category(Checkbook.TrackingUpdate.Category.IN_TRANSIT)
                        .country("US")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .postalCode("10045")
                        .build()
                )
                .addTrackingUpdate(
                    Checkbook.TrackingUpdate.builder()
                        .category(Checkbook.TrackingUpdate.Category.DELIVERED)
                        .country("US")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .postalCode("10045")
                        .build()
                )
                .type(Checkbook.Type.CHECKBOOK)
                .build()

        val roundtrippedCheckbook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkbook),
                jacksonTypeRef<Checkbook>(),
            )

        assertThat(roundtrippedCheckbook).isEqualTo(checkbook)
    }
}
