// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrafiExclusionTest {

    @Test
    fun create() {
        val intrafiExclusion =
            IntrafiExclusion.builder()
                .id("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
                .bankName("Example Bank")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .excludedAt(OffsetDateTime.parse("2020-02-01T23:59:59+00:00"))
                .fdicCertificateNumber("314159")
                .idempotencyKey(null)
                .status(IntrafiExclusion.Status.PENDING)
                .submittedAt(OffsetDateTime.parse("2020-02-01T00:59:59+00:00"))
                .type(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
                .build()

        assertThat(intrafiExclusion.id()).isEqualTo("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
        assertThat(intrafiExclusion.bankName()).isEqualTo("Example Bank")
        assertThat(intrafiExclusion.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(intrafiExclusion.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(intrafiExclusion.excludedAt())
            .contains(OffsetDateTime.parse("2020-02-01T23:59:59+00:00"))
        assertThat(intrafiExclusion.fdicCertificateNumber()).contains("314159")
        assertThat(intrafiExclusion.idempotencyKey()).isEmpty
        assertThat(intrafiExclusion.status()).isEqualTo(IntrafiExclusion.Status.PENDING)
        assertThat(intrafiExclusion.submittedAt())
            .contains(OffsetDateTime.parse("2020-02-01T00:59:59+00:00"))
        assertThat(intrafiExclusion.type()).isEqualTo(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val intrafiExclusion =
            IntrafiExclusion.builder()
                .id("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
                .bankName("Example Bank")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .excludedAt(OffsetDateTime.parse("2020-02-01T23:59:59+00:00"))
                .fdicCertificateNumber("314159")
                .idempotencyKey(null)
                .status(IntrafiExclusion.Status.PENDING)
                .submittedAt(OffsetDateTime.parse("2020-02-01T00:59:59+00:00"))
                .type(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
                .build()

        val roundtrippedIntrafiExclusion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(intrafiExclusion),
                jacksonTypeRef<IntrafiExclusion>(),
            )

        assertThat(roundtrippedIntrafiExclusion).isEqualTo(intrafiExclusion)
    }
}
