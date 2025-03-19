// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
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
import com.increase.api.models.inboundachtransfers.InboundAchTransfer
import com.increase.api.models.simulations.inboundachtransfers.InboundAchTransferCreateParams
import java.util.concurrent.CompletableFuture

class InboundAchTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundAchTransferServiceAsync {

    private val withRawResponse: InboundAchTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundAchTransferServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: InboundAchTransferCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundAchTransfer> =
        // post /simulations/inbound_ach_transfers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundAchTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<InboundAchTransfer> =
            jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: InboundAchTransferCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("simulations", "inbound_ach_transfers")
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
    }
}
