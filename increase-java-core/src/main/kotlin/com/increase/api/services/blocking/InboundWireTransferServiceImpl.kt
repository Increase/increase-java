// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.inboundwiretransfers.InboundWireTransfer
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListPage
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListPageResponse
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferRetrieveParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferReverseParams
import kotlin.jvm.optionals.getOrNull

class InboundWireTransferServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InboundWireTransferService {

    private val withRawResponse: InboundWireTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundWireTransferService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundWireTransfer =
        // get /inbound_wire_transfers/{inbound_wire_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InboundWireTransferListParams,
        requestOptions: RequestOptions,
    ): InboundWireTransferListPage =
        // get /inbound_wire_transfers
        withRawResponse().list(params, requestOptions).parse()

    override fun reverse(
        params: InboundWireTransferReverseParams,
        requestOptions: RequestOptions,
    ): InboundWireTransfer =
        // post /inbound_wire_transfers/{inbound_wire_transfer_id}/reverse
        withRawResponse().reverse(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundWireTransferService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<InboundWireTransfer> =
            jsonHandler<InboundWireTransfer>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: InboundWireTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundWireTransferId", params.inboundWireTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_wire_transfers", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<InboundWireTransferListPageResponse> =
            jsonHandler<InboundWireTransferListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InboundWireTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireTransferListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_wire_transfers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InboundWireTransferListPage.builder()
                            .service(InboundWireTransferServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val reverseHandler: Handler<InboundWireTransfer> =
            jsonHandler<InboundWireTransfer>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun reverse(
            params: InboundWireTransferReverseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundWireTransferId", params.inboundWireTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("inbound_wire_transfers", params._pathParam(0), "reverse")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { reverseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
