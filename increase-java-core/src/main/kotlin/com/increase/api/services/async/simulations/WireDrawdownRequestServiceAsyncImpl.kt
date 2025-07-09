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
import com.increase.api.models.simulations.wiredrawdownrequests.WireDrawdownRequestRefuseParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequest
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WireDrawdownRequestServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WireDrawdownRequestServiceAsync {

    private val withRawResponse: WireDrawdownRequestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireDrawdownRequestServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WireDrawdownRequestServiceAsync =
        WireDrawdownRequestServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun refuse(
        params: WireDrawdownRequestRefuseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireDrawdownRequest> =
        // post /simulations/wire_drawdown_requests/{wire_drawdown_request_id}/refuse
        withRawResponse().refuse(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WireDrawdownRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WireDrawdownRequestServiceAsync.WithRawResponse =
            WireDrawdownRequestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val refuseHandler: Handler<WireDrawdownRequest> =
            jsonHandler<WireDrawdownRequest>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun refuse(
            params: WireDrawdownRequestRefuseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("wireDrawdownRequestId", params.wireDrawdownRequestId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "wire_drawdown_requests",
                        params._pathParam(0),
                        "refuse",
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
                            .use { refuseHandler.handle(it) }
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
