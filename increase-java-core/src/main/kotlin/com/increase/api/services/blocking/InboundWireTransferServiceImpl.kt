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
import com.increase.api.models.InboundWireTransfer
import com.increase.api.models.InboundWireTransferListPage
import com.increase.api.models.InboundWireTransferListParams
import com.increase.api.models.InboundWireTransferRetrieveParams

class InboundWireTransferServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InboundWireTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InboundWireTransfer> =
        jsonHandler<InboundWireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Inbound Wire Transfer */
    override fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundWireTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_wire_transfers", params.getPathParam(0))
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

    private val listHandler: Handler<InboundWireTransferListPage.Response> =
        jsonHandler<InboundWireTransferListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Inbound Wire Transfers */
    override fun list(
        params: InboundWireTransferListParams,
        requestOptions: RequestOptions,
    ): InboundWireTransferListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_wire_transfers")
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
            .let { InboundWireTransferListPage.of(this, params, it) }
    }
}
