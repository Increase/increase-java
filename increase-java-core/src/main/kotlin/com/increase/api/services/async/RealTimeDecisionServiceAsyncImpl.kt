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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.RealTimeDecision
import com.increase.api.models.RealTimeDecisionActionParams
import com.increase.api.models.RealTimeDecisionRetrieveParams
import java.util.concurrent.CompletableFuture

class RealTimeDecisionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RealTimeDecisionServiceAsync {

    private val withRawResponse: RealTimeDecisionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RealTimeDecisionServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimeDecision> =
        // get /real_time_decisions/{real_time_decision_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimeDecision> =
        // post /real_time_decisions/{real_time_decision_id}/action
        withRawResponse().action(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RealTimeDecisionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<RealTimeDecision> =
            jsonHandler<RealTimeDecision>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: RealTimeDecisionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("real_time_decisions", params.getPathParam(0))
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

        private val actionHandler: Handler<RealTimeDecision> =
            jsonHandler<RealTimeDecision>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun action(
            params: RealTimeDecisionActionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimeDecision>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("real_time_decisions", params.getPathParam(0), "action")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { actionHandler.handle(it) }
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
