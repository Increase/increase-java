// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.ProofOfAuthorizationRequest
import com.increase.api.models.ProofOfAuthorizationRequestListPageAsync
import com.increase.api.models.ProofOfAuthorizationRequestListParams
import com.increase.api.models.ProofOfAuthorizationRequestRetrieveParams
import java.util.concurrent.CompletableFuture

class ProofOfAuthorizationRequestServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ProofOfAuthorizationRequestServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ProofOfAuthorizationRequest> =
        jsonHandler<ProofOfAuthorizationRequest>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a Proof of Authorization Request */
    override fun retrieve(
        params: ProofOfAuthorizationRequestRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ProofOfAuthorizationRequest> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("proof_of_authorization_requests", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ProofOfAuthorizationRequestListPageAsync.Response> =
        jsonHandler<ProofOfAuthorizationRequestListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Proof of Authorization Requests */
    override fun list(
        params: ProofOfAuthorizationRequestListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ProofOfAuthorizationRequestListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("proof_of_authorization_requests")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ProofOfAuthorizationRequestListPageAsync.of(this, params, it) }
        }
    }
}
