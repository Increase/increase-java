// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProgramRetrieveParamsTest {

    @Test
    fun create() {
        ProgramRetrieveParams.builder().programId("program_i2v2os4mwza1oetokh9i").build()
    }

    @Test
    fun getPathParam() {
        val params =
            ProgramRetrieveParams.builder().programId("program_i2v2os4mwza1oetokh9i").build()
        assertThat(params).isNotNull
        // path param "programId"
        assertThat(params.getPathParam(0)).isEqualTo("program_i2v2os4mwza1oetokh9i")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
