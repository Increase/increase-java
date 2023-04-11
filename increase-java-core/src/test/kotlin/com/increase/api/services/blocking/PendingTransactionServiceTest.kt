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
import com.increase.api.services.blocking.PendingTransactionService
import com.increase.api.models.PendingTransactionListPage
import com.increase.api.models.PendingTransactionListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class PendingTransactionServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val pendingTransactionService = client.pendingTransactions()
      val pendingTransaction = pendingTransactionService.retrieve(PendingTransactionRetrieveParams.builder()
          .pendingTransactionId("string")
          .build())
      println(pendingTransaction)
      pendingTransaction.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val pendingTransactionService = client.pendingTransactions()
      val pendingTransactionList = pendingTransactionService.list(PendingTransactionListParams.builder().build())
      println(pendingTransactionList)
      pendingTransactionList.data().forEach {
          it.validate()
      }
    }
}
