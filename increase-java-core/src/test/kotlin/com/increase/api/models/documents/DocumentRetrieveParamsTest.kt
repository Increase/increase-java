// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentRetrieveParamsTest {

    @Test
    fun create() {
        DocumentRetrieveParams.builder().documentId("document_qjtqc6s4c14ve2q89izm").build()
    }

    @Test
    fun getPathParam() {
        val params =
            DocumentRetrieveParams.builder().documentId("document_qjtqc6s4c14ve2q89izm").build()
        assertThat(params).isNotNull
        // path param "documentId"
        assertThat(params.getPathParam(0)).isEqualTo("document_qjtqc6s4c14ve2q89izm")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
