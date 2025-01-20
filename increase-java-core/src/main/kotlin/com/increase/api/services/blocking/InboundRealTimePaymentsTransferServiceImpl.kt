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
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundRealTimePaymentsTransfer
import com.increase.api.models.InboundRealTimePaymentsTransferListPage
import com.increase.api.models.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.InboundRealTimePaymentsTransferRetrieveParams

class InboundRealTimePaymentsTransferServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : InboundRealTimePaymentsTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InboundRealTimePaymentsTransfer> =
        jsonHandler<InboundRealTimePaymentsTransfer>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve an Inbound Real-Time Payments Transfer */
    override fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions
    ): InboundRealTimePaymentsTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_real_time_payments_transfers", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<InboundRealTimePaymentsTransferListPage.Response> =
        jsonHandler<InboundRealTimePaymentsTransferListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Inbound Real-Time Payments Transfers */
    override fun list(
        params: InboundRealTimePaymentsTransferListParams,
        requestOptions: RequestOptions
    ): InboundRealTimePaymentsTransferListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_real_time_payments_transfers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { InboundRealTimePaymentsTransferListPage.of(this, params, it) }
        }
    }
}
