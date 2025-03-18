// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportRetrieveParamsTest {

    @Test
    fun create() {
        ExportRetrieveParams.builder().exportId("export_8s4m48qz3bclzje0zwh9").build()
    }

    @Test
    fun pathParams() {
        val params = ExportRetrieveParams.builder().exportId("export_8s4m48qz3bclzje0zwh9").build()

        assertThat(params._pathParam(0)).isEqualTo("export_8s4m48qz3bclzje0zwh9")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
