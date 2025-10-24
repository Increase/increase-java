// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
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
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransfer
import com.increase.api.models.simulations.inboundfednowtransfers.InboundFednowTransferCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class InboundFednowTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundFednowTransferServiceAsync {

    private val withRawResponse: InboundFednowTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundFednowTransferServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundFednowTransferServiceAsync =
        InboundFednowTransferServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: InboundFednowTransferCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundFednowTransfer> =
        // post /simulations/inbound_fednow_transfers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundFednowTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundFednowTransferServiceAsync.WithRawResponse =
            InboundFednowTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<InboundFednowTransfer> =
            jsonHandler<InboundFednowTransfer>(clientOptions.jsonMapper)

        override fun create(
            params: InboundFednowTransferCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundFednowTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("simulations", "inbound_fednow_transfers")
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
    }
}
