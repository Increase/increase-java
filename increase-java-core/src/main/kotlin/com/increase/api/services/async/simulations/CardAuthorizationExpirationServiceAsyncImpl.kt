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
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardAuthorizationExpirationCreateParams
import java.util.concurrent.CompletableFuture

class CardAuthorizationExpirationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    CardAuthorizationExpirationServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CardPayment> =
        jsonHandler<CardPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Simulates expiring a Card Authorization immediately. */
    override fun create(
        params: SimulationCardAuthorizationExpirationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "card_authorization_expirations")
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
