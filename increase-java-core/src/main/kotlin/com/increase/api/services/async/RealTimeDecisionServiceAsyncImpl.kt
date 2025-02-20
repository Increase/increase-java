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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.RealTimeDecision
import com.increase.api.models.RealTimeDecisionActionParams
import com.increase.api.models.RealTimeDecisionRetrieveParams
import java.util.concurrent.CompletableFuture

class RealTimeDecisionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RealTimeDecisionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<RealTimeDecision> =
        jsonHandler<RealTimeDecision>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Real-Time Decision */
    override fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimeDecision> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("real_time_decisions", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val actionHandler: Handler<RealTimeDecision> =
        jsonHandler<RealTimeDecision>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Action a Real-Time Decision */
    override fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimeDecision> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("real_time_decisions", params.getPathParam(0), "action")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { actionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
