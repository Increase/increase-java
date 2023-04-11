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
import com.increase.api.services.blocking.DeclinedTransactionService
import com.increase.api.models.DeclinedTransactionListPage
import com.increase.api.models.DeclinedTransactionListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class DeclinedTransactionServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val declinedTransactionService = client.declinedTransactions()
      val declinedTransaction = declinedTransactionService.retrieve(DeclinedTransactionRetrieveParams.builder()
          .declinedTransactionId("string")
          .build())
      println(declinedTransaction)
      declinedTransaction.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val declinedTransactionService = client.declinedTransactions()
      val declinedTransactionList = declinedTransactionService.list(DeclinedTransactionListParams.builder().build())
      println(declinedTransactionList)
      declinedTransactionList.data().forEach {
          it.validate()
      }
    }
}
