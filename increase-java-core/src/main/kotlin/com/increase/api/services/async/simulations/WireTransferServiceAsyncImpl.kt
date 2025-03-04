// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.SimulationWireTransferReverseParams
import com.increase.api.models.SimulationWireTransferSubmitParams
import com.increase.api.models.WireTransfer
import java.util.concurrent.CompletableFuture

class WireTransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WireTransferServiceAsync {

    private val withRawResponse: WireTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireTransferServiceAsync.WithRawResponse = withRawResponse

    override fun reverse(
        params: SimulationWireTransferReverseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        // post /simulations/wire_transfers/{wire_transfer_id}/reverse
        withRawResponse().reverse(params, requestOptions).thenApply { it.parse() }

    override fun submit(
        params: SimulationWireTransferSubmitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        // post /simulations/wire_transfers/{wire_transfer_id}/submit
        withRawResponse().submit(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WireTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val reverseHandler: Handler<WireTransfer> =
            jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun reverse(
            params: SimulationWireTransferReverseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "simulations",
                        "wire_transfers",
                        params.getPathParam(0),
                        "reverse",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { reverseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitHandler: Handler<WireTransfer> =
            jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun submit(
            params: SimulationWireTransferSubmitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "simulations",
                        "wire_transfers",
                        params.getPathParam(0),
                        "submit",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { submitHandler.handle(it) }
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
