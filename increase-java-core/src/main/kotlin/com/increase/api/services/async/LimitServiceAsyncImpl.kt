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
import com.increase.api.models.Limit
import com.increase.api.models.LimitCreateParams
import com.increase.api.models.LimitListPageAsync
import com.increase.api.models.LimitListParams
import com.increase.api.models.LimitRetrieveParams
import com.increase.api.models.LimitUpdateParams
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

class LimitServiceAsyncImpl constructor(private val clientOptions: ClientOptions,) : LimitServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Limit> =
    jsonHandler<Limit>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create a Limit */
    override fun create(
        params: LimitCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Limit> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("limits")
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

    private val retrieveHandler: Handler<Limit> =
    jsonHandler<Limit>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve a Limit */
    override fun retrieve(
        params: LimitRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Limit> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("limits", params.getPathParam(0))
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

    private val updateHandler: Handler<Limit> =
    jsonHandler<Limit>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Update a Limit */
    override fun update(
        params: LimitUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Limit> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("limits", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<LimitListPageAsync.Response> =
    jsonHandler<LimitListPageAsync.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Limits */
    override fun list(
        params: LimitListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LimitListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("limits")
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
                .let { LimitListPageAsync.of(this, params, it) }
        }
    }
}
