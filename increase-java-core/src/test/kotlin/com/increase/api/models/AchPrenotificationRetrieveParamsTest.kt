// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchPrenotificationRetrieveParamsTest {

    @Test
    fun create() {
        AchPrenotificationRetrieveParams.builder()
            .achPrenotificationId("ach_prenotification_ubjf9qqsxl3obbcn1u34")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            AchPrenotificationRetrieveParams.builder()
                .achPrenotificationId("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                .build()
        assertThat(params).isNotNull
        // path param "achPrenotificationId"
        assertThat(params.getPathParam(0)).isEqualTo("ach_prenotification_ubjf9qqsxl3obbcn1u34")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
