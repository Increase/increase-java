// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardProfileRetrieveParamsTest {

    @Test
    fun create() {
        PhysicalCardProfileRetrieveParams.builder()
            .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhysicalCardProfileRetrieveParams.builder()
                .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("physical_card_profile_m534d5rn9qyy9ufqxoec")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
