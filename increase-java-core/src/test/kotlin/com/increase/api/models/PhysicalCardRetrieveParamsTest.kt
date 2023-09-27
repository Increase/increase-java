package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardRetrieveParamsTest {

    @Test
    fun createPhysicalCardRetrieveParams() {
        PhysicalCardRetrieveParams.builder().physicalCardId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = PhysicalCardRetrieveParams.builder().physicalCardId("string").build()
        assertThat(params).isNotNull
        // path param "physicalCardId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
