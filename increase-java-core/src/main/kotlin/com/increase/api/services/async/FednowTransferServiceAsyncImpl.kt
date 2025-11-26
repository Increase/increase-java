// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.fednowtransfers.FednowTransfer
import com.increase.api.models.fednowtransfers.FednowTransferApproveParams
import com.increase.api.models.fednowtransfers.FednowTransferCancelParams
import com.increase.api.models.fednowtransfers.FednowTransferCreateParams
import com.increase.api.models.fednowtransfers.FednowTransferListParams
import com.increase.api.models.fednowtransfers.FednowTransferListResponse
import com.increase.api.models.fednowtransfers.FednowTransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FednowTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : FednowTransferServiceAsync {

    private val withRawResponse: FednowTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FednowTransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): FednowTransferServiceAsync =
        FednowTransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FednowTransferCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FednowTransfer> =
        // post /fednow_transfers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FednowTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FednowTransfer> =
        // get /fednow_transfers/{fednow_transfer_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FednowTransferListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FednowTransferListResponse> =
        // get /fednow_transfers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun approve(
        params: FednowTransferApproveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FednowTransfer> =
        // post /fednow_transfers/{fednow_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: FednowTransferCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FednowTransfer> =
        // post /fednow_transfers/{fednow_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FednowTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FednowTransferServiceAsync.WithRawResponse =
            FednowTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FednowTransfer> =
            jsonHandler<FednowTransfer>(clientOptions.jsonMapper)

        override fun create(
            params: FednowTransferCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fednow_transfers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveHandler: Handler<FednowTransfer> =
            jsonHandler<FednowTransfer>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FednowTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fednowTransferId", params.fednowTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fednow_transfers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<FednowTransferListResponse> =
            jsonHandler<FednowTransferListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FednowTransferListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FednowTransferListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fednow_transfers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val approveHandler: Handler<FednowTransfer> =
            jsonHandler<FednowTransfer>(clientOptions.jsonMapper)

        override fun approve(
            params: FednowTransferApproveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fednowTransferId", params.fednowTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fednow_transfers", params._pathParam(0), "approve")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val cancelHandler: Handler<FednowTransfer> =
            jsonHandler<FednowTransfer>(clientOptions.jsonMapper)

        override fun cancel(
            params: FednowTransferCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fednowTransferId", params.fednowTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fednow_transfers", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
