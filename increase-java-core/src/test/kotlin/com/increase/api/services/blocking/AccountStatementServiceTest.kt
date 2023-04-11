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
import com.increase.api.services.blocking.AccountStatementService
import com.increase.api.models.AccountStatementListPage
import com.increase.api.models.AccountStatementListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class AccountStatementServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val accountStatementService = client.accountStatements()
      val accountStatement = accountStatementService.retrieve(AccountStatementRetrieveParams.builder()
          .accountStatementId("string")
          .build())
      println(accountStatement)
      accountStatement.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val accountStatementService = client.accountStatements()
      val accountStatementList = accountStatementService.list(AccountStatementListParams.builder().build())
      println(accountStatementList)
      accountStatementList.data().forEach {
          it.validate()
      }
    }
}
