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
import com.increase.api.models.Lockbox
import com.increase.api.models.LockboxCreateParams
import com.increase.api.models.LockboxListPageAsync
import com.increase.api.models.LockboxListParams
import com.increase.api.models.LockboxRetrieveParams
import com.increase.api.models.LockboxUpdateParams
import java.util.concurrent.CompletableFuture

class LockboxServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LockboxServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Lockbox> =
        jsonHandler<Lockbox>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Lockbox */
    override fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Lockbox> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("lockboxes")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<Lockbox> =
        jsonHandler<Lockbox>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Lockbox */
    override fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Lockbox> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("lockboxes", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<Lockbox> =
        jsonHandler<Lockbox>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Lockbox */
    override fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Lockbox> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("lockboxes", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<LockboxListPageAsync.Response> =
        jsonHandler<LockboxListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Lockboxes */
    override fun list(
        params: LockboxListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LockboxListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("lockboxes")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { LockboxListPageAsync.of(this, params, it) }
            }
    }
}
