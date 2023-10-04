// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.PhysicalCard
import com.increase.api.models.PhysicalCardCreateParams
import com.increase.api.models.PhysicalCardListPageAsync
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.PhysicalCardRetrieveParams
import com.increase.api.models.PhysicalCardUpdateParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class PhysicalCardServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PhysicalCardServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<PhysicalCard> =
        jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Physical Card */
    override fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PhysicalCard> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("physical_cards")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<PhysicalCard> =
        jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Physical Card */
    override fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PhysicalCard> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("physical_cards", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<PhysicalCard> =
        jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Physical Card */
    override fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PhysicalCard> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("physical_cards", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<PhysicalCardListPageAsync.Response> =
        jsonHandler<PhysicalCardListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Physical Cards */
    override fun list(
        params: PhysicalCardListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PhysicalCardListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("physical_cards")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { PhysicalCardListPageAsync.of(this, params, it) }
        }
    }
}
