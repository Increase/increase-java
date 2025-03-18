// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentRetrieveParamsTest {

    @Test
    fun create() {
        DocumentRetrieveParams.builder().documentId("document_qjtqc6s4c14ve2q89izm").build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentRetrieveParams.builder().documentId("document_qjtqc6s4c14ve2q89izm").build()

        assertThat(params._pathParam(0)).isEqualTo("document_qjtqc6s4c14ve2q89izm")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
