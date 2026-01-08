// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.swifttransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SwiftTransferCancelParamsTest {

    @Test
    fun create() {
        SwiftTransferCancelParams.builder()
            .swiftTransferId("swift_transfer_29h21xkng03788zwd3fh")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SwiftTransferCancelParams.builder()
                .swiftTransferId("swift_transfer_29h21xkng03788zwd3fh")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("swift_transfer_29h21xkng03788zwd3fh")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
