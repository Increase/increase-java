package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.DigitalWalletTokenRequestCreateResponse
import com.increase.api.models.SimulationsDigitalWalletTokenRequestCreateParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class DigitalWalletTokenRequestServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : DigitalWalletTokenRequestService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<DigitalWalletTokenRequestCreateResponse> =
        jsonHandler<DigitalWalletTokenRequestCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Simulates a user attempting add a [Card](#cards) to a digital wallet such as Apple Pay. */
    override fun create(
        params: SimulationsDigitalWalletTokenRequestCreateParams,
        requestOptions: RequestOptions
    ): DigitalWalletTokenRequestCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "digital_wallet_token_requests")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
