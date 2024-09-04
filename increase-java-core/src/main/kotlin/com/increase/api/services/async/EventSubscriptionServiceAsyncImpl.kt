// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.models.EventSubscription
import com.increase.api.models.EventSubscriptionCreateParams
import com.increase.api.models.EventSubscriptionListPageAsync
import com.increase.api.models.EventSubscriptionListParams
import com.increase.api.models.EventSubscriptionRetrieveParams
import com.increase.api.models.EventSubscriptionUpdateParams
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

class EventSubscriptionServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : EventSubscriptionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EventSubscription> =
    jsonHandler<EventSubscription>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create an Event Subscription */
    override fun create(params: EventSubscriptionCreateParams, requestOptions: RequestOptions): CompletableFuture<EventSubscription> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("event_subscriptions")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
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

    private val retrieveHandler: Handler<EventSubscription> =
    jsonHandler<EventSubscription>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve an Event Subscription */
    override fun retrieve(params: EventSubscriptionRetrieveParams, requestOptions: RequestOptions): CompletableFuture<EventSubscription> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("event_subscriptions", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
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

    private val updateHandler: Handler<EventSubscription> =
    jsonHandler<EventSubscription>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Update an Event Subscription */
    override fun update(params: EventSubscriptionUpdateParams, requestOptions: RequestOptions): CompletableFuture<EventSubscription> {
      val request = HttpRequest.builder()
        .method(HttpMethod.PATCH)
        .addPathSegments("event_subscriptions", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              updateHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val listHandler: Handler<EventSubscriptionListPageAsync.Response> =
    jsonHandler<EventSubscriptionListPageAsync.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Event Subscriptions */
    override fun list(params: EventSubscriptionListParams, requestOptions: RequestOptions): CompletableFuture<EventSubscriptionListPageAsync> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("event_subscriptions")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
          .let {
              EventSubscriptionListPageAsync.of(this, params, it)
          }
      }
    }
}
