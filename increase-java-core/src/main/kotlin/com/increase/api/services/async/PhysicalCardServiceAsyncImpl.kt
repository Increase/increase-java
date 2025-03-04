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
import com.increase.api.models.PhysicalCard
import com.increase.api.models.PhysicalCardCreateParams
import com.increase.api.models.PhysicalCardListPageAsync
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.PhysicalCardRetrieveParams
import com.increase.api.models.PhysicalCardUpdateParams
import java.util.concurrent.CompletableFuture

class PhysicalCardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PhysicalCardServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<PhysicalCard> =
        jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Physical Card */
    override fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCard> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("physical_cards")
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

    private val retrieveHandler: Handler<PhysicalCard> =
        jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Physical Card */
    override fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCard> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("physical_cards", params.getPathParam(0))
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

    private val updateHandler: Handler<PhysicalCard> =
        jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Physical Card */
    override fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCard> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("physical_cards", params.getPathParam(0))
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

    private val listHandler: Handler<PhysicalCardListPageAsync.Response> =
        jsonHandler<PhysicalCardListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Physical Cards */
    override fun list(
        params: PhysicalCardListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCardListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("physical_cards")
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
                    .let { PhysicalCardListPageAsync.of(this, params, it) }
            }
    }
}
