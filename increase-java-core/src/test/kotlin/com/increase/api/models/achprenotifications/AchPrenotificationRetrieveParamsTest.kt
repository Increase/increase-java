// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AchPrenotificationRetrieveParamsTest {

    @Test
    fun create() {
        AchPrenotificationRetrieveParams.builder()
            .achPrenotificationId("ach_prenotification_ubjf9qqsxl3obbcn1u34")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AchPrenotificationRetrieveParams.builder()
                .achPrenotificationId("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ach_prenotification_ubjf9qqsxl3obbcn1u34")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
