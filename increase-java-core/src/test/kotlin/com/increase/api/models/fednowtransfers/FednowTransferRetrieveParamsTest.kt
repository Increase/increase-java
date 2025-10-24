// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.fednowtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FednowTransferRetrieveParamsTest {

    @Test
    fun create() {
        FednowTransferRetrieveParams.builder()
            .fednowTransferId("fednow_transfer_4i0mptrdu1mueg1196bg")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FednowTransferRetrieveParams.builder()
                .fednowTransferId("fednow_transfer_4i0mptrdu1mueg1196bg")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fednow_transfer_4i0mptrdu1mueg1196bg")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
