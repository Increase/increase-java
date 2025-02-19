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
import com.increase.api.models.AchTransfer
import com.increase.api.models.AchTransferApproveParams
import com.increase.api.models.AchTransferCancelParams
import com.increase.api.models.AchTransferCreateParams
import com.increase.api.models.AchTransferListPageAsync
import com.increase.api.models.AchTransferListParams
import com.increase.api.models.AchTransferRetrieveParams
import java.util.concurrent.CompletableFuture

class AchTransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AchTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AchTransfer> =
        jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an ACH Transfer */
    override fun create(
        params: AchTransferCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ach_transfers")
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

    private val retrieveHandler: Handler<AchTransfer> =
        jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an ACH Transfer */
    override fun retrieve(
        params: AchTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ach_transfers", params.getPathParam(0))
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

    private val listHandler: Handler<AchTransferListPageAsync.Response> =
        jsonHandler<AchTransferListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List ACH Transfers */
    override fun list(
        params: AchTransferListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransferListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ach_transfers")
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
                    .let { AchTransferListPageAsync.of(this, params, it) }
            }
    }

    private val approveHandler: Handler<AchTransfer> =
        jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Approves an ACH Transfer in a pending_approval state. */
    override fun approve(
        params: AchTransferApproveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ach_transfers", params.getPathParam(0), "approve")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { approveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val cancelHandler: Handler<AchTransfer> =
        jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Cancels an ACH Transfer in a pending_approval state. */
    override fun cancel(
        params: AchTransferCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ach_transfers", params.getPathParam(0), "cancel")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
