// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardProfileRetrieveParamsTest {

    @Test
    fun createPhysicalCardProfileRetrieveParams() {
        PhysicalCardProfileRetrieveParams.builder()
            .physicalCardProfileId("physical_card_profile_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            PhysicalCardProfileRetrieveParams.builder()
                .physicalCardProfileId("physical_card_profile_id")
                .build()
        assertThat(params).isNotNull
        // path param "physicalCardProfileId"
        assertThat(params.getPathParam(0)).isEqualTo("physical_card_profile_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
