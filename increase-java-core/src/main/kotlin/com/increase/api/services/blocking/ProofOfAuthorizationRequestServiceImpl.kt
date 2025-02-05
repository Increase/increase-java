// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.ProofOfAuthorizationRequest
import com.increase.api.models.ProofOfAuthorizationRequestListPage
import com.increase.api.models.ProofOfAuthorizationRequestListParams
import com.increase.api.models.ProofOfAuthorizationRequestRetrieveParams

class ProofOfAuthorizationRequestServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ProofOfAuthorizationRequestService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ProofOfAuthorizationRequest> =
        jsonHandler<ProofOfAuthorizationRequest>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a Proof of Authorization Request */
    override fun retrieve(
        params: ProofOfAuthorizationRequestRetrieveParams,
        requestOptions: RequestOptions
    ): ProofOfAuthorizationRequest {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("proof_of_authorization_requests", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ProofOfAuthorizationRequestListPage.Response> =
        jsonHandler<ProofOfAuthorizationRequestListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Proof of Authorization Requests */
    override fun list(
        params: ProofOfAuthorizationRequestListParams,
        requestOptions: RequestOptions
    ): ProofOfAuthorizationRequestListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("proof_of_authorization_requests")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { ProofOfAuthorizationRequestListPage.of(this, params, it) }
    }
}
