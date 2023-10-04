// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InterestPaymentSimulationResult
import com.increase.api.models.SimulationInterestPaymentCreateParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class InterestPaymentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InterestPaymentServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InterestPaymentSimulationResult> =
        jsonHandler<InterestPaymentSimulationResult>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates an interest payment to your account. In production, this happens automatically on
     * the first of each month.
     */
    override fun create(
        params: SimulationInterestPaymentCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InterestPaymentSimulationResult> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "interest_payment")
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
