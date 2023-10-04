// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardRetrieveSensitiveDetailsParamsTest {

    @Test
    fun createCardRetrieveSensitiveDetailsParams() {
        CardRetrieveSensitiveDetailsParams.builder().cardId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = CardRetrieveSensitiveDetailsParams.builder().cardId("string").build()
        assertThat(params).isNotNull
        // path param "cardId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
