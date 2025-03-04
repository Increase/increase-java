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
import com.increase.api.models.PhysicalCardProfile
import com.increase.api.models.PhysicalCardProfileArchiveParams
import com.increase.api.models.PhysicalCardProfileCloneParams
import com.increase.api.models.PhysicalCardProfileCreateParams
import com.increase.api.models.PhysicalCardProfileListPageAsync
import com.increase.api.models.PhysicalCardProfileListParams
import com.increase.api.models.PhysicalCardProfileRetrieveParams
import java.util.concurrent.CompletableFuture

class PhysicalCardProfileServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PhysicalCardProfileServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<PhysicalCardProfile> =
        jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Physical Card Profile */
    override fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCardProfile> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("physical_card_profiles")
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

    private val retrieveHandler: Handler<PhysicalCardProfile> =
        jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Card Profile */
    override fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCardProfile> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("physical_card_profiles", params.getPathParam(0))
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

    private val listHandler: Handler<PhysicalCardProfileListPageAsync.Response> =
        jsonHandler<PhysicalCardProfileListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Physical Card Profiles */
    override fun list(
        params: PhysicalCardProfileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCardProfileListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("physical_card_profiles")
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
                    .let { PhysicalCardProfileListPageAsync.of(this, params, it) }
            }
    }

    private val archiveHandler: Handler<PhysicalCardProfile> =
        jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Archive a Physical Card Profile */
    override fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCardProfile> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("physical_card_profiles", params.getPathParam(0), "archive")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val cloneHandler: Handler<PhysicalCardProfile> =
        jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Clone a Physical Card Profile */
    override fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCardProfile> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("physical_card_profiles", params.getPathParam(0), "clone")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { cloneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }
}
