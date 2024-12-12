// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProgramRetrieveParamsTest {

    @Test
    fun createProgramRetrieveParams() {
        ProgramRetrieveParams.builder().programId("program_id").build()
    }

    @Test
    fun getPathParam() {
        val params = ProgramRetrieveParams.builder().programId("program_id").build()
        assertThat(params).isNotNull
        // path param "programId"
        assertThat(params.getPathParam(0)).isEqualTo("program_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
