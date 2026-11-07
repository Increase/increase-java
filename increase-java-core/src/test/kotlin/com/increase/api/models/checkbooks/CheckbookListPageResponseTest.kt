// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckbookListPageResponseTest {

    @Test
    fun create() {
        val checkbookListPageResponse =
            CheckbookListPageResponse.builder()
                .addData(
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
                                Checkbook.Payer.builder()
                                    .contents("National Phonograph Company")
                                    .build(),
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(checkbookListPageResponse.data())
            .containsExactly(
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
                            Checkbook.Payer.builder()
                                .contents("National Phonograph Company")
                                .build(),
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
            )
        assertThat(checkbookListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkbookListPageResponse =
            CheckbookListPageResponse.builder()
                .addData(
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
                                Checkbook.Payer.builder()
                                    .contents("National Phonograph Company")
                                    .build(),
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedCheckbookListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkbookListPageResponse),
                jacksonTypeRef<CheckbookListPageResponse>(),
            )

        assertThat(roundtrippedCheckbookListPageResponse).isEqualTo(checkbookListPageResponse)
    }
}
