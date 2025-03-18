// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalCardProfileArchiveParamsTest {

    @Test
    fun create() {
        DigitalCardProfileArchiveParams.builder()
            .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DigitalCardProfileArchiveParams.builder()
                .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("digital_card_profile_s3puplu90f04xhcwkiga")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
