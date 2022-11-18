package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.models.InboundWireDrawdownRequestListPage
import com.increase.api.models.InboundWireDrawdownRequestListParams
import com.increase.api.models.InboundWireDrawdownRequestRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class InboundWireDrawdownRequestServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : InboundWireDrawdownRequestService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InboundWireDrawdownRequest> =
        jsonHandler<InboundWireDrawdownRequest>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve an Inbound Wire Drawdown Request */
    override fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions
    ): InboundWireDrawdownRequest {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_wire_drawdown_requests", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<InboundWireDrawdownRequestListPage.Response> =
        jsonHandler<InboundWireDrawdownRequestListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Inbound Wire Drawdown Requests */
    override fun list(
        params: InboundWireDrawdownRequestListParams,
        requestOptions: RequestOptions
    ): InboundWireDrawdownRequestListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_wire_drawdown_requests")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { InboundWireDrawdownRequestListPage.of(this, params, it) }
        }
    }
}
