// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventRetrieveParamsTest {

    @Test
    fun createEventRetrieveParams() {
        EventRetrieveParams.builder().eventId("event_id").build()
    }

    @Test
    fun getPathParam() {
        val params = EventRetrieveParams.builder().eventId("event_id").build()
        assertThat(params).isNotNull
        // path param "eventId"
        assertThat(params.getPathParam(0)).isEqualTo("event_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
