// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.inboundmailitems.InboundMailItemCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundMailItemServiceAsyncTest {

    @Test
    fun create() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundMailItemServiceAsync = client.simulations().inboundMailItems()

      val inboundMailItemFuture = inboundMailItemServiceAsync.create(InboundMailItemCreateParams.builder()
          .amount(1000L)
          .lockboxId("lockbox_3xt21ok13q19advds4t5")
          .contentsFileId("contents_file_id")
          .build())

      val inboundMailItem = inboundMailItemFuture.get()
      inboundMailItem.validate()
    }
}
