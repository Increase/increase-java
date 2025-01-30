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
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Program
import com.increase.api.models.ProgramListPageAsync
import com.increase.api.models.ProgramListParams
import com.increase.api.models.ProgramRetrieveParams
import java.util.concurrent.CompletableFuture

class ProgramServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ProgramServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Program> =
        jsonHandler<Program>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Program */
    override fun retrieve(
        params: ProgramRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Program> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("programs", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<ProgramListPageAsync.Response> =
        jsonHandler<ProgramListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Programs */
    override fun list(
        params: ProgramListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ProgramListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("programs")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
                    .let { ProgramListPageAsync.of(this, params, it) }
            }
    }
}
