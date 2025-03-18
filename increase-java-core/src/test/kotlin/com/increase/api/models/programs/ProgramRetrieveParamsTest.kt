// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.programs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProgramRetrieveParamsTest {

    @Test
    fun create() {
        ProgramRetrieveParams.builder().programId("program_i2v2os4mwza1oetokh9i").build()
    }

    @Test
    fun pathParams() {
        val params =
            ProgramRetrieveParams.builder().programId("program_i2v2os4mwza1oetokh9i").build()

        assertThat(params._pathParam(0)).isEqualTo("program_i2v2os4mwza1oetokh9i")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
