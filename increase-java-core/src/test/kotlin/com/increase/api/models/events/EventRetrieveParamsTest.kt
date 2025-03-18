// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.events

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventRetrieveParamsTest {

    @Test
    fun create() {
        EventRetrieveParams.builder().eventId("event_001dzz0r20rzr4zrhrr1364hy80").build()
    }

    @Test
    fun pathParams() {
        val params =
            EventRetrieveParams.builder().eventId("event_001dzz0r20rzr4zrhrr1364hy80").build()

        assertThat(params._pathParam(0)).isEqualTo("event_001dzz0r20rzr4zrhrr1364hy80")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
