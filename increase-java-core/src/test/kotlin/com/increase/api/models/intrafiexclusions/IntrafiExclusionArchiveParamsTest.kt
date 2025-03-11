// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiExclusionArchiveParamsTest {

    @Test
    fun create() {
      IntrafiExclusionArchiveParams.builder()
          .intrafiExclusionId("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = IntrafiExclusionArchiveParams.builder()
          .intrafiExclusionId("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
          .build()
      assertThat(params).isNotNull
      // path param "intrafiExclusionId"
      assertThat(params.getPathParam(0)).isEqualTo("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
