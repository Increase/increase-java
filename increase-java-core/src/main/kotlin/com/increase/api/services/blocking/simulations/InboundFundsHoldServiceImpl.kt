package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundFundsHoldReleaseResponse
import com.increase.api.models.SimulationInboundFundsHoldReleaseParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class InboundFundsHoldServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : InboundFundsHoldService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val releaseHandler: Handler<InboundFundsHoldReleaseResponse> =
        jsonHandler<InboundFundsHoldReleaseResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint simulates immediately releasing an inbound funds hold, which might be created
     * as a result of e.g., an ACH debit.
     */
    override fun release(
        params: SimulationInboundFundsHoldReleaseParams,
        requestOptions: RequestOptions
    ): InboundFundsHoldReleaseResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "simulations",
                    "inbound_funds_holds",
                    params.getPathParam(0),
                    "release"
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { releaseHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
