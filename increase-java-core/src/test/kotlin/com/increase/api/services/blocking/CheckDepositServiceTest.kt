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
import com.increase.api.services.blocking.CheckDepositService
import com.increase.api.models.CheckDepositListPage
import com.increase.api.models.CheckDepositListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkDepositService = client.checkDeposits()
      val checkDeposit = checkDepositService.create(CheckDepositCreateParams.builder()
          .accountId("string")
          .amount(123L)
          .currency("x")
          .frontImageFileId("string")
          .backImageFileId("string")
          .build())
      println(checkDeposit)
      checkDeposit.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkDepositService = client.checkDeposits()
      val checkDeposit = checkDepositService.retrieve(CheckDepositRetrieveParams.builder()
          .checkDepositId("string")
          .build())
      println(checkDeposit)
      checkDeposit.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkDepositService = client.checkDeposits()
      val checkDepositList = checkDepositService.list(CheckDepositListParams.builder().build())
      println(checkDepositList)
      checkDepositList.data().forEach {
          it.validate()
      }
    }
}
