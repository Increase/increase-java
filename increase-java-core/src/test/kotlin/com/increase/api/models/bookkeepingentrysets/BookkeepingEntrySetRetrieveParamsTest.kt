// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingEntrySetRetrieveParamsTest {

    @Test
    fun create() {
        BookkeepingEntrySetRetrieveParams.builder()
            .bookkeepingEntrySetId("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BookkeepingEntrySetRetrieveParams.builder()
                .bookkeepingEntrySetId("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
