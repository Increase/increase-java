package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.SimulationWireTransferCreateInboundParams
import com.increase.api.models.WireTransferSimulation
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class WireTransferServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : WireTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createInboundHandler: Handler<WireTransferSimulation> =
        jsonHandler<WireTransferSimulation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Simulates an inbound Wire Transfer to your account. */
    override fun createInbound(
        params: SimulationWireTransferCreateInboundParams,
        requestOptions: RequestOptions
    ): WireTransferSimulation {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "inbound_wire_transfers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { createInboundHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
