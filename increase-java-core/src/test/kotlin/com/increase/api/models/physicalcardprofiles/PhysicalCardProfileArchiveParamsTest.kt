// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardProfileArchiveParamsTest {

    @Test
    fun create() {
        PhysicalCardProfileArchiveParams.builder()
            .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            PhysicalCardProfileArchiveParams.builder()
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .build()
        assertThat(params).isNotNull
        // path param "physicalCardProfileId"
        assertThat(params.getPathParam(0)).isEqualTo("physical_card_profile_m534d5rn9qyy9ufqxoec")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
