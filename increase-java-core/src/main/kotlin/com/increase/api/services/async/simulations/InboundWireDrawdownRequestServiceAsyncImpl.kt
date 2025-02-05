// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.models.SimulationInboundWireDrawdownRequestCreateParams
import java.util.concurrent.CompletableFuture

class InboundWireDrawdownRequestServiceAsyncImpl
internal constructor(
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
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
