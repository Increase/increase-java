// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.models.SimulationInboundWireDrawdownRequestCreateParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class InboundWireDrawdownRequestServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InboundWireDrawdownRequestServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InboundWireDrawdownRequest> =
        jsonHandler<InboundWireDrawdownRequest>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Simulates receiving an [Inbound Wire Drawdown Request](#inbound-wire-drawdown-requests). */
    override fun create(
        params: SimulationInboundWireDrawdownRequestCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InboundWireDrawdownRequest> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "inbound_wire_drawdown_requests")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
