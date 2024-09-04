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
import com.increase.api.models.DigitalCardProfile
import com.increase.api.models.DigitalCardProfileArchiveParams
import com.increase.api.models.DigitalCardProfileCloneParams
import com.increase.api.models.DigitalCardProfileCreateParams
import com.increase.api.models.DigitalCardProfileListPage
import com.increase.api.models.DigitalCardProfileListParams
import com.increase.api.models.DigitalCardProfileRetrieveParams
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

class DigitalCardProfileServiceImpl constructor(private val clientOptions: ClientOptions, ) : DigitalCardProfileService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<DigitalCardProfile> =
    jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create a Digital Card Profile */
    override fun create(params: DigitalCardProfileCreateParams, requestOptions: RequestOptions): DigitalCardProfile {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("digital_card_profiles")
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

    private val retrieveHandler: Handler<DigitalCardProfile> =
    jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve a Digital Card Profile */
    override fun retrieve(params: DigitalCardProfileRetrieveParams, requestOptions: RequestOptions): DigitalCardProfile {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("digital_card_profiles", params.getPathParam(0))
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

    private val listHandler: Handler<DigitalCardProfileListPage.Response> =
    jsonHandler<DigitalCardProfileListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Card Profiles */
    override fun list(params: DigitalCardProfileListParams, requestOptions: RequestOptions): DigitalCardProfileListPage {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("digital_card_profiles")
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
              DigitalCardProfileListPage.of(this, params, it)
          }
      }
    }

    private val archiveHandler: Handler<DigitalCardProfile> =
    jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Archive a Digital Card Profile */
    override fun archive(params: DigitalCardProfileArchiveParams, requestOptions: RequestOptions): DigitalCardProfile {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("digital_card_profiles", params.getPathParam(0), "archive")
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

    private val cloneHandler: Handler<DigitalCardProfile> =
    jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Clones a Digital Card Profile */
    override fun clone(params: DigitalCardProfileCloneParams, requestOptions: RequestOptions): DigitalCardProfile {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("digital_card_profiles", params.getPathParam(0), "clone")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              cloneHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
