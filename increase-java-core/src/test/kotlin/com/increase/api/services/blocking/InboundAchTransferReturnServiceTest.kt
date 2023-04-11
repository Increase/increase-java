package com.increase.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.services.blocking.InboundAchTransferReturnService
import com.increase.api.models.InboundAchTransferReturnListPage
import com.increase.api.models.InboundAchTransferReturnListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class InboundAchTransferReturnServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val inboundAchTransferReturnService = client.inboundAchTransferReturns()
      val inboundAchTransferReturn = inboundAchTransferReturnService.create(InboundAchTransferReturnCreateParams.builder()
          .transactionId("string")
          .reason(InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER)
          .build())
      println(inboundAchTransferReturn)
      inboundAchTransferReturn.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val inboundAchTransferReturnService = client.inboundAchTransferReturns()
      val inboundAchTransferReturn = inboundAchTransferReturnService.retrieve(InboundAchTransferReturnRetrieveParams.builder()
          .inboundAchTransferReturnId("string")
          .build())
      println(inboundAchTransferReturn)
      inboundAchTransferReturn.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val inboundAchTransferReturnService = client.inboundAchTransferReturns()
      val inboundAchTransferReturnList = inboundAchTransferReturnService.list(InboundAchTransferReturnListParams.builder().build())
      println(inboundAchTransferReturnList)
      inboundAchTransferReturnList.data().forEach {
          it.validate()
      }
    }
}
