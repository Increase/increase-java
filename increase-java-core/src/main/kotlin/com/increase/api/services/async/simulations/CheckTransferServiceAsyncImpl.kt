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
import com.increase.api.models.CheckTransfer
import com.increase.api.models.SimulationCheckTransferMailParams
import java.util.concurrent.CompletableFuture

class CheckTransferServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CheckTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val mailHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates the mailing of a [Check Transfer](#check-transfers), which happens periodically
     * throughout the day in production but can be sped up in sandbox. This transfer must first have
     * a `status` of `pending_approval` or `pending_submission`.
     */
    override fun mail(
        params: SimulationCheckTransferMailParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CheckTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "check_transfers", params.getPathParam(0), "mail")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { mailHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
