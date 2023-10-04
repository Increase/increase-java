// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardDispute
import com.increase.api.models.SimulationCardDisputeActionParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class CardDisputeServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CardDisputeServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val actionHandler: Handler<CardDispute> =
        jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * After a [Card Dispute](#card-disputes) is created in production, the dispute will be
     * reviewed. Since no review happens in sandbox, this endpoint simulates moving a Card Dispute
     * into a rejected or accepted state. A Card Dispute can only be actioned one time and must have
     * a status of `pending_reviewing`.
     */
    override fun action(
        params: SimulationCardDisputeActionParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardDispute> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "card_disputes", params.getPathParam(0), "action")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { actionHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
