// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.core.prepare
import com.increase.api.models.realtimedecisions.RealTimeDecision
import com.increase.api.models.realtimedecisions.RealTimeDecisionActionParams
import com.increase.api.models.realtimedecisions.RealTimeDecisionRetrieveParams

class RealTimeDecisionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RealTimeDecisionService {

    private val withRawResponse: RealTimeDecisionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RealTimeDecisionService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions,
    ): RealTimeDecision =
        // get /real_time_decisions/{real_time_decision_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions,
    ): RealTimeDecision =
        // post /real_time_decisions/{real_time_decision_id}/action
        withRawResponse().action(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RealTimeDecisionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<RealTimeDecision> =
            jsonHandler<RealTimeDecision>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: RealTimeDecisionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimeDecision> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("real_time_decisions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val actionHandler: Handler<RealTimeDecision> =
            jsonHandler<RealTimeDecision>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun action(
            params: RealTimeDecisionActionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimeDecision> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("real_time_decisions", params._pathParam(0), "action")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
