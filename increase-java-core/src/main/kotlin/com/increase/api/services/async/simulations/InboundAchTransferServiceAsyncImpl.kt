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
import com.increase.api.models.InboundAchTransfer
import com.increase.api.models.SimulationInboundAchTransferCreateParams
import java.util.concurrent.CompletableFuture

class InboundAchTransferServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : InboundAchTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InboundAchTransfer> =
        jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates an inbound ACH transfer to your account. This imitates initiating a transfer to an
     * Increase account from a different financial institution. The transfer may be either a credit
     * or a debit depending on if the `amount` is positive or negative. The result of calling this
     * API will contain the created transfer. You can pass a `resolve_at` parameter to allow for a
     * window to
     * [action on the Inbound ACH Transfer](https://increase.com/documentation/receiving-ach-transfers).
     * Alternatively, if you don't pass the `resolve_at` parameter the result will contain either a
     * [Transaction](#transactions) or a [Declined Transaction](#declined-transactions) depending on
     * whether or not the transfer is allowed.
     */
    override fun create(
        params: SimulationInboundAchTransferCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InboundAchTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "inbound_ach_transfers")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }
}
