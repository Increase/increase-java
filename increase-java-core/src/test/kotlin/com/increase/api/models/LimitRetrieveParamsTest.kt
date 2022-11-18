package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LimitRetrieveParamsTest {

    @Test
    fun createLimitRetrieveParams() {
        LimitRetrieveParams.builder().limitId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = LimitRetrieveParams.builder().limitId("string").build()
        assertThat(params).isNotNull
        // path param "limitId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
