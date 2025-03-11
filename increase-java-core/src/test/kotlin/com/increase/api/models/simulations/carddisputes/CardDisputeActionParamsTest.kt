// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.carddisputes

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDisputeActionParamsTest {

    @Test
    fun create() {
      CardDisputeActionParams.builder()
          .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
          .status(CardDisputeActionParams.Status.PENDING_USER_INFORMATION)
          .explanation("This was a valid recurring transaction")
          .build()
    }

    @Test
    fun body() {
      val params = CardDisputeActionParams.builder()
          .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
          .status(CardDisputeActionParams.Status.PENDING_USER_INFORMATION)
          .explanation("This was a valid recurring transaction")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.status()).isEqualTo(CardDisputeActionParams.Status.PENDING_USER_INFORMATION)
      assertThat(body.explanation()).contains("This was a valid recurring transaction")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = CardDisputeActionParams.builder()
          .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
          .status(CardDisputeActionParams.Status.PENDING_USER_INFORMATION)
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.status()).isEqualTo(CardDisputeActionParams.Status.PENDING_USER_INFORMATION)
    }

    @Test
    fun getPathParam() {
      val params = CardDisputeActionParams.builder()
          .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
          .status(CardDisputeActionParams.Status.PENDING_USER_INFORMATION)
          .build()
      assertThat(params).isNotNull
      // path param "cardDisputeId"
      assertThat(params.getPathParam(0)).isEqualTo("card_dispute_h9sc95nbl1cgltpp7men")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
