// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileRetrieveParamsTest {

    @Test
    fun create() {
      FileRetrieveParams.builder()
          .fileId("file_makxrc67oh9l6sg7w9yc")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = FileRetrieveParams.builder()
          .fileId("file_makxrc67oh9l6sg7w9yc")
          .build()
      assertThat(params).isNotNull
      // path param "fileId"
      assertThat(params.getPathParam(0)).isEqualTo("file_makxrc67oh9l6sg7w9yc")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
