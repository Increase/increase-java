// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileArchiveParamsTest {

    @Test
    fun createDigitalCardProfileArchiveParams() {
        DigitalCardProfileArchiveParams.builder()
            .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            DigitalCardProfileArchiveParams.builder()
                .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                .build()
        assertThat(params).isNotNull
        // path param "digitalCardProfileId"
        assertThat(params.getPathParam(0)).isEqualTo("digital_card_profile_s3puplu90f04xhcwkiga")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
