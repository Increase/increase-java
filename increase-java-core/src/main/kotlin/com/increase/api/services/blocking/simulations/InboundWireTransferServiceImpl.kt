// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.json
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundWireTransfer
import com.increase.api.models.SimulationInboundWireTransferCreateParams

class InboundWireTransferServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InboundWireTransferService {

    private val withRawResponse: InboundWireTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundWireTransferService.WithRawResponse = withRawResponse

    override fun create(
        params: SimulationInboundWireTransferCreateParams,
        requestOptions: RequestOptions,
    ): InboundWireTransfer =
        // post /simulations/inbound_wire_transfers
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundWireTransferService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<InboundWireTransfer> =
            jsonHandler<InboundWireTransfer>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: SimulationInboundWireTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("simulations", "inbound_wire_transfers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
}
