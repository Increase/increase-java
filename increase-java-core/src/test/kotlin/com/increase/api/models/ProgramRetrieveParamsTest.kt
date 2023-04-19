package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProgramRetrieveParamsTest {

    @Test
    fun createProgramRetrieveParams() {
        ProgramRetrieveParams.builder().programId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = ProgramRetrieveParams.builder().programId("string").build()
        assertThat(params).isNotNull
        // path param "programId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
