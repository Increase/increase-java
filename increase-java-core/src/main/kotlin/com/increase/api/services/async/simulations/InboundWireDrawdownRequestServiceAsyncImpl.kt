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
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.simulations.inboundwiredrawdownrequests.InboundWireDrawdownRequestCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class InboundWireDrawdownRequestServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    InboundWireDrawdownRequestServiceAsync {

    private val withRawResponse: InboundWireDrawdownRequestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundWireDrawdownRequestServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundWireDrawdownRequestServiceAsync =
        InboundWireDrawdownRequestServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: InboundWireDrawdownRequestCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundWireDrawdownRequest> =
        // post /simulations/inbound_wire_drawdown_requests
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundWireDrawdownRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundWireDrawdownRequestServiceAsync.WithRawResponse =
            InboundWireDrawdownRequestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<InboundWireDrawdownRequest> =
            jsonHandler<InboundWireDrawdownRequest>(clientOptions.jsonMapper)

        override fun create(
            params: InboundWireDrawdownRequestCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("simulations", "inbound_wire_drawdown_requests")
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
