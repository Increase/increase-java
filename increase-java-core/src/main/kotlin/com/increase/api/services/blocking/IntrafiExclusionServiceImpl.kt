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
import com.increase.api.models.IntrafiExclusion
import com.increase.api.models.IntrafiExclusionArchiveParams
import com.increase.api.models.IntrafiExclusionCreateParams
import com.increase.api.models.IntrafiExclusionListPage
import com.increase.api.models.IntrafiExclusionListParams
import com.increase.api.models.IntrafiExclusionRetrieveParams
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

class IntrafiExclusionServiceImpl constructor(private val clientOptions: ClientOptions, ) : IntrafiExclusionService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<IntrafiExclusion> =
    jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create an IntraFi Exclusion */
    override fun create(params: IntrafiExclusionCreateParams, requestOptions: RequestOptions): IntrafiExclusion {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("intrafi_exclusions")
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

    private val retrieveHandler: Handler<IntrafiExclusion> =
    jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Get an IntraFi Exclusion */
    override fun retrieve(params: IntrafiExclusionRetrieveParams, requestOptions: RequestOptions): IntrafiExclusion {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("intrafi_exclusions", params.getPathParam(0))
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

    private val listHandler: Handler<IntrafiExclusionListPage.Response> =
    jsonHandler<IntrafiExclusionListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List IntraFi Exclusions */
    override fun list(params: IntrafiExclusionListParams, requestOptions: RequestOptions): IntrafiExclusionListPage {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("intrafi_exclusions")
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
              IntrafiExclusionListPage.of(this, params, it)
          }
      }
    }

    private val archiveHandler: Handler<IntrafiExclusion> =
    jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Archive an IntraFi Exclusion */
    override fun archive(params: IntrafiExclusionArchiveParams, requestOptions: RequestOptions): IntrafiExclusion {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("intrafi_exclusions", params.getPathParam(0), "archive")
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
              archiveHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
