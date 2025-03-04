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
import com.increase.api.models.WireDrawdownRequest
import com.increase.api.models.WireDrawdownRequestCreateParams
import com.increase.api.models.WireDrawdownRequestListPageAsync
import com.increase.api.models.WireDrawdownRequestListParams
import com.increase.api.models.WireDrawdownRequestRetrieveParams
import java.util.concurrent.CompletableFuture

class WireDrawdownRequestServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WireDrawdownRequestServiceAsync {

    private val withRawResponse: WireDrawdownRequestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireDrawdownRequestServiceAsync.WithRawResponse =
        withRawResponse

    override fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireDrawdownRequest> =
        // post /wire_drawdown_requests
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireDrawdownRequest> =
        // get /wire_drawdown_requests/{wire_drawdown_request_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WireDrawdownRequestListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireDrawdownRequestListPageAsync> =
        // get /wire_drawdown_requests
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WireDrawdownRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<WireDrawdownRequest> =
            jsonHandler<WireDrawdownRequest>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: WireDrawdownRequestCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("wire_drawdown_requests")
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

        private val retrieveHandler: Handler<WireDrawdownRequest> =
            jsonHandler<WireDrawdownRequest>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: WireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("wire_drawdown_requests", params.getPathParam(0))
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

        private val listHandler: Handler<WireDrawdownRequestListPageAsync.Response> =
            jsonHandler<WireDrawdownRequestListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: WireDrawdownRequestListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequestListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("wire_drawdown_requests")
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
                                WireDrawdownRequestListPageAsync.of(
                                    WireDrawdownRequestServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
