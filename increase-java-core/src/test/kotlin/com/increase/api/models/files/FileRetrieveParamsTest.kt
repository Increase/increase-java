// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileRetrieveParamsTest {

    @Test
    fun create() {
        FileRetrieveParams.builder().fileId("file_makxrc67oh9l6sg7w9yc").build()
    }

    @Test
    fun pathParams() {
        val params = FileRetrieveParams.builder().fileId("file_makxrc67oh9l6sg7w9yc").build()

        assertThat(params._pathParam(0)).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
