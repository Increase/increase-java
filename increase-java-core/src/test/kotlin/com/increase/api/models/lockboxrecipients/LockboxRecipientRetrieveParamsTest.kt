// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxrecipients

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxRecipientRetrieveParamsTest {

    @Test
    fun create() {
        LockboxRecipientRetrieveParams.builder()
            .lockboxRecipientId("lockbox_3xt21ok13q19advds4t5")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LockboxRecipientRetrieveParams.builder()
                .lockboxRecipientId("lockbox_3xt21ok13q19advds4t5")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("lockbox_3xt21ok13q19advds4t5")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
