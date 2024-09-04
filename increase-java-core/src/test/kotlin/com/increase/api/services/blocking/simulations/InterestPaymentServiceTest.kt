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
import com.increase.api.services.blocking.simulations.InterestPaymentService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class InterestPaymentServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val interestPaymentService = client.simulations().interestPayments()
      val transaction = interestPaymentService.create(SimulationInterestPaymentCreateParams.builder()
          .accountId("account_id")
          .amount(123L)
          .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
      println(transaction)
      transaction.validate()
    }
}
