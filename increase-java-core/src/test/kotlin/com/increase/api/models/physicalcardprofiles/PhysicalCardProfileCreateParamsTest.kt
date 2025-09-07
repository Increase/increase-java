// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardProfileCreateParamsTest {

    @Test
    fun create() {
        PhysicalCardProfileCreateParams.builder()
            .carrierImageFileId("file_h6v7mtipe119os47ehlu")
            .contactPhone("+16505046304")
            .description("My Card Profile")
            .frontImageFileId("file_o6aex13wm1jcc36sgcj1")
            .programId("program_i2v2os4mwza1oetokh9i")
            .backColor(PhysicalCardProfileCreateParams.BackColor.BLACK)
            .cardStockReference("x")
            .carrierStockReference("x")
            .frontColor(PhysicalCardProfileCreateParams.FrontColor.BLACK)
            .frontText(
                PhysicalCardProfileCreateParams.FrontText.builder().line1("x").line2("x").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PhysicalCardProfileCreateParams.builder()
                .carrierImageFileId("file_h6v7mtipe119os47ehlu")
                .contactPhone("+16505046304")
                .description("My Card Profile")
                .frontImageFileId("file_o6aex13wm1jcc36sgcj1")
                .programId("program_i2v2os4mwza1oetokh9i")
                .backColor(PhysicalCardProfileCreateParams.BackColor.BLACK)
                .cardStockReference("x")
                .carrierStockReference("x")
                .frontColor(PhysicalCardProfileCreateParams.FrontColor.BLACK)
                .frontText(
                    PhysicalCardProfileCreateParams.FrontText.builder()
                        .line1("x")
                        .line2("x")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.carrierImageFileId()).isEqualTo("file_h6v7mtipe119os47ehlu")
        assertThat(body.contactPhone()).isEqualTo("+16505046304")
        assertThat(body.description()).isEqualTo("My Card Profile")
        assertThat(body.frontImageFileId()).isEqualTo("file_o6aex13wm1jcc36sgcj1")
        assertThat(body.programId()).isEqualTo("program_i2v2os4mwza1oetokh9i")
        assertThat(body.backColor()).contains(PhysicalCardProfileCreateParams.BackColor.BLACK)
        assertThat(body.cardStockReference()).contains("x")
        assertThat(body.carrierStockReference()).contains("x")
        assertThat(body.frontColor()).contains(PhysicalCardProfileCreateParams.FrontColor.BLACK)
        assertThat(body.frontText())
            .contains(
                PhysicalCardProfileCreateParams.FrontText.builder().line1("x").line2("x").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PhysicalCardProfileCreateParams.builder()
                .carrierImageFileId("file_h6v7mtipe119os47ehlu")
                .contactPhone("+16505046304")
                .description("My Card Profile")
                .frontImageFileId("file_o6aex13wm1jcc36sgcj1")
                .programId("program_i2v2os4mwza1oetokh9i")
                .build()

        val body = params._body()

        assertThat(body.carrierImageFileId()).isEqualTo("file_h6v7mtipe119os47ehlu")
        assertThat(body.contactPhone()).isEqualTo("+16505046304")
        assertThat(body.description()).isEqualTo("My Card Profile")
        assertThat(body.frontImageFileId()).isEqualTo("file_o6aex13wm1jcc36sgcj1")
        assertThat(body.programId()).isEqualTo("program_i2v2os4mwza1oetokh9i")
    }
}
