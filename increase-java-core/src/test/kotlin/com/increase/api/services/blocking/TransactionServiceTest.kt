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
import com.increase.api.services.blocking.TransactionService
import com.increase.api.models.TransactionListPage
import com.increase.api.models.TransactionListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class TransactionServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val transactionService = client.transactions()
      val transaction = transactionService.retrieve(TransactionRetrieveParams.builder()
          .transactionId("string")
          .build())
      println(transaction)
      transaction.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val transactionService = client.transactions()
      val transactionList = transactionService.list(TransactionListParams.builder().build())
      println(transactionList)
      transactionList.data().forEach {
          it.validate()
      }
    }
}
