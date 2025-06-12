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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransfer
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListPage
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListPageResponse
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboundRealTimePaymentsTransferServiceImpl
internal constructor(private val clientOptions: ClientOptions) :
    InboundRealTimePaymentsTransferService {

    private val withRawResponse: InboundRealTimePaymentsTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundRealTimePaymentsTransferService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundRealTimePaymentsTransferService =
        InboundRealTimePaymentsTransferServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsTransfer =
        // get /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InboundRealTimePaymentsTransferListParams,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsTransferListPage =
        // get /inbound_real_time_payments_transfers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundRealTimePaymentsTransferService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundRealTimePaymentsTransferService.WithRawResponse =
            InboundRealTimePaymentsTransferServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InboundRealTimePaymentsTransfer> =
            jsonHandler<InboundRealTimePaymentsTransfer>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: InboundRealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "inboundRealTimePaymentsTransferId",
                params.inboundRealTimePaymentsTransferId().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_real_time_payments_transfers", params._pathParam(0))
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

        private val listHandler: Handler<InboundRealTimePaymentsTransferListPageResponse> =
            jsonHandler<InboundRealTimePaymentsTransferListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InboundRealTimePaymentsTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsTransferListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_real_time_payments_transfers")
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
                        InboundRealTimePaymentsTransferListPage.builder()
                            .service(InboundRealTimePaymentsTransferServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
