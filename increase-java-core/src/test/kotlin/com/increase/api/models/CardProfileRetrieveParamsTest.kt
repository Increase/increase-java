// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardProfileRetrieveParamsTest {

    @Test
    fun createCardProfileRetrieveParams() {
        CardProfileRetrieveParams.builder().cardProfileId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = CardProfileRetrieveParams.builder().cardProfileId("string").build()
        assertThat(params).isNotNull
        // path param "cardProfileId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
