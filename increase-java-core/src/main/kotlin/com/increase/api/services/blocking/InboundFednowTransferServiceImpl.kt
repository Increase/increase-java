// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransfer
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListPage
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListPageResponse
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListParams
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboundFednowTransferServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InboundFednowTransferService {

    private val withRawResponse: InboundFednowTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundFednowTransferService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundFednowTransferService =
        InboundFednowTransferServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: InboundFednowTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundFednowTransfer =
        // get /inbound_fednow_transfers/{inbound_fednow_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InboundFednowTransferListParams,
        requestOptions: RequestOptions,
    ): InboundFednowTransferListPage =
        // get /inbound_fednow_transfers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundFednowTransferService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundFednowTransferService.WithRawResponse =
            InboundFednowTransferServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InboundFednowTransfer> =
            jsonHandler<InboundFednowTransfer>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InboundFednowTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundFednowTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundFednowTransferId", params.inboundFednowTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_fednow_transfers", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<InboundFednowTransferListPageResponse> =
            jsonHandler<InboundFednowTransferListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InboundFednowTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundFednowTransferListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_fednow_transfers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InboundFednowTransferListPage.builder()
                            .service(InboundFednowTransferServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
