// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrafiExclusionArchiveParamsTest {

    @Test
    fun create() {
        IntrafiExclusionArchiveParams.builder()
            .intrafiExclusionId("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntrafiExclusionArchiveParams.builder()
                .intrafiExclusionId("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
