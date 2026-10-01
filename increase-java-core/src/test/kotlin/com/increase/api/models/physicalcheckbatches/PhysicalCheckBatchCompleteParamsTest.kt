// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcheckbatches

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCheckBatchCompleteParamsTest {

    @Test
    fun create() {
        PhysicalCheckBatchCompleteParams.builder()
            .physicalCheckBatchId("physical_check_batch_yzdwjhdbw0in6191whce")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PhysicalCheckBatchCompleteParams.builder()
                .physicalCheckBatchId("physical_check_batch_yzdwjhdbw0in6191whce")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("physical_check_batch_yzdwjhdbw0in6191whce")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
