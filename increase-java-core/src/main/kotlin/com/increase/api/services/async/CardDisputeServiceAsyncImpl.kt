// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.json
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardDispute
import com.increase.api.models.CardDisputeCreateParams
import com.increase.api.models.CardDisputeListPageAsync
import com.increase.api.models.CardDisputeListParams
import com.increase.api.models.CardDisputeRetrieveParams
import java.util.concurrent.CompletableFuture

class CardDisputeServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CardDisputeServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CardDispute> =
        jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Card Dispute */
    override fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardDispute> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("card_disputes")
                .putAllQueryParams(clientOptions.queryParams)
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

    private val retrieveHandler: Handler<CardDispute> =
        jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Card Dispute */
    override fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardDispute> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_disputes", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
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

    private val listHandler: Handler<CardDisputeListPageAsync.Response> =
        jsonHandler<CardDisputeListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Card Disputes */
    override fun list(
        params: CardDisputeListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardDisputeListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_disputes")
                .putAllQueryParams(clientOptions.queryParams)
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
                .let { CardDisputeListPageAsync.of(this, params, it) }
        }
    }
}
