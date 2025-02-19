// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.json
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.SimulationCardAuthorizationCreateParams
import com.increase.api.models.SimulationCardAuthorizationCreateResponse

class CardAuthorizationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CardAuthorizationService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<SimulationCardAuthorizationCreateResponse> =
        jsonHandler<SimulationCardAuthorizationCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates a purchase authorization on a [Card](#cards). Depending on the balance available to
     * the card and the `amount` submitted, the authorization activity will result in a
     * [Pending Transaction](#pending-transactions) of type `card_authorization` or a
     * [Declined Transaction](#declined-transactions) of type `card_decline`. You can pass either a
     * Card id or a [Digital Wallet Token](#digital-wallet-tokens) id to simulate the two different
     * ways purchases can be made.
     */
    override fun create(
        params: SimulationCardAuthorizationCreateParams,
        requestOptions: RequestOptions,
    ): SimulationCardAuthorizationCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "card_authorizations")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
