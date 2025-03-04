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
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.WireTransfer
import com.increase.api.models.WireTransferApproveParams
import com.increase.api.models.WireTransferCancelParams
import com.increase.api.models.WireTransferCreateParams
import com.increase.api.models.WireTransferListPageAsync
import com.increase.api.models.WireTransferListParams
import com.increase.api.models.WireTransferRetrieveParams
import java.util.concurrent.CompletableFuture

class WireTransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WireTransferServiceAsync {

    private val withRawResponse: WireTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireTransferServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        // post /wire_transfers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        // get /wire_transfers/{wire_transfer_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WireTransferListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransferListPageAsync> =
        // get /wire_transfers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        // post /wire_transfers/{wire_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        // post /wire_transfers/{wire_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WireTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<WireTransfer> =
            jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: WireTransferCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("wire_transfers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<WireTransfer> =
            jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: WireTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("wire_transfers", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<WireTransferListPageAsync.Response> =
            jsonHandler<WireTransferListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: WireTransferListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransferListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("wire_transfers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                WireTransferListPageAsync.of(
                                    WireTransferServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val approveHandler: Handler<WireTransfer> =
            jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun approve(
            params: WireTransferApproveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("wire_transfers", params.getPathParam(0), "approve")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { approveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cancelHandler: Handler<WireTransfer> =
            jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun cancel(
            params: WireTransferCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("wire_transfers", params.getPathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
