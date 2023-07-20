package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardProfile
import com.increase.api.models.SimulationCardProfileApproveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class CardProfileServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CardProfileService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val approveHandler: Handler<CardProfile> =
        jsonHandler<CardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * After a [Card Profile](#card-profile) is created in production, the images will be uploaded
     * to Visa within one day. Since Card Profiles are not uploaded to Visa in sandbox, this
     * endpoint simulates that step. Invoking this simulation triggers the webhooks Increase sends
     * when the Card Profile is approved and updates the status of the Card Profile.
     */
    override fun approve(
        params: SimulationCardProfileApproveParams,
        requestOptions: RequestOptions
    ): CardProfile {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "card_profiles", params.getPathParam(0), "approve")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { approveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
