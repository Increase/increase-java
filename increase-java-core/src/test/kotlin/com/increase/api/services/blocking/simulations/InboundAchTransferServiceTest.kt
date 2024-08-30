// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.http.BinaryResponseContent
import com.increase.api.services.blocking.simulations.InboundAchTransferService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class InboundAchTransferServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundAchTransferService = client.simulations().inboundAchTransfers()
      val inboundAchTransfer = inboundAchTransferService.create(SimulationInboundAchTransferCreateParams.builder()
          .accountNumberId("account_number_id")
          .amount(123L)
          .companyDescriptiveDate("x")
          .companyDiscretionaryData("x")
          .companyEntryDescription("x")
          .companyId("x")
          .companyName("x")
          .receiverIdNumber("x")
          .receiverName("x")
          .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .standardEntryClassCode(SimulationInboundAchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
          .build())
      println(inboundAchTransfer)
      inboundAchTransfer.validate()
    }
}
