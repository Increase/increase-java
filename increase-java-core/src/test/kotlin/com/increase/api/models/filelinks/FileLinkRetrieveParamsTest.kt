// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.filelinks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileLinkRetrieveParamsTest {

    @Test
    fun create() {
        FileLinkRetrieveParams.builder().fileLinkId("file_link_roapsuicj7kp1lzyus04").build()
    }

    @Test
    fun getPathParam() {
        val params =
            FileLinkRetrieveParams.builder().fileLinkId("file_link_roapsuicj7kp1lzyus04").build()
        assertThat(params).isNotNull
        // path param "fileLinkId"
        assertThat(params.getPathParam(0)).isEqualTo("file_link_roapsuicj7kp1lzyus04")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
