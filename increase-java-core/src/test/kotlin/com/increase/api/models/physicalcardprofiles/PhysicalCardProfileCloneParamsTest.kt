// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardProfileCloneParamsTest {

    @Test
    fun create() {
        PhysicalCardProfileCloneParams.builder()
            .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
            .carrierImageFileId("carrier_image_file_id")
            .contactPhone("x")
            .description("x")
            .frontImageFileId("file_o6aex13wm1jcc36sgcj1")
            .frontText(
                PhysicalCardProfileCloneParams.FrontText.builder().line1("x").line2("x").build()
            )
            .programId("program_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhysicalCardProfileCloneParams.builder()
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("physical_card_profile_m534d5rn9qyy9ufqxoec")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhysicalCardProfileCloneParams.builder()
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .carrierImageFileId("carrier_image_file_id")
                .contactPhone("x")
                .description("x")
                .frontImageFileId("file_o6aex13wm1jcc36sgcj1")
                .frontText(
                    PhysicalCardProfileCloneParams.FrontText.builder().line1("x").line2("x").build()
                )
                .programId("program_id")
                .build()

        val body = params._body()

        assertThat(body.carrierImageFileId()).contains("carrier_image_file_id")
        assertThat(body.contactPhone()).contains("x")
        assertThat(body.description()).contains("x")
        assertThat(body.frontImageFileId()).contains("file_o6aex13wm1jcc36sgcj1")
        assertThat(body.frontText())
            .contains(
                PhysicalCardProfileCloneParams.FrontText.builder().line1("x").line2("x").build()
            )
        assertThat(body.programId()).contains("program_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhysicalCardProfileCloneParams.builder()
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .build()

        val body = params._body()
    }
}
