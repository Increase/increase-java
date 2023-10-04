// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundRealTimePaymentsTransferSimulationResult
import com.increase.api.models.RealTimePaymentsTransfer
import com.increase.api.models.SimulationRealTimePaymentsTransferCompleteParams
import com.increase.api.models.SimulationRealTimePaymentsTransferCreateInboundParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class RealTimePaymentsTransferServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RealTimePaymentsTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val completeHandler: Handler<RealTimePaymentsTransfer> =
        jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates submission of a Real-Time Payments transfer and handling the response from the
     * destination financial institution. This transfer must first have a `status` of
     * `pending_submission`.
     */
    override fun complete(
        params: SimulationRealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions
    ): RealTimePaymentsTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "simulations",
                    "real_time_payments_transfers",
                    params.getPathParam(0),
                    "complete"
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { completeHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val createInboundHandler: Handler<InboundRealTimePaymentsTransferSimulationResult> =
        jsonHandler<InboundRealTimePaymentsTransferSimulationResult>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates an inbound Real-Time Payments transfer to your account. Real-Time Payments are a
     * beta feature.
     */
    override fun createInbound(
        params: SimulationRealTimePaymentsTransferCreateInboundParams,
        requestOptions: RequestOptions
    ): InboundRealTimePaymentsTransferSimulationResult {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "inbound_real_time_payments_transfers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createInboundHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
