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
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Card
import com.increase.api.models.CardCreateParams
import com.increase.api.models.CardDetails
import com.increase.api.models.CardDetailsParams
import com.increase.api.models.CardListPageAsync
import com.increase.api.models.CardListParams
import com.increase.api.models.CardRetrieveParams
import com.increase.api.models.CardUpdateParams
import java.util.concurrent.CompletableFuture

class CardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Card */
    override fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Card> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("cards")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Card */
    override fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Card> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("cards", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Card */
    override fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Card> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("cards", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<CardListPageAsync.Response> =
        jsonHandler<CardListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Cards */
    override fun list(
        params: CardListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("cards")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { CardListPageAsync.of(this, params, it) }
            }
    }

    private val detailsHandler: Handler<CardDetails> =
        jsonHandler<CardDetails>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve sensitive details for a Card */
    override fun details(
        params: CardDetailsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardDetails> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("cards", params.getPathParam(0), "details")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { detailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }
}
