// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.Enum
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.ProofOfAuthorizationRequestSubmission
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListPage
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionRetrieveParams
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.BinaryResponseContent
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.multipartFormData
import com.increase.api.services.stringHandler
import com.increase.api.services.binaryHandler
import com.increase.api.services.withErrorHandler

class ProofOfAuthorizationRequestSubmissionServiceImpl constructor(private val clientOptions: ClientOptions, ) : ProofOfAuthorizationRequestSubmissionService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ProofOfAuthorizationRequestSubmission> =
    jsonHandler<ProofOfAuthorizationRequestSubmission>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Submit Proof of Authorization */
    override fun create(params: ProofOfAuthorizationRequestSubmissionCreateParams, requestOptions: RequestOptions): ProofOfAuthorizationRequestSubmission {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("proof_of_authorization_request_submissions")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              createHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val retrieveHandler: Handler<ProofOfAuthorizationRequestSubmission> =
    jsonHandler<ProofOfAuthorizationRequestSubmission>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve a Proof of Authorization Request Submission */
    override fun retrieve(params: ProofOfAuthorizationRequestSubmissionRetrieveParams, requestOptions: RequestOptions): ProofOfAuthorizationRequestSubmission {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("proof_of_authorization_request_submissions", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              retrieveHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val listHandler: Handler<ProofOfAuthorizationRequestSubmissionListPage.Response> =
    jsonHandler<ProofOfAuthorizationRequestSubmissionListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Proof of Authorization Request Submissions */
    override fun list(params: ProofOfAuthorizationRequestSubmissionListParams, requestOptions: RequestOptions): ProofOfAuthorizationRequestSubmissionListPage {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("proof_of_authorization_request_submissions")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
          .let {
              ProofOfAuthorizationRequestSubmissionListPage.of(this, params, it)
          }
      }
    }
}
