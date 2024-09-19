// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.services.blocking.ProofOfAuthorizationRequestService
import com.increase.api.models.ProofOfAuthorizationRequestListPage
import com.increase.api.models.ProofOfAuthorizationRequestListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class ProofOfAuthorizationRequestServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val proofOfAuthorizationRequestService = client.proofOfAuthorizationRequests()
      val proofOfAuthorizationRequest = proofOfAuthorizationRequestService.retrieve(ProofOfAuthorizationRequestRetrieveParams.builder()
          .proofOfAuthorizationRequestId("proof_of_authorization_request_id")
          .build())
      println(proofOfAuthorizationRequest)
      proofOfAuthorizationRequest.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val proofOfAuthorizationRequestService = client.proofOfAuthorizationRequests()
      val proofOfAuthorizationRequestList = proofOfAuthorizationRequestService.list(ProofOfAuthorizationRequestListParams.builder().build())
      println(proofOfAuthorizationRequestList)
      proofOfAuthorizationRequestList.data().forEach {
          it.validate()
      }
    }
}
