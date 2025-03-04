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
import com.increase.api.models.InboundWireTransfer
import com.increase.api.models.SimulationInboundWireTransferCreateParams
import java.util.concurrent.CompletableFuture

class InboundWireTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundWireTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InboundWireTransfer> =
        jsonHandler<InboundWireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Simulates an [Inbound Wire Transfer](#inbound-wire-transfers) to your account. */
    override fun create(
        params: SimulationInboundWireTransferCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundWireTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "inbound_wire_transfers")
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
