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
import com.increase.api.models.RoutingNumberListPageAsync
import com.increase.api.models.RoutingNumberListParams
import java.util.concurrent.CompletableFuture

class RoutingNumberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RoutingNumberServiceAsync {

    private val withRawResponse: RoutingNumberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoutingNumberServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: RoutingNumberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoutingNumberListPageAsync> =
        // get /routing_numbers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoutingNumberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<RoutingNumberListPageAsync.Response> =
            jsonHandler<RoutingNumberListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: RoutingNumberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoutingNumberListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("routing_numbers")
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
                                RoutingNumberListPageAsync.of(
                                    RoutingNumberServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
