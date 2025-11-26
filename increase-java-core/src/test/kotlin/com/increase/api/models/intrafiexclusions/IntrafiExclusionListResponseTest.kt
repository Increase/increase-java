// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrafiExclusionListResponseTest {

    @Test
    fun create() {
        val intrafiExclusionListResponse =
            IntrafiExclusionListResponse.builder()
                .addData(
                    IntrafiExclusion.builder()
                        .id("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
                        .bankName("Example Bank")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .excludedAt(OffsetDateTime.parse("2020-02-01T23:59:59+00:00"))
                        .fdicCertificateNumber("314159")
                        .idempotencyKey(null)
                        .status(IntrafiExclusion.Status.COMPLETED)
                        .submittedAt(OffsetDateTime.parse("2020-02-01T00:59:59+00:00"))
                        .type(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(intrafiExclusionListResponse.data())
            .containsExactly(
                IntrafiExclusion.builder()
                    .id("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
                    .bankName("Example Bank")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .excludedAt(OffsetDateTime.parse("2020-02-01T23:59:59+00:00"))
                    .fdicCertificateNumber("314159")
                    .idempotencyKey(null)
                    .status(IntrafiExclusion.Status.COMPLETED)
                    .submittedAt(OffsetDateTime.parse("2020-02-01T00:59:59+00:00"))
                    .type(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
                    .build()
            )
        assertThat(intrafiExclusionListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val intrafiExclusionListResponse =
            IntrafiExclusionListResponse.builder()
                .addData(
                    IntrafiExclusion.builder()
                        .id("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
                        .bankName("Example Bank")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .excludedAt(OffsetDateTime.parse("2020-02-01T23:59:59+00:00"))
                        .fdicCertificateNumber("314159")
                        .idempotencyKey(null)
                        .status(IntrafiExclusion.Status.COMPLETED)
                        .submittedAt(OffsetDateTime.parse("2020-02-01T00:59:59+00:00"))
                        .type(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedIntrafiExclusionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(intrafiExclusionListResponse),
                jacksonTypeRef<IntrafiExclusionListResponse>(),
            )

        assertThat(roundtrippedIntrafiExclusionListResponse).isEqualTo(intrafiExclusionListResponse)
    }
}
