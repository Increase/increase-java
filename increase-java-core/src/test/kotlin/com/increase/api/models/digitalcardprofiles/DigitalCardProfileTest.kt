// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileTest {

    @Test
    fun createDigitalCardProfile() {
        val digitalCardProfile =
            DigitalCardProfile.builder()
                .id("digital_card_profile_s3puplu90f04xhcwkiga")
                .appIconFileId("file_makxrc67oh9l6sg7w9yc")
                .backgroundImageFileId("file_makxrc67oh9l6sg7w9yc")
                .cardDescription("Black Card")
                .contactEmail("user@example.com")
                .contactPhone("+18882988865")
                .contactWebsite("https://example.com")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("Corporate logo Apple Pay Card")
                .idempotencyKey(null)
                .issuerName("National Phonograph Company")
                .status(DigitalCardProfile.Status.PENDING)
                .textColor(
                    DigitalCardProfile.TextColor.builder().blue(230L).green(255L).red(189L).build()
                )
                .type(DigitalCardProfile.Type.DIGITAL_CARD_PROFILE)
                .build()
        assertThat(digitalCardProfile).isNotNull
        assertThat(digitalCardProfile.id()).isEqualTo("digital_card_profile_s3puplu90f04xhcwkiga")
        assertThat(digitalCardProfile.appIconFileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(digitalCardProfile.backgroundImageFileId())
            .isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(digitalCardProfile.cardDescription()).isEqualTo("Black Card")
        assertThat(digitalCardProfile.contactEmail()).contains("user@example.com")
        assertThat(digitalCardProfile.contactPhone()).contains("+18882988865")
        assertThat(digitalCardProfile.contactWebsite()).contains("https://example.com")
        assertThat(digitalCardProfile.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(digitalCardProfile.description()).isEqualTo("Corporate logo Apple Pay Card")
        assertThat(digitalCardProfile.idempotencyKey()).isEmpty
        assertThat(digitalCardProfile.issuerName()).isEqualTo("National Phonograph Company")
        assertThat(digitalCardProfile.status()).isEqualTo(DigitalCardProfile.Status.PENDING)
        assertThat(digitalCardProfile.textColor())
            .isEqualTo(
                DigitalCardProfile.TextColor.builder().blue(230L).green(255L).red(189L).build()
            )
        assertThat(digitalCardProfile.type())
            .isEqualTo(DigitalCardProfile.Type.DIGITAL_CARD_PROFILE)
    }
}
