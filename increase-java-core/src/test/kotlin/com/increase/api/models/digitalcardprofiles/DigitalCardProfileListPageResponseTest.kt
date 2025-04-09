// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalCardProfileListPageResponseTest {

    @Test
    fun create() {
        val digitalCardProfileListPageResponse =
            DigitalCardProfileListPageResponse.builder()
                .addData(
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
                        .status(DigitalCardProfile.Status.ACTIVE)
                        .textColor(
                            DigitalCardProfile.TextColor.builder()
                                .blue(230L)
                                .green(255L)
                                .red(189L)
                                .build()
                        )
                        .type(DigitalCardProfile.Type.DIGITAL_CARD_PROFILE)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(digitalCardProfileListPageResponse.data())
            .containsExactly(
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
                    .status(DigitalCardProfile.Status.ACTIVE)
                    .textColor(
                        DigitalCardProfile.TextColor.builder()
                            .blue(230L)
                            .green(255L)
                            .red(189L)
                            .build()
                    )
                    .type(DigitalCardProfile.Type.DIGITAL_CARD_PROFILE)
                    .build()
            )
        assertThat(digitalCardProfileListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalCardProfileListPageResponse =
            DigitalCardProfileListPageResponse.builder()
                .addData(
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
                        .status(DigitalCardProfile.Status.ACTIVE)
                        .textColor(
                            DigitalCardProfile.TextColor.builder()
                                .blue(230L)
                                .green(255L)
                                .red(189L)
                                .build()
                        )
                        .type(DigitalCardProfile.Type.DIGITAL_CARD_PROFILE)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedDigitalCardProfileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalCardProfileListPageResponse),
                jacksonTypeRef<DigitalCardProfileListPageResponse>(),
            )

        assertThat(roundtrippedDigitalCardProfileListPageResponse)
            .isEqualTo(digitalCardProfileListPageResponse)
    }
}
