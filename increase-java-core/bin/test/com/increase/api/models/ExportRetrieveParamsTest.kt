// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExportRetrieveParamsTest {

    @Test
    fun createExportRetrieveParams() {
        ExportRetrieveParams.builder().exportId("export_id").build()
    }

    @Test
    fun getPathParam() {
        val params = ExportRetrieveParams.builder().exportId("export_id").build()
        assertThat(params).isNotNull
        // path param "exportId"
        assertThat(params.getPathParam(0)).isEqualTo("export_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
