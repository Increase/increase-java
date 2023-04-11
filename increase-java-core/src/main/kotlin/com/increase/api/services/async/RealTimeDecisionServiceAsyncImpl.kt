package com.increase.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.RealTimeDecision
import com.increase.api.models.RealTimeDecisionActionParams
import com.increase.api.models.RealTimeDecisionRetrieveParams
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.JsonField
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler

class RealTimeDecisionServiceAsyncImpl constructor(private val clientOptions: ClientOptions,) : RealTimeDecisionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<RealTimeDecision> =
    jsonHandler<RealTimeDecision>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve a Real-Time Decision */
    override fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimeDecision> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("real_time_decisions", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val actionHandler: Handler<RealTimeDecision> =
    jsonHandler<RealTimeDecision>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Action a Real-Time Decision */
    override fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimeDecision> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("real_time_decisions", params.getPathParam(0), "action")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { actionHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
