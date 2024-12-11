// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiExclusionTest {

    @Test
    fun createIntrafiExclusion() {
        val intrafiExclusion =
            IntrafiExclusion.builder()
                .id("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
                .bankName("Example Bank")
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .excludedAt(OffsetDateTime.parse("2020-02-01T23:59:59+00:00"))
                .fdicCertificateNumber("314159")
                .status(IntrafiExclusion.Status.PENDING)
                .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
                .build()
        assertThat(intrafiExclusion).isNotNull
        assertThat(intrafiExclusion.id()).isEqualTo("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
        assertThat(intrafiExclusion.bankName()).isEqualTo("Example Bank")
        assertThat(intrafiExclusion.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(intrafiExclusion.excludedAt())
            .contains(OffsetDateTime.parse("2020-02-01T23:59:59+00:00"))
        assertThat(intrafiExclusion.fdicCertificateNumber()).contains("314159")
        assertThat(intrafiExclusion.status()).isEqualTo(IntrafiExclusion.Status.PENDING)
        assertThat(intrafiExclusion.submittedAt())
            .contains(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(intrafiExclusion.type()).isEqualTo(IntrafiExclusion.Type.INTRAFI_EXCLUSION)
    }
}
