// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbookchecks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckbookCheckStopParamsTest {

    @Test
    fun create() {
        CheckbookCheckStopParams.builder()
            .checkbookCheckId("checkbook_check_klgh3z50guf6jcnfhibb")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CheckbookCheckStopParams.builder()
                .checkbookCheckId("checkbook_check_klgh3z50guf6jcnfhibb")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("checkbook_check_klgh3z50guf6jcnfhibb")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
