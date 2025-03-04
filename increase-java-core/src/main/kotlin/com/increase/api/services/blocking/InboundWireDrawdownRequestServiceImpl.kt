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
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.models.InboundWireDrawdownRequestListPage
import com.increase.api.models.InboundWireDrawdownRequestListParams
import com.increase.api.models.InboundWireDrawdownRequestRetrieveParams

class InboundWireDrawdownRequestServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InboundWireDrawdownRequestService {

    private val withRawResponse: InboundWireDrawdownRequestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundWireDrawdownRequestService.WithRawResponse =
        withRawResponse

    override fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundWireDrawdownRequest =
        // get /inbound_wire_drawdown_requests/{inbound_wire_drawdown_request_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InboundWireDrawdownRequestListParams,
        requestOptions: RequestOptions,
    ): InboundWireDrawdownRequestListPage =
        // get /inbound_wire_drawdown_requests
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundWireDrawdownRequestService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<InboundWireDrawdownRequest> =
            jsonHandler<InboundWireDrawdownRequest>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireDrawdownRequest> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_wire_drawdown_requests", params.getPathParam(0))
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

        private val listHandler: Handler<InboundWireDrawdownRequestListPage.Response> =
            jsonHandler<InboundWireDrawdownRequestListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InboundWireDrawdownRequestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireDrawdownRequestListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_wire_drawdown_requests")
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
                        InboundWireDrawdownRequestListPage.of(
                            InboundWireDrawdownRequestServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
