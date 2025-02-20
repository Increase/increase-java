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
import com.increase.api.models.CheckTransfer
import com.increase.api.models.CheckTransferApproveParams
import com.increase.api.models.CheckTransferCancelParams
import com.increase.api.models.CheckTransferCreateParams
import com.increase.api.models.CheckTransferListPageAsync
import com.increase.api.models.CheckTransferListParams
import com.increase.api.models.CheckTransferRetrieveParams
import com.increase.api.models.CheckTransferStopPaymentParams
import java.util.concurrent.CompletableFuture

class CheckTransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Check Transfer */
    override fun create(
        params: CheckTransferCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("check_transfers")
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

    private val retrieveHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Check Transfer */
    override fun retrieve(
        params: CheckTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("check_transfers", params.getPathParam(0))
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

    private val listHandler: Handler<CheckTransferListPageAsync.Response> =
        jsonHandler<CheckTransferListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Check Transfers */
    override fun list(
        params: CheckTransferListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransferListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("check_transfers")
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
                    .let { CheckTransferListPageAsync.of(this, params, it) }
            }
    }

    private val approveHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Approve a Check Transfer */
    override fun approve(
        params: CheckTransferApproveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("check_transfers", params.getPathParam(0), "approve")
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

    private val cancelHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Cancel a pending Check Transfer */
    override fun cancel(
        params: CheckTransferCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("check_transfers", params.getPathParam(0), "cancel")
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

    private val stopPaymentHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Request a stop payment on a Check Transfer */
    override fun stopPayment(
        params: CheckTransferStopPaymentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("check_transfers", params.getPathParam(0), "stop_payment")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { stopPaymentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
