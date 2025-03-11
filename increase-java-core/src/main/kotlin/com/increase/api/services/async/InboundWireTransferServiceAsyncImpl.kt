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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.inboundwiretransfers.InboundWireTransfer
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListPageAsync
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferRetrieveParams
import java.util.concurrent.CompletableFuture

class InboundWireTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundWireTransferServiceAsync {

    private val withRawResponse: InboundWireTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundWireTransferServiceAsync.WithRawResponse =
        withRawResponse

    override fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundWireTransfer> =
        // get /inbound_wire_transfers/{inbound_wire_transfer_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InboundWireTransferListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundWireTransferListPageAsync> =
        // get /inbound_wire_transfers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundWireTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<InboundWireTransfer> =
            jsonHandler<InboundWireTransfer>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: InboundWireTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_wire_transfers", params.getPathParam(0))
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

        private val listHandler: Handler<InboundWireTransferListPageAsync.Response> =
            jsonHandler<InboundWireTransferListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InboundWireTransferListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundWireTransferListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_wire_transfers")
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
                                InboundWireTransferListPageAsync.of(
                                    InboundWireTransferServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
