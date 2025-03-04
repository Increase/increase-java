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
import com.increase.api.models.Program
import com.increase.api.models.SimulationProgramCreateParams
import java.util.concurrent.CompletableFuture

class ProgramServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProgramServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Program> =
        jsonHandler<Program>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates a [Program](#programs) being created in your group. By default, your group has one
     * program called Commercial Banking. Note that when your group operates more than one program,
     * `program_id` is a required field when creating accounts.
     */
    override fun create(
        params: SimulationProgramCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Program> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "programs")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }
}
