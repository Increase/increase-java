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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.ProofOfAuthorizationRequestSubmission
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListPageAsync
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListParams
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionRetrieveParams
import java.util.concurrent.CompletableFuture

class ProofOfAuthorizationRequestSubmissionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    ProofOfAuthorizationRequestSubmissionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ProofOfAuthorizationRequestSubmission> =
        jsonHandler<ProofOfAuthorizationRequestSubmission>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Submit Proof of Authorization */
    override fun create(
        params: ProofOfAuthorizationRequestSubmissionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProofOfAuthorizationRequestSubmission> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("proof_of_authorization_request_submissions")
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

    private val retrieveHandler: Handler<ProofOfAuthorizationRequestSubmission> =
        jsonHandler<ProofOfAuthorizationRequestSubmission>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a Proof of Authorization Request Submission */
    override fun retrieve(
        params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProofOfAuthorizationRequestSubmission> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "proof_of_authorization_request_submissions",
                    params.getPathParam(0),
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<ProofOfAuthorizationRequestSubmissionListPageAsync.Response> =
        jsonHandler<ProofOfAuthorizationRequestSubmissionListPageAsync.Response>(
                clientOptions.jsonMapper
            )
            .withErrorHandler(errorHandler)

    /** List Proof of Authorization Request Submissions */
    override fun list(
        params: ProofOfAuthorizationRequestSubmissionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProofOfAuthorizationRequestSubmissionListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("proof_of_authorization_request_submissions")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { ProofOfAuthorizationRequestSubmissionListPageAsync.of(this, params, it) }
            }
    }
}
