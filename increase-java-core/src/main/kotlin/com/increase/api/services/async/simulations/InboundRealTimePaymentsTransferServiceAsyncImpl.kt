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
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundRealTimePaymentsTransfer
import com.increase.api.models.SimulationInboundRealTimePaymentsTransferCreateParams
import java.util.concurrent.CompletableFuture

class InboundRealTimePaymentsTransferServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InboundRealTimePaymentsTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InboundRealTimePaymentsTransfer> =
        jsonHandler<InboundRealTimePaymentsTransfer>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates an [Inbound Real-Time Payments Transfer](#inbound-real-time-payments-transfers) to
     * your account. Real-Time Payments are a beta feature.
     */
    override fun create(
        params: SimulationInboundRealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InboundRealTimePaymentsTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "inbound_real_time_payments_transfers")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
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
