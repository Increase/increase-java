// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseParams
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboundFundsHoldServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundFundsHoldServiceAsync {

    private val withRawResponse: InboundFundsHoldServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundFundsHoldServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundFundsHoldServiceAsync =
        InboundFundsHoldServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun release(
        params: InboundFundsHoldReleaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundFundsHoldReleaseResponse> =
        // post /simulations/inbound_funds_holds/{inbound_funds_hold_id}/release
        withRawResponse().release(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundFundsHoldServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundFundsHoldServiceAsync.WithRawResponse =
            InboundFundsHoldServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val releaseHandler: Handler<InboundFundsHoldReleaseResponse> =
            jsonHandler<InboundFundsHoldReleaseResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun release(
            params: InboundFundsHoldReleaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundFundsHoldReleaseResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundFundsHoldId", params.inboundFundsHoldId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "inbound_funds_holds",
                        params._pathParam(0),
                        "release",
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
                            .use { releaseHandler.handle(it) }
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
