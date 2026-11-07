// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.checkbooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckbookMailParamsTest {

    @Test
    fun create() {
        CheckbookMailParams.builder().checkbookId("checkbook_7iudxhxum6vlkcjxmi8y").build()
    }

    @Test
    fun pathParams() {
        val params =
            CheckbookMailParams.builder().checkbookId("checkbook_7iudxhxum6vlkcjxmi8y").build()

        assertThat(params._pathParam(0)).isEqualTo("checkbook_7iudxhxum6vlkcjxmi8y")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
