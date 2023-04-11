package com.increase.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.WireTransfer
import com.increase.api.models.WireTransferApproveParams
import com.increase.api.models.WireTransferCancelParams
import com.increase.api.models.WireTransferCreateParams
import com.increase.api.models.WireTransferListPageAsync
import com.increase.api.models.WireTransferListParams
import com.increase.api.models.WireTransferRetrieveParams
import com.increase.api.models.WireTransferReverseParams
import com.increase.api.models.WireTransferSubmitParams
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.JsonField
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler

class WireTransferServiceAsyncImpl constructor(private val clientOptions: ClientOptions,) : WireTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<WireTransfer> =
    jsonHandler<WireTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create a Wire Transfer */
    override fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WireTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("wire_transfers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<WireTransfer> =
    jsonHandler<WireTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve a Wire Transfer */
    override fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WireTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("wire_transfers", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<WireTransferListPageAsync.Response> =
    jsonHandler<WireTransferListPageAsync.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Wire Transfers */
    override fun list(
        params: WireTransferListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WireTransferListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("wire_transfers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { WireTransferListPageAsync.of(this, params, it) }
        }
    }

    private val approveHandler: Handler<WireTransfer> =
    jsonHandler<WireTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Approve a Wire Transfer */
    override fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WireTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("wire_transfers", params.getPathParam(0), "approve")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { approveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.let {
              approveHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val cancelHandler: Handler<WireTransfer> =
    jsonHandler<WireTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Cancel a pending Wire Transfer */
    override fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WireTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("wire_transfers", params.getPathParam(0), "cancel")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { cancelHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.let {
              cancelHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val reverseHandler: Handler<WireTransfer> =
    jsonHandler<WireTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates the reversal of a [Wire Transfer](#wire-transfers) by the Federal
     * Reserve due to error conditions. This will also create a
     * [Transaction](#transaction) to account for the returned funds. This Wire
     * Transfer must first have a `status` of `complete`.'
     */
    override fun reverse(
        params: WireTransferReverseParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WireTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "wire_transfers", params.getPathParam(0), "reverse")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { reverseHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.let {
              reverseHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val submitHandler: Handler<WireTransfer> =
    jsonHandler<WireTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates the submission of a [Wire Transfer](#wire-transfers) to the Federal
     * Reserve. This transfer must first have a `status` of `pending_approval` or
     * `pending_creating`.
     */
    override fun submit(
        params: WireTransferSubmitParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WireTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "wire_transfers", params.getPathParam(0), "submit")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { submitHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.let {
              submitHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
