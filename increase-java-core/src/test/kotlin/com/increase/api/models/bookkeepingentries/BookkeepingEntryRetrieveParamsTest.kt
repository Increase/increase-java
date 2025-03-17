// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingEntryRetrieveParamsTest {

    @Test
    fun create() {
        BookkeepingEntryRetrieveParams.builder()
            .bookkeepingEntryId("bookkeeping_entry_ctjpajsj3ks2blx10375")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            BookkeepingEntryRetrieveParams.builder()
                .bookkeepingEntryId("bookkeeping_entry_ctjpajsj3ks2blx10375")
                .build()
        assertThat(params).isNotNull
        // path param "bookkeepingEntryId"
        assertThat(params.getPathParam(0)).isEqualTo("bookkeeping_entry_ctjpajsj3ks2blx10375")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
