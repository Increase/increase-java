// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
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
import com.increase.api.models.wiretransfers.WireTransfer
import com.increase.api.models.wiretransfers.WireTransferApproveParams
import com.increase.api.models.wiretransfers.WireTransferCancelParams
import com.increase.api.models.wiretransfers.WireTransferCreateParams
import com.increase.api.models.wiretransfers.WireTransferListPageAsync
import com.increase.api.models.wiretransfers.WireTransferListPageResponse
import com.increase.api.models.wiretransfers.WireTransferListParams
import com.increase.api.models.wiretransfers.WireTransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WireTransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WireTransferServiceAsync {

    private val withRawResponse: WireTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireTransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WireTransferServiceAsync =
        WireTransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WireTransferServiceAsync.WithRawResponse =
            WireTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WireTransfer> =
            jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: WireTransferCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("wireTransferId", params.wireTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wire_transfers", params._pathParam(0))
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

        private val listHandler: Handler<WireTransferListPageResponse> =
            jsonHandler<WireTransferListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: WireTransferListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransferListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
                                WireTransferListPageAsync.builder()
                                    .service(WireTransferServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("wireTransferId", params.wireTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wire_transfers", params._pathParam(0), "approve")
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("wireTransferId", params.wireTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wire_transfers", params._pathParam(0), "cancel")
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
