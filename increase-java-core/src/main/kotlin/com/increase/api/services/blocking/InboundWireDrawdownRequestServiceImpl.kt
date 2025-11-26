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
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListParams
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListResponse
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboundWireDrawdownRequestServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InboundWireDrawdownRequestService {

    private val withRawResponse: InboundWireDrawdownRequestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundWireDrawdownRequestService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundWireDrawdownRequestService =
        InboundWireDrawdownRequestServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundWireDrawdownRequest =
        // get /inbound_wire_drawdown_requests/{inbound_wire_drawdown_request_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InboundWireDrawdownRequestListParams,
        requestOptions: RequestOptions,
    ): InboundWireDrawdownRequestListResponse =
        // get /inbound_wire_drawdown_requests
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundWireDrawdownRequestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundWireDrawdownRequestService.WithRawResponse =
            InboundWireDrawdownRequestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InboundWireDrawdownRequest> =
            jsonHandler<InboundWireDrawdownRequest>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireDrawdownRequest> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "inboundWireDrawdownRequestId",
                params.inboundWireDrawdownRequestId().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_wire_drawdown_requests", params._pathParam(0))
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

        private val listHandler: Handler<InboundWireDrawdownRequestListResponse> =
            jsonHandler<InboundWireDrawdownRequestListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InboundWireDrawdownRequestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireDrawdownRequestListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_wire_drawdown_requests")
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
            }
        }
    }
}
