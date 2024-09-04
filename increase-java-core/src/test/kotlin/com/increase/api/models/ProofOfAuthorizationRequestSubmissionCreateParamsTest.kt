// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.increase.api.core.ContentTypes
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.models.*
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionCreateParams.ProofOfAuthorizationRequestSubmissionCreateBody

class ProofOfAuthorizationRequestSubmissionCreateParamsTest {

    @Test
    fun createProofOfAuthorizationRequestSubmissionCreateParams() {
      ProofOfAuthorizationRequestSubmissionCreateParams.builder()
          .authorizationTerms("x")
          .authorizedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .authorizerEmail("x")
          .authorizerName("x")
          .customerHasBeenOffboarded(true)
          .proofOfAuthorizationRequestId("proof_of_authorization_request_id")
          .validatedAccountOwnershipViaCredential(true)
          .validatedAccountOwnershipWithAccountStatement(true)
          .validatedAccountOwnershipWithMicrodeposit(true)
          .authorizerCompany("x")
          .authorizerIpAddress("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = ProofOfAuthorizationRequestSubmissionCreateParams.builder()
          .authorizationTerms("x")
          .authorizedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .authorizerEmail("x")
          .authorizerName("x")
          .customerHasBeenOffboarded(true)
          .proofOfAuthorizationRequestId("proof_of_authorization_request_id")
          .validatedAccountOwnershipViaCredential(true)
          .validatedAccountOwnershipWithAccountStatement(true)
          .validatedAccountOwnershipWithMicrodeposit(true)
          .authorizerCompany("x")
          .authorizerIpAddress("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.authorizationTerms()).isEqualTo("x")
      assertThat(body.authorizedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.authorizerEmail()).isEqualTo("x")
      assertThat(body.authorizerName()).isEqualTo("x")
      assertThat(body.customerHasBeenOffboarded()).isEqualTo(true)
      assertThat(body.proofOfAuthorizationRequestId()).isEqualTo("proof_of_authorization_request_id")
      assertThat(body.validatedAccountOwnershipViaCredential()).isEqualTo(true)
      assertThat(body.validatedAccountOwnershipWithAccountStatement()).isEqualTo(true)
      assertThat(body.validatedAccountOwnershipWithMicrodeposit()).isEqualTo(true)
      assertThat(body.authorizerCompany()).isEqualTo("x")
      assertThat(body.authorizerIpAddress()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = ProofOfAuthorizationRequestSubmissionCreateParams.builder()
          .authorizationTerms("x")
          .authorizedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .authorizerEmail("x")
          .authorizerName("x")
          .customerHasBeenOffboarded(true)
          .proofOfAuthorizationRequestId("proof_of_authorization_request_id")
          .validatedAccountOwnershipViaCredential(true)
          .validatedAccountOwnershipWithAccountStatement(true)
          .validatedAccountOwnershipWithMicrodeposit(true)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.authorizationTerms()).isEqualTo("x")
      assertThat(body.authorizedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.authorizerEmail()).isEqualTo("x")
      assertThat(body.authorizerName()).isEqualTo("x")
      assertThat(body.customerHasBeenOffboarded()).isEqualTo(true)
      assertThat(body.proofOfAuthorizationRequestId()).isEqualTo("proof_of_authorization_request_id")
      assertThat(body.validatedAccountOwnershipViaCredential()).isEqualTo(true)
      assertThat(body.validatedAccountOwnershipWithAccountStatement()).isEqualTo(true)
      assertThat(body.validatedAccountOwnershipWithMicrodeposit()).isEqualTo(true)
    }
}
