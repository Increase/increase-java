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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListPageAsync
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListPageResponse
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListParams
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

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

    override fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundWireDrawdownRequest> =
        // get /inbound_wire_drawdown_requests/{inbound_wire_drawdown_request_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InboundWireDrawdownRequestListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundWireDrawdownRequestListPageAsync> =
        // get /inbound_wire_drawdown_requests
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundWireDrawdownRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundWireDrawdownRequestServiceAsync.WithRawResponse =
            InboundWireDrawdownRequestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InboundWireDrawdownRequest> =
            jsonHandler<InboundWireDrawdownRequest>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "inboundWireDrawdownRequestId",
                params.inboundWireDrawdownRequestId().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_wire_drawdown_requests", params._pathParam(0))
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

        private val listHandler: Handler<InboundWireDrawdownRequestListPageResponse> =
            jsonHandler<InboundWireDrawdownRequestListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InboundWireDrawdownRequestListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequestListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_wire_drawdown_requests")
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
                                InboundWireDrawdownRequestListPageAsync.builder()
                                    .service(
                                        InboundWireDrawdownRequestServiceAsyncImpl(clientOptions)
                                    )
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
