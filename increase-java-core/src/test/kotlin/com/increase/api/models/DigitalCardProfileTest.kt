// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileTest {

    @Test
    fun createDigitalCardProfile() {
        val digitalCardProfile =
            DigitalCardProfile.builder()
                .id("string")
                .appIconFileId("string")
                .backgroundImageFileId("string")
                .cardDescription("string")
                .contactEmail("string")
                .contactPhone("string")
                .contactWebsite("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .idempotencyKey("string")
                .isDefault(true)
                .issuerName("string")
                .status(DigitalCardProfile.Status.PENDING)
                .textColor(
                    DigitalCardProfile.TextColor.builder().blue(123L).green(123L).red(123L).build()
                )
                .type(DigitalCardProfile.Type.DIGITAL_CARD_PROFILE)
                .build()
        assertThat(digitalCardProfile).isNotNull
        assertThat(digitalCardProfile.id()).isEqualTo("string")
        assertThat(digitalCardProfile.appIconFileId()).isEqualTo("string")
        assertThat(digitalCardProfile.backgroundImageFileId()).isEqualTo("string")
        assertThat(digitalCardProfile.cardDescription()).isEqualTo("string")
        assertThat(digitalCardProfile.contactEmail()).contains("string")
        assertThat(digitalCardProfile.contactPhone()).contains("string")
        assertThat(digitalCardProfile.contactWebsite()).contains("string")
        assertThat(digitalCardProfile.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(digitalCardProfile.description()).isEqualTo("string")
        assertThat(digitalCardProfile.idempotencyKey()).contains("string")
        assertThat(digitalCardProfile.isDefault()).isEqualTo(true)
        assertThat(digitalCardProfile.issuerName()).isEqualTo("string")
        assertThat(digitalCardProfile.status()).isEqualTo(DigitalCardProfile.Status.PENDING)
        assertThat(digitalCardProfile.textColor())
            .isEqualTo(
                DigitalCardProfile.TextColor.builder().blue(123L).green(123L).red(123L).build()
            )
        assertThat(digitalCardProfile.type())
            .isEqualTo(DigitalCardProfile.Type.DIGITAL_CARD_PROFILE)
    }
}
