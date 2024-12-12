// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingEntrySetRetrieveParamsTest {

    @Test
    fun createBookkeepingEntrySetRetrieveParams() {
        BookkeepingEntrySetRetrieveParams.builder()
            .bookkeepingEntrySetId("bookkeeping_entry_set_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            BookkeepingEntrySetRetrieveParams.builder()
                .bookkeepingEntrySetId("bookkeeping_entry_set_id")
                .build()
        assertThat(params).isNotNull
        // path param "bookkeepingEntrySetId"
        assertThat(params.getPathParam(0)).isEqualTo("bookkeeping_entry_set_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
