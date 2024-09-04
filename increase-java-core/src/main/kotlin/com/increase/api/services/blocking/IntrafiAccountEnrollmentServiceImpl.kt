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
import com.increase.api.models.IntrafiAccountEnrollment
import com.increase.api.models.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.IntrafiAccountEnrollmentListPage
import com.increase.api.models.IntrafiAccountEnrollmentListParams
import com.increase.api.models.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.IntrafiAccountEnrollmentUnenrollParams
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

class IntrafiAccountEnrollmentServiceImpl constructor(private val clientOptions: ClientOptions, ) : IntrafiAccountEnrollmentService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<IntrafiAccountEnrollment> =
    jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Enroll an account in the IntraFi deposit sweep network */
    override fun create(params: IntrafiAccountEnrollmentCreateParams, requestOptions: RequestOptions): IntrafiAccountEnrollment {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("intrafi_account_enrollments")
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

    private val retrieveHandler: Handler<IntrafiAccountEnrollment> =
    jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Get an IntraFi Account Enrollment */
    override fun retrieve(params: IntrafiAccountEnrollmentRetrieveParams, requestOptions: RequestOptions): IntrafiAccountEnrollment {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("intrafi_account_enrollments", params.getPathParam(0))
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

    private val listHandler: Handler<IntrafiAccountEnrollmentListPage.Response> =
    jsonHandler<IntrafiAccountEnrollmentListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List IntraFi Account Enrollments */
    override fun list(params: IntrafiAccountEnrollmentListParams, requestOptions: RequestOptions): IntrafiAccountEnrollmentListPage {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("intrafi_account_enrollments")
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
              IntrafiAccountEnrollmentListPage.of(this, params, it)
          }
      }
    }

    private val unenrollHandler: Handler<IntrafiAccountEnrollment> =
    jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Unenroll an account from IntraFi */
    override fun unenroll(params: IntrafiAccountEnrollmentUnenrollParams, requestOptions: RequestOptions): IntrafiAccountEnrollment {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("intrafi_account_enrollments", params.getPathParam(0), "unenroll")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .apply {
            params.getBody().ifPresent {
                body(json(clientOptions.jsonMapper, it))
            }
        }
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              unenrollHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
